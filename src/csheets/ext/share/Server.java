/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.share;

import csheets.core.Address;
import csheets.core.Spreadsheet;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * Classe que cria uma determinada área de partilha
 *
 * @author Rui 1110506 and Marc
 */
public class Server extends BaseConnection implements Runnable {
    
    private ServerSocket serverSocket;

    public Server(String pass, int port, Address inicio, Address fim, Spreadsheet folha) {
        super(pass, folha, port, inicio, fim); 
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(getPort());
           
                Socket connection = serverSocket.accept();
                
                TratarCliente client = new TratarCliente(connection);
                Thread thread = new Thread(client);
                thread.start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (e.getMessage().equals("Address already in use: JVM_Bind")) {
                JOptionPane.showMessageDialog(null, "Address already in use");
            }
        }
    }

   
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
                //Espera pela password
                setOis(new ObjectInputStream(getCon().getInputStream()));
                setOos(new ObjectOutputStream(getCon().getOutputStream()));
                String resposta = (String) decrypt(getOis().readObject());

                //ver estado da partilha
                
                if (resposta != null && resposta.equals(getPassword())) {
                    String ok = new String("ok:" );
                    getOos().writeObject(encryptor(ok));
                    
                    //criar as threads
                   
                    threadIn = new Thread(new BaseConnection.In(ois));
                    threadIn.start();
                    threadOut = new Thread(new BaseConnection.Out(oos));
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
