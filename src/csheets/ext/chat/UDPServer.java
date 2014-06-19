package csheets.ext.chat;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPServer extends Thread {

    private static ArrayList<String> listParticipants = new ArrayList<String>();
    private static UDPServer instance = null;
    private DatagramSocket socket;
    private ChatController controlo;


    private int port = 2001;

    public UDPServer(ChatController control) throws SocketException {
        this.controlo= control;
        socket = new DatagramSocket(port);
        socket.setBroadcast(true);
    }

    public void run() {
        try {
            while (true) {
                /**
                 * System.out.println(getClass().getName() + " is ready to
                 * receive broadcast packets!"); byte[] receiveData = new
                 * byte[1024]; DatagramPacket receivePacket = new
                 * DatagramPacket(receiveData, receiveData.length);
                 * socket.receive(receivePacket); String message = new
                 * String(receiveData); System.out.println(getClass().getName()
                 * + " Discovery packet received from: " +
                 * receivePacket.getAddress().getHostAddress() + " Packet
                 * received: " + message);
                 *
                 * String response =
                 * receivePacket.getAddress().getHostAddress();
                 * if(!response.equals(receivePacket.getAddress().getHostAddress())){
                 * byte[] sendData = response.getBytes(); DatagramPacket
                 * sendPacket = new DatagramPacket(sendData, sendData.length,
                 * receivePacket.getAddress(), receivePacket.getPort());
                 * socket.send(sendPacket);
                 * System.out.println(getClass().getName() + " Sent packet to: "
                 * + sendPacket.getAddress().getHostAddress());
                 */
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String message = new String(receiveData).trim();
                if (message.equals("pedido")) {
                    String response = InetAddress.getLocalHost().getHostAddress();
                    byte[] sendData = response.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
                            receivePacket.getAddress(), port);
                    socket.send(sendPacket);
                } else {
                    if (!listParticipants.contains(message)&& !message.equals(InetAddress.getLocalHost().getHostAddress())) {
                        listParticipants.add(message);
                        controlo.newChat(message);
                    }

                }
            }
        } catch (SocketException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
