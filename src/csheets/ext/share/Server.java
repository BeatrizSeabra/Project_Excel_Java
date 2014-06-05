package csheets.ext.share;

import csheets.core.Address;
import csheets.core.Cell;
import csheets.core.Spreadsheet;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import csheets.ui.ctrl.FocusOwnerAction;

/**
 * this class creates and manages a shared area.
 *
 * @author Júlia Dias
 */
public class Server extends BaseConnection implements Runnable {

    private String nome;//name of the connection
    private ServerSocket serverSocket;
    private Socket sessionSocket;
    boolean estado=false;

    private ObjectInputStream input;

    public Server(String nome, int port, Address inicio, Address fim, Spreadsheet folha) {
        super(folha, port, inicio, fim);
        this.nome = nome;
    }

    @Override
    public void run() {

        //ligacao ao servidor
        try {
            serverSocket = new ServerSocket(getPort());

        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            sessionSocket = serverSocket.accept();
            System.out.println("Conexion Established!");
            estado = true;

        } catch (IOException e) {
            System.out.println(e);
        }

        while (estado=true) {//enquanto estiver ligado
            //input
            try {
            //buscar cells
                //por no obj input

                input = new ObjectInputStream(sessionSocket.getInputStream());
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        //close the conexion
        try {
            input.close();
            sessionSocket.close();//fecha socket
            serverSocket.close();//fecha server socket
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Socket getsessionSocket() {
        return sessionSocket;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Socket sessionSocket) {
        this.sessionSocket = sessionSocket;
    }

    /**
     * @return the ois
     */
    public ObjectInputStream getInput() {
        return input;
    }

    /**
     * @param ois the ois to set
     */
    public void setInput(ObjectInputStream input) {
        this.input = input;
    }

}
