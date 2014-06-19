/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.findinstances;

import java.awt.Frame;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author RafaelChaves
 */
public class Servidor {
    
    
    public static ArrayList<InetAddress> Srv() throws IOException {

        //ArrayList with the information of every ip address that respondes
        ArrayList<InetAddress> ips = new ArrayList();

        DatagramSocket socket = new DatagramSocket(9877);
        InetAddress IPAddress = InetAddress.getByName("0.0.0.0");
        
        // Look for every network interface to see the broadcast address
        Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface networkInterface = (NetworkInterface) interfaces.nextElement();

            if (networkInterface.isLoopback() || !networkInterface.isUp()) {
                continue;
            }

            for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                InetAddress broadcast = interfaceAddress.getBroadcast();
                if (broadcast == null) {
                }
                try {
//	        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, broadcast, 9876);
//	        socket.send(sendPacket);
                System.out.println("Broadcast enviado!");
	      } catch (Exception e) {
	      }
                
            }
        }
        //sets a 10sec timeout for the responses
        socket.setSoTimeout(10000); 
        byte[] receiveData = new byte[1024];
        boolean timeout = false;
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        //while it doesnt timeout it tries to read as many responses as it can
        while (!timeout) {
            try {
                socket.receive(receivePacket);
                InetAddress a = receivePacket.getAddress();
                if (!ips.contains(a)) {
                    ips.add(a);
                }
                receiveData = new byte[1024];
                String resp = "Recebi";
                byte[] msgr = resp.getBytes();
                DatagramPacket sendPacket2 = new DatagramPacket(msgr, msgr.length, receivePacket.getAddress(), 9876);
                socket.send(sendPacket2);
                System.out.println("Enviei sucesso");
                receiveData = new byte[1024];

            } catch (SocketTimeoutException ex) {
                timeout = true;
            }
        }
        socket.close();
        return ips;
    }
}
