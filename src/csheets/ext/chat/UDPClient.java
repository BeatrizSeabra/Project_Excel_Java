package csheets.ext.chat;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPClient extends Thread {

    private static UDPClient instance;
    private ChatController controlo;
    

    private int port = 2001;
    private static ArrayList<String> listParticipants = new ArrayList<String>();
    private DatagramSocket socket;

    public UDPClient(ChatController controlo) throws SocketException {
            this.controlo= controlo;
            socket = new DatagramSocket(2000);
            socket.setBroadcast(true);
    }

    public void run() {
        try {
            while(true){

            String message = InetAddress.getLocalHost().getHostName();
            byte[] sendData = new byte[1024];
            sendData = message.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
                    InetAddress.getByName("255.255.255.255"), port);
            socket.send(sendPacket);

            System.out.println(getClass().getName() + " Request packet sent to: "
                    + sendPacket.getAddress().getHostAddress());
            //Wait for a response
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            message = receivePacket.getAddress().getHostAddress();
            System.out.println(getClass().getName() + " Broadcast response from server: "
                    + message);
            
            if(!listParticipants.contains(message)){
            listParticipants.add(message);
            controlo.newChat(message);
            }
            System.out.println("ip: " + listParticipants.get(listParticipants.size()-1));
            }
            

        } catch (SocketException ex) {
            Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> getListParticipants() {
        return listParticipants;
    }
}
