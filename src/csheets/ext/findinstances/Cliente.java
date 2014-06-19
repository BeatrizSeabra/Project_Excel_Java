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
            } else {
                res += uiController.getApp().getFile(book).getName() + ";";
            }
        }
        res += "|";
        UIExtension[] extensions = uiController.getExtensions();
        for (UIExtension extension : extensions) {
            res += extension.toString() + ";";
        }

        //retorna lista de workbooks abertos e extensoes
        return res;
    }

    public void run() {
        boolean received = false;
        while (running) {
            try {
                sleep(2000);
                socket = new DatagramSocket(9877);
                socket.setBroadcast(true);
                InetAddress IPAddress = InetAddress.getByName("255.255.255.255");
                String resp = getInfoString();
                byte[] sendData = resp.getBytes();
                int i=0, n=1;
                while(i<sendData.length){
                    byte[] dataBlock;
                    dataBlock=(uiController.getUniqueID()+"'"+n+"'"+Math.ceil(sendData.length/497.0)+"'").getBytes();
                    for(int j=dataBlock.length;i<sendData.length && j<512;j++){
                        dataBlock[j]=sendData[i];
                        i++;
                    }
                    DatagramPacket sendPacket
                        = new DatagramPacket(dataBlock, dataBlock.length, IPAddress, 9877);
                    socket.send(sendPacket);
                    n++;
                }

            } catch (Exception ex) {
//                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
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
