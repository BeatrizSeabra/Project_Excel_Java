/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat;

import csheets.ext.chat.ui.Chat;
import csheets.ext.connection.Connection;
import java.net.InetAddress;
import java.util.ArrayList;

/**
 *
 * @author i121228
 */
public class ChatController {
    
    private ArrayList<Connection> chats;

    public ChatController() {
        chats= new ArrayList();
    }
    
    public void newChat(String ip, int porta){
        chats.add(new Connection(ip, porta) {
            public void handleMessage(byte[] data, InetAddress address, int port) {
                
            }
        });
    }
    
    
    
}
