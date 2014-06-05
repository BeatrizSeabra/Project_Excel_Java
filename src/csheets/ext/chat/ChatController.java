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
    private final ArrayList<Chat> chats;
    private final Server servidor;
    private final int porta=30347;
    private UIChat UI;

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
    public void newChat(String ip){
       if(!existe(ip)){
       connections.add(ip);
       Chat p= new Chat(ip, this);
       p.setVisible(true);
       chats.add(p);
       UI.refreshChatList(listConnections());
       }else{
           setvisible(ip);
       }
    }
    public void setvisible(String ip){
         for(Chat con: chats){
            if(con.getIp().equals(ip)){
                con.setVisible(true);
            }        
         }
        
    }
    public String[] listConnections(){
        String[] ret= new String[connections.size()];
        int cont=0;
         for(String con: connections){
            ret[cont]=con;
            cont++; 
         }
        return ret;
    }
    public boolean existe(String ip){
        for(Chat con: chats){
            if(con.getIp().equals(ip)){
                return true;
            }        
         }
        return false;
    }
    public void refreshChat(String ip, String data){
        for(Chat chat: chats){
            if(chat.getIp().equals(ip)){
                chat.addMensagem(ip, data);
                chat.setVisible(true);
            }
        }
    }
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
    public void deactivating(){
        for(Chat con: chats){
                con.dispose();
         }
        chats.clear();
        connections.clear();
        try{
            servidor.interrupt();
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
