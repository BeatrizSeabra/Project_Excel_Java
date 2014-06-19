package csheets.ext.chat;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPClient extends Thread {

    private ChatController controlo;

    private int port = 2001;
    private DatagramSocket socket;

    public UDPClient(ChatController controlo) throws SocketException {
        this.controlo = controlo;
        socket = new DatagramSocket(2000);
        socket.setBroadcast(true);
    }

    public void run() {

        while (true) {
            String message = null;
            try {
                message = "pedido";

                byte[] sendData = new byte[1024];
                sendData = message.getBytes();

                DatagramPacket sendPacket;
                sendPacket = new DatagramPacket(sendData, sendData.length,
                        InetAddress.getByName("255.255.255.255"), port);
                socket.send(sendPacket);
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
