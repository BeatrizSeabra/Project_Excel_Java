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
 * @author i121228
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
}
