/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.findinstances;

import csheets.core.Spreadsheet;
import csheets.core.Workbook;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
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

    private static UIController uiController = null;
    boolean running = true;
    DatagramSocket socket;
    private static int untitled = 1;

    // Creates the socket with the port n 9876 and listen to every menssage sent to his ip
    public Cliente(UIController uiController) throws BindException {

        this.uiController = uiController;

        try {
            socket = new DatagramSocket(9876, InetAddress.getByName("0.0.0.0"));
            socket.setBroadcast(true);
        } catch (SocketException ex1) {
            JOptionPane.showMessageDialog(null, "Error: Client already running");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getInfoString() {
        String res = "";

        //ir buscar informaçao: uiController
        Workbook[] books = uiController.getApp().getWorkbooks();
        for (Workbook book : books) {
            if (uiController.getApp().getFile(book) == null) {
                res += "Untitled " + untitled + ";";
                untitled++;
                System.out.println("um untitled found");
            } else {
                res += uiController.getApp().getFile(book).getName() + ";";
                System.out.println("ficheiro found");
            }
        }
        res += "|";
        UIExtension[] extensions = uiController.getExtensions();
        for (UIExtension extension : extensions) {
            res += extension.getExtension().getName() + ";";
            System.out.println("extensao found");
        }

        //retorna lista de workbooks abertos e extensoes
        return res;
    }

    public void run() {
        boolean received = false;
        while (running) {
            try {
                sleep(2000);
                socket = new DatagramSocket();
                socket.setBroadcast(true);
                InetAddress IPAddress = InetAddress.getByName("255.255.255.255");
                String resp = getInfoString();
                System.out.println(resp);
                byte[] sendData = resp.getBytes();
                int i=0, n=1, j;
                double dtgs;
                while(i<sendData.length){
                    byte[] dataBlock;
                    dtgs=sendData.length/497;
                    if(dtgs<1){
                        dtgs=1;
                    }
                    dataBlock=(uiController.getUniqueID()+"'"+n+"'"+(int)dtgs+"'").getBytes();
                    byte[] temp=new byte[512];
                    System.out.println(dataBlock.length);
                    for(j=0; j<dataBlock.length; j++){
                        temp[j]=dataBlock[j];
                    }
                    for(j=dataBlock.length;i<sendData.length && j<512;j++){
                        temp[j]=sendData[i];
                        i++;
                    }
                    DatagramPacket sendPacket
                        = new DatagramPacket(temp, temp.length, IPAddress, 9877);
                    socket.send(sendPacket);
                    System.out.println("enviei um datagrama");
                    n++;
                }

            } catch (Exception ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        socket.close();
    }

    public void startRunning() {
        running = true;
    }

    public void stopRunning() {
        running = false;
        socket.close();
    }
}
