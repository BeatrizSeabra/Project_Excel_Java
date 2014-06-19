/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat;

import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author i121228 Fabio Carvalho
 */
public class ChatControllerTest {
     @Test public void TestlistConnections(){
         ArrayList<String> ip= new ArrayList();
         ip.add("192.168.10.1");
         ip.add("192.168.10.2");
         String[] lista= {"192.168.10.1","192.168.10.2"};
         ChatController c= new ChatController();
         c.setConnections(ip);
         assertTrue(!lista.equals(c.listConnections()));
     }
     @Test public void existe(){
         ArrayList<String> ip= new ArrayList();
         ip.add("192.168.10.1");
         ip.add("192.168.10.2");
         ChatController c= new ChatController();
         c.setConnections(ip);
         assertTrue(c.existe("192.168.10.1"));
         assertTrue(!c.existe("192.168.10.5"));
     }
     @Test public void createConversation(){
         ArrayList<Conversation> ip= new ArrayList();
         ip.add(new Conversation("Teste1"));
         ip.add(new Conversation("Teste2"));
         ChatController c= new ChatController();
         c.setConversations(ip);
         assertTrue(!c.createConversation("Teste1"));
         assertTrue(c.createConversation("Teste3"));
     }
     
     @Test public void addToConversation(){
         
         ArrayList<Conversation> ip= new ArrayList();
         ip.add(new Conversation("Teste1"));
         ip.add(new Conversation("Teste2"));
         ChatController c= new ChatController();
         c.setConversations(ip);
         assertTrue(c.addToConversation("Teste1", "192.168.1.1"));
         assertTrue(c.addToConversation("Teste1", "192.168.1.2"));
         assertTrue(!c.addToConversation("Teste3", "192.168.1.1"));
     }
     
     @Test public void refreshConversation(){
         ChatController c= new ChatController();
         assertTrue(c.createConversation("Teste1"));
         c.refreshConversation("192.168.1.1", "Teste1", "Olá");
         assertTrue(c.getChats().get(0).isVisible());
     }
}
