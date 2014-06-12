/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findinstances;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RafaelChaves
 */
public class Cliente extends Thread{
    boolean running =true;
    DatagramSocket socket;
    
    public Cliente()
    {
        try{
         socket = new DatagramSocket(9876); 
        } catch (SocketException ex1) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }
    public void run(){

        boolean received = false;
        
        while(running)                
        {
            try{
            
            socket.setReuseAddress(true);
            byte[] receiveData = new byte[1024];                 
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);                   
            socket.receive(receivePacket);                  
            System.out.println("Recebi Broadcast");                   
            InetAddress IPAddress = receivePacket.getAddress();                
            String resp = "Eu";                
            byte[] sendData = resp.getBytes();                   
            DatagramPacket sendPacket =                   
                    new DatagramPacket(sendData, sendData.length, IPAddress, 9877);                   
            socket.send(sendPacket);

            socket.setSoTimeout(10000);

                while (!received) {
                    try {
                        socket.receive(receivePacket);
                        System.out.println("Recebi sucesso do serv");
                        received = true;
                        running = false;
                    } catch (SocketTimeoutException ex) {
                        System.out.println("A tentar enviar outra vez o ip");
                        receivePacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9877);
                        socket.send(receivePacket);
                    }
                }
            
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void startRunning() {
        running = true;
        start();
    }

    public void stopRunning() {
        running = false;
    }
    
}
