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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
* @author 1120588
 * @author 1121228
 * @author 1110506
 */
public abstract class Server {
    private DatagramSocket socket;
    private int port;

    public Server( int port) {
        try {
            this.socket = new DatagramSocket();
            //TODO adicionar verificação à porta
            this.port = port;
        } catch (SocketException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        Boolean existe=false;
        while (true) {
            existe=false;
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            try {
                socket.receive(packet);
            } catch (IOException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
                    handleMessage(data, packet.getAddress(), packet.getPort());
        }
    }
    
     public abstract void handleMessage(byte[] data, InetAddress address, int port);
}
