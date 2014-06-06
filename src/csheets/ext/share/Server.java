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
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * Classe que cria uma determinada área de partilha
 *
 * @author Rui 1110506
 */
public class Server extends BaseConnection implements Runnable {

    private ServerSocket serverSocket;

    public Server(String pass, int port, Address inicio, Address fim, Spreadsheet folha) {
        super(pass, folha, port, inicio, fim);
    }

    @Override
    public void run() {
        try {
            // Ligação do servidor
            serverSocket = new ServerSocket(getPort());

            Socket connection = serverSocket.accept();

            TratarCliente client = new TratarCliente(connection);
            Thread thread = new Thread(client);
            thread.start();
//            

        } catch (Exception e) {
            if (e.getMessage().equals("Address already in use: JVM_Bind")) {
                JOptionPane.showMessageDialog(null, "Address already in use");
            }
        }
    }

    // Pára a Partilha
    public void stopServer() {
        try {
            serverSocket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Classe responsável por comumicar com o cliente
     */
    public class TratarCliente implements Runnable {

        private Socket con;
        private ObjectInputStream ois;
        private ObjectOutputStream oos;

        public TratarCliente(Socket con) {
            this.con = con;
        }

        public void stop() {
            try {
                con.close();
                if (threadIn != null) {
                    threadIn.interrupt();
                }
                threadOut.interrupt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                setOis(new ObjectInputStream(getCon().getInputStream()));
                setOos(new ObjectOutputStream(getCon().getOutputStream()));
                String resposta = (String) decrypt(getOis().readObject());
                if (resposta != null) {
                    String ok = new String("ok:");
                    getOos().writeObject(encryptor(ok));
                    threadOut = new Thread(new Out(oos));
                    threadOut.start();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public Socket getCon() {
            return con;
        }

        public ObjectInputStream getOis() {
            return ois;
        }

        public void setOis(ObjectInputStream ois) {
            this.ois = ois;
        }

        public ObjectOutputStream getOos() {
            return oos;
        }

        public void setOos(ObjectOutputStream oos) {
            this.oos = oos;
        }
    }
}
