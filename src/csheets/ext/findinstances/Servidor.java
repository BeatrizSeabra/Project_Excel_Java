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
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author RafaelChaves
 */
public class Servidor {

    /**
     *
     * @return @throws IOException
     */
    public static ArrayList<Instance> Srv() throws IOException {

        //ArrayList with the information of every ip address that respondes
        ArrayList<Instance> instances = new ArrayList();
        ArrayList<Datagrama> datagramas = new ArrayList();
        DatagramSocket socket = new DatagramSocket(9877);
        InetAddress IPAddress = InetAddress.getByName("0.0.0.0");

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

                String conteudo = new String(receiveData, Charset.defaultCharset());
                String[] content = conteudo.split("'");
                int ID = Integer.parseInt(content[0]);
                int numDatagramas = Integer.parseInt(content[2]);
                int numDtgr = Integer.parseInt(content[1]);
                if (numDatagramas == 1) {
                    instances.add(processar(a, ID, content[3]));
                    
                    System.out.println("Encontrei um solitário!!!");
                    
                } else {
                    
                    System.out.println("Esta é a parte " +numDtgr+" de "+numDatagramas);
                    
                    String[] partes = new String[numDatagramas];
                    for (Datagrama dtgr : datagramas) {
                        if (dtgr.getID() == ID) {
                            partes[dtgr.getNumDatagrama()] = dtgr.getConteudo();
                        }
                    }
                    boolean falta = false;
                    for (int i = 0; i < numDatagramas && !falta; i++) {
                        if (partes[i] == null) {
                            falta = true;
                        }
                    }
                    if (!falta) {
                        String c = "";
                        for (int i = 0; i < numDatagramas; i++) {
                            c += partes[i];
                        }
                        instances.add(processar(a, ID, c));
                        for (Datagrama dtgr : datagramas) {
                            if (dtgr.getID() == ID) {
                                datagramas.remove(dtgr);
                            }
                        }
                    } else {
                        datagramas.add(new Datagrama(ID, numDtgr, numDatagramas, content[3]));
                    }
                }
                receiveData = new byte[1024];

            } catch (SocketTimeoutException ex) {
                timeout = true;
            }
        }
        socket.close();
        return instances;
    }

    private static Instance processar(InetAddress Ip, int ID, String conteudo) {
        Instance inst = new Instance(Ip, ID);
        String[] temp = conteudo.split("|");
        if (temp.length == 2) {
            String[] wbs = temp[0].split(";");
            for (String book : wbs) {
                inst.addWorkbook(book);
            }
            String[] exts = temp[1].split(";");
            for (String ext : exts) {
                inst.addExtension(ext);
            }
        }
        if (temp.length == 1) {
            if (conteudo.startsWith("|")) {
                String[] exts = temp[0].split(";");
                for (String ext : exts) {
                    inst.addExtension(ext);
                }
            }
            else{
                String[] wbs = temp[0].split(";");
                for (String book : wbs) {
                    inst.addWorkbook(book);
                }
            }
        }
        return inst;
    }
}
