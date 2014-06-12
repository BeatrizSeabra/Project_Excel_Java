/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.share;

import csheets.core.Address;
import csheets.core.Spreadsheet;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela connecção a um ponto de partilha
 *
 * @author Rui 1110506 and Marc
 */
public class Client extends BaseConnection implements Runnable {

    private String ip;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private Socket con;

    public Client(String pass, int port, Spreadsheet folha_actual, Address addres, String ip) {
        super(pass, folha_actual, port, addres, null);
        this.ip = ip;
    }

    
     //Pára a conecção com uma partilha
    
    public void stopClient() {
        try {
            threadIn.interrupt();
            if (threadOut != null) {
                threadOut.interrupt();
            }
            con.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            InetAddress addressip = InetAddress.getByName(getIp());
            con = new Socket(addressip, getPort());

            //enviar a password
            setOos(new ObjectOutputStream(getCon().getOutputStream()));

            //password
            Object obj = encryptor(getPassword());
            getOos().writeObject(obj);

            //receber resposta
            setOis(new ObjectInputStream(getCon().getInputStream()));
            try {
                String resposta = (String) decrypt(getOis().readObject());
               
                    //criar as thread
                    threadIn = new Thread(new BaseConnection.In(ois));
                    threadIn.start();
                    threadOut = new Thread(new BaseConnection.Out(oos));
                    threadOut.start();
                                
            } catch (ClassNotFoundException ex) {
                System.err.println("Error");
            }
        } catch (IOException f) {
            System.out.println("IOException: " + f.getMessage());
            JOptionPane.showMessageDialog(null, "Server not found");
        }
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public ObjectOutputStream getOos() {
        return oos;
    }

    public void setOos(ObjectOutputStream oos) {
        this.oos = oos;
    }

    public ObjectInputStream getOis() {
        return ois;
    }

    public void setOis(ObjectInputStream ois) {
        this.ois = ois;
    }

    public Socket getCon() {
        return con;
    }

    public void setCon(Socket con) {
        this.con = con;
    }
}
