/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.connection;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
* @author 1120588
 * @author 1121228
 * @author 1110506
 */
public abstract class Server extends Thread {
    private DatagramSocket socket;
    private int port;
    public boolean allDone=false;

    public Server(int port) {
        try {
            this.socket = new DatagramSocket(port);
            //TODO adicionar verificação à porta
            this.port = port;
        } catch (SocketException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        boolean recebeu,ler;
        while (true) {
            recebeu=false;
            ler=true;
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            try {
                socket.receive(packet);
                recebeu=true;
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
             while(allDone){
                ler=false;
            }
                
            if(recebeu && ler){
                handleMessage(data, packet.getAddress(), packet.getPort());
            }
               
        }
    }
    
    public void sendData(byte[] data,String address, int port) throws UnknownHostException {
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName(address), port);
        try {
            socket.send(packet);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public abstract void handleMessage(byte[] data, InetAddress address, int port);
}
