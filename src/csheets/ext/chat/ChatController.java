/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.chat;

import csheets.ext.chat.ui.Chat;
import csheets.ext.chat.ui.UIChat;
import csheets.ext.connection.Server;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author i121228
 */
public class ChatController {

    private ArrayList<Conversation> conversas;
    private ArrayList<String> connections;
    private ArrayList<Chat> chats;
    private Server servidor;
    private int porta = 30347;
    private UIChat UI;
    private UDPClient cliente;

    /**
     * empty constructor
     */
    public ChatController() {
        chats = new ArrayList();
        connections = new ArrayList();
        conversas = new ArrayList();
    }

    /**
     * construtor
     */
    public ChatController(UIChat sp) {
        chats = new ArrayList();
        connections = new ArrayList();
        conversas = new ArrayList();
        UI = sp;
        servidor = new Server(porta) {

            @Override
            public void handleMessage(byte[] data, InetAddress address, int port) {
                boolean existe = false;
                int tipo;

                String file_string = "";
                for (int i = 1; i < data.length; i++) {
                    file_string += (char) data[i];
                }
                String aux = "";
                aux += (char) data[0];
                tipo = Integer.parseInt(aux);

                switch (tipo) {
                    case 0:
                        //1 é mensagem individual
                        for (String con : connections) {
                            if (con.equals(address)) {
                                existe = true;
                            }
                        }
                        if (!existe) {
                            newChat(address.getHostAddress());
                        }
                        refreshChat(address.getHostAddress(), file_string);
                        break;
                    case 1:
                        //0 é mensagem para conversa
                        String id;
                        id = file_string.substring(0, 10);
                        refreshConversation(address.getHostAddress(), id.trim(), file_string.substring(10));
                        break;
                    case 2:
                        // Alguém criou uma conversa
                        String[] ips = file_string.split(";");
                        if (createConversation(ips[0].trim())) {//se falso é porque a conversa ja tinha sido adicionada
                           addToConversation(ips[0], address.getHostAddress());
                            for (int i = 1; i < ips.length-1; i++) {
                               try {
                                   if(!ips[i].equals(InetAddress.getLocalHost().getHostAddress()))
                                       addToConversation(ips[0], ips[i]);
                               } catch (UnknownHostException ex) {
                                   Logger.getLogger(ChatController.class.getName()).log(Level.SEVERE, null, ex);
                               }
                            }
                        }
                        break;
                }
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
     *
     * @param ip
     */
    public void newChat(String ip) {
        if (!existe(ip)) {
            connections.add(ip);
            Chat p = new Chat(ip, "ind", this);
            getChats().add(p);
            UI.refreshChatList(listConnections());
        } else {
            setvisible(ip);
        }
    }

    /**
     * reabre chat
     *
     */
    public void setvisible(String ip) {
        for (Chat con : getChats()) {
            if (con.getIp().equals(ip)) {
                con.setVisible(true);
            }
        }

    }

    /**
     * @return retorna os ips com que houve troca de mensagem
     */
    public String[] listConnections() {
        String[] ret = new String[chats.size()];
        int cont = 0;
        for (Chat con : chats) {
            ret[cont] = con.getIp();
            cont++;
        }
        return ret;
    }

    /**
     * Verifica se existe um ip na lista
     *
     */
    public boolean existe(String ip) {
        for (String con : connections) {
            if (con.equals(ip)) {
                return true;
            }
        }
        return false;
    }

    /**
     * construtor
     */
    public void refreshChat(String ip, String data) {
        for (Chat chat : getChats()) {
            if (chat.getIp().equals(ip)) {
                chat.addMensagem(ip, data);
                chat.setVisible(true);
            }
        }
    }

    /**
     *
     */
    public void sendMessage(String ip, String data) throws UnknownHostException {
        boolean existe = false;
        String aux = "0";
        for (String con : connections) {
            if (con.equals(ip)) {
                existe = true;
                aux += data;
                servidor.sendData(aux.getBytes(Charset.forName("UTF-8")), con, porta);
            }
        }
        if (!existe) {
            connections.add(ip);
        }
    }

    /**
     *
     */
    public void deactivating() {
        for (Chat con : getChats()) {
            con.dispose();
        }
        getChats().clear();
        connections.clear();
        try {
            servidor.allDone = true;
        } catch (SecurityException ape) {

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

    public boolean createConversation(String ID) {
        for (Conversation conv : conversas) {
            if (conv.getID().equals(ID)) {
                return false;
            }
        }
        conversas.add(new Conversation(ID));
        Chat p = new Chat(ID, "conv", this);
        getChats().add(p);
        return true;
    }

    public boolean addToConversation(String ID, String IP) {
        for (Conversation conv : conversas) {
            if (conv.getID().equals(ID)) {
                conv.addIP(IP);
                return true;
            }
        }
        return false;
    }

    public boolean sendConversation(String id) throws UnknownHostException {
        String mensagem = "";
        for (Conversation conv : conversas) {
            if (conv.getID().equals(id)) {

                mensagem += "2";
                mensagem += conv.getID() + ";";
                for (String ips : conv.getIps()) {
                    mensagem += ips + ";";
                }
            }
        }
        for (Conversation conv : conversas) {
            if (conv.getID().equals(id)) {
                for (String ips : conv.getIps()) {
                    servidor.sendData(mensagem.getBytes(Charset.forName("UTF-8")), ips, porta);
                }
            }
        }
        return false;
    }

    public void refreshConversation(String ip, String id, String data) {
        for (Chat chat : getChats()) {
            if (chat.getIp().equals(id)) {
                chat.addMensagem(ip, data);
                chat.setVisible(true);
            }
        }
    }

    public boolean sendMessageConversation(String id, String message) throws UnknownHostException {
        String mensagem = "";
        for (Conversation conv : conversas) {
            if (conv.getID().equals(id)) {

                mensagem += 1;
                mensagem += conv.getID();
                for (int i = 0; i < (10 - conv.getID().length()); i++) {
                    mensagem += " ";
                }
                mensagem += message;
                for (String ips : conv.getIps()) {
                    servidor.sendData(mensagem.getBytes(Charset.forName("UTF-8")), ips, porta);
                }
                return true;
            }

        }

        return false;
    }
}
