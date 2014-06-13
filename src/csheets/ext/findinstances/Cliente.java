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
import javax.swing.JOptionPane;

/**
 *
 * @author RafaelChaves
 */
public class Cliente extends Thread {

    boolean running = true;
    DatagramSocket socket;

    // Creates the socket with the port n 9876 and listen to every menssage sent to his ip
    public Cliente() throws BindException {
        try {
            socket = new DatagramSocket(9876,InetAddress.getByName("0.0.0.0"));
            socket.setBroadcast(true);
        } catch (SocketException ex1) {
            JOptionPane.showMessageDialog(null, "Error: Client already running");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public void run() {
       boolean received=false;
        while (running) {
            try {
                socket.setSoTimeout(0);
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
                // sets a 10sec timeout
                socket.setSoTimeout(10000);

                while (!received) {
                    try {
                        socket.receive(receivePacket);
                        System.out.println("Recebi sucesso do serv");
                        received = true;
                        running= false;
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
    }

    public void stopRunning() {
        running = false;
        socket.close();
    }
}
