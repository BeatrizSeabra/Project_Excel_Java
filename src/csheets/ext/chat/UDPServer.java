
package csheets.ext.chat;

import java.io.*; 
import java.net.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class UDPServer extends Thread {
    
    private static UDPServer instance = null;
    
    public static synchronized UDPServer getInstance() {
        if(instance == null) {
            return new UDPServer();                    
        }
        return instance;
    }
    
    private int port = 2001;

    private UDPServer() {
        
    }
    
    public void run() {
        try {
            DatagramSocket socket = new DatagramSocket(port);
            socket.setBroadcast(true);
            while(true) {
                System.out.println(getClass().getName() + " is ready to receive broadcast packets!");
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = 
                        new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String message = new String(receiveData);
                System.out.println(getClass().getName() + " Discovery packet received from: "
                        + receivePacket.getAddress().getHostAddress() + " Packet received: " + message);
                                
                String response = receivePacket.getAddress().getHostAddress();
                byte[] sendData = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
                        receivePacket.getAddress(), receivePacket.getPort());
                socket.send(sendPacket);
                System.out.println(getClass().getName() + " Sent packet to: " + sendPacket.getAddress().getHostAddress());
            }   
        } catch (SocketException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}  
