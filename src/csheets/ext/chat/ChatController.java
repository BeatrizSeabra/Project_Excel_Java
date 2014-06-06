/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat;

import csheets.ext.chat.ui.Chat;
import csheets.ext.chat.ui.UIChat;
import csheets.ext.connection.Connection;
import csheets.ext.connection.Server;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 *
 * @author i121228
 */
public class ChatController {

    
    
    private ArrayList<String> connections;
    private ArrayList<Chat> chats;
    private Server servidor;
    private int porta=30347;
    private UIChat UI;
 /**
     * empty constructor
     */
    
    public ChatController() {
        chats= new ArrayList();
        connections= new ArrayList();
    }
    /**
     * construtor
     */
    public ChatController(UIChat sp) {
        chats= new ArrayList();
        connections= new ArrayList();
        UI=sp;
        servidor= new Server(porta) {

            @Override
            public void handleMessage(byte[] data, InetAddress address, int port) {
                 boolean existe=false;
                for(String con: connections){
                    if(con.equals(address)){
                        existe=true;
                    }
                }
                if(!existe){
                    newChat(address.getHostAddress());
                }
                String file_string = "";
                for(int i = 0; i < data.length; i++)
                {
                    file_string += (char)data[i];
                }
             refreshChat(address.getHostAddress(), file_string);
            }
        };
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }
    
     /**
     * get Chats UI
     */
    public ArrayList<Chat> getChats() {
        return chats;
    }
    /**
     * get ip list
     */
    public ArrayList<String> getConnections() {
        return connections;
    }
    /**
     * set Arraylist of connections
     */
    public void setConnections(ArrayList<String> connections) {
        this.connections = connections;
    }
    /**
     * get UI
     */
    public UIChat getUI() {
        return UI;
    }
    /**
     * set UI
     */
    public void setUI(UIChat UI) {
        this.UI = UI;
    }
    
    /**
     * cria um novo chat
     * */
    public void newChat(String ip){
       if(!existe(ip)){
       connections.add(ip);
       Chat p= new Chat(ip, this);
       p.setVisible(true);
       getChats().add(p);
       UI.refreshChatList(listConnections());
       }else{
           setvisible(ip);
       }
    }
    /**
     * reabre chat
     * */
    public void setvisible(String ip){
         for(Chat con: getChats()){
            if(con.getIp().equals(ip)){
                con.setVisible(true);
            }        
         }
        
    }
    /**
     * retorna os ips com que houve troca de mensagem
     */
    public String[] listConnections(){
        String[] ret= new String[connections.size()];
        int cont=0;
         for(String con: connections){
            ret[cont]=con;
            cont++; 
         }
        return ret;
    }
    /**
     * Verifica se existe um ip na lista
     * */
    public boolean existe(String ip){
        for(String con: connections){
            if(con.equals(ip)){
                return true;
            }        
         }
        return false;
    }
    /**
     * construtor
     */
    public void refreshChat(String ip, String data){
        for(Chat chat: getChats()){
            if(chat.getIp().equals(ip)){
                chat.addMensagem(ip, data);
                chat.setVisible(true);
            }
        }
    }
    /**
     
     */
    public void sendMessage(String ip, String data) throws UnknownHostException{
         boolean existe=false;
         for(String con: connections){
                    if(con.equals(ip)){
                        existe=true;
                        servidor.sendData(data.getBytes(Charset.forName("UTF-8")),con,porta);
                    }
         }
         if(!existe){
             connections.add(ip);
         }
    }
    /**
     
     */
    public void deactivating(){
        for(Chat con: getChats()){
                con.dispose();
         }
        getChats().clear();
        connections.clear();
        try{
            servidor.allDone=true;
        }catch(SecurityException ape){

        }
    }
    /**
     * @return the servidor
     */
    public Server getServidor() {
        return servidor;
    }

    /**
     * @return the porta
     */
    public int getPorta() {
        return porta;
    }
    
    
    
}
