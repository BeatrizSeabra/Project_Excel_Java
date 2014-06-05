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
 * Classe responsável pela conexão a um ponto de partilha
 *
 * @author Júlia Dias
 */
public class Client extends BaseConnection implements Runnable {

    private String ip;
    private ObjectOutputStream output;
    
    private Socket clientSocket;
    boolean estado=false;

    /**
     * Cria um novo cliente para uma partilha previamente defenida
     *
     * @param port
     * @param folha_actual
     * @param addres //cells
     * @param ip
     */
    public Client(int port, Spreadsheet folha_actual, Address address, String ip) {
        super(folha_actual, port, address, null);
        this.ip = ip;
    }

    //@Override
    public void run() {
        try {
            InetAddress addressip = InetAddress.getByName(getIp());
            clientSocket = new Socket(addressip, getPort());

            System.out.println("SocketClient CONNECT");
        } catch (IOException f) {
            System.out.println(f);
        }
        
        //output
        try {
            output = new ObjectOutputStream(clientSocket.getOutputStream());

        } catch (IOException e) {
            System.out.println(e);
        }

        //close the conexion
        try {
            output.close();
            clientSocket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return the oos
     */
    public ObjectOutputStream getOutputStream() {
        return output;
    }

    /**
     * @param oos the oos to set
     */
    public void ObjectOutputStream(ObjectOutputStream output) {
        this.output = output;
    }


    /**
     * @return the con
     */
    public Socket getClientSocket() {
        return clientSocket;
    }

    /**
     * @param con the con to set
     */
    public void setClientSocket(Socket clientSocket) {
        this.clientSocket= clientSocket;
    }
}
