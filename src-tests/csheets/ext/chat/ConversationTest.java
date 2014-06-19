/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
/**
 *
 * @author 1121228 Fabio Carvalho
 */
public class ConversationTest {
    @Test public void addIP(){
        Conversation p= new Conversation("Teste");
        p.addIP("192.168.1.1");
        assertTrue(!p.getIps().contains("192.168.1.2"));
        assertTrue(p.getIps().contains("192.168.1.1"));
    }
    @Test public void removeIP(){
        Conversation p= new Conversation("Teste");
        p.addIP("192.168.1.1");
        p.addIP("192.168.1.2");
        p.addIP("192.168.1.3");
        assertTrue(!p.getIps().contains("192.168.1.5"));
        assertTrue(p.getIps().contains("192.168.1.1"));
        p.removeIP("192.168.1.1");
        assertTrue(!p.getIps().contains("192.168.1.1"));
    }
}
