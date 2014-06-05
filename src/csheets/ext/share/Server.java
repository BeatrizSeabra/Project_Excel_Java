package csheets.ext.share;

import csheets.core.Address;
import csheets.core.Spreadsheet;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *this class creates and manages a shared area.
 * 
 * @author  Rui 1110506
 */

public class Server extends BaseConnection implements Runnable{
    
    private String nome;//name of the connection
    private ServerSocket serverSocket;
    private ObjectOutputStream oos;
    
    public Server(String nome, int port, Address inicio, Address fim, Spreadsheet folha) {
        super(folha, port, inicio, fim);
        this.nome = nome;
    }
    
     public ObjectOutputStream getOos() {
            return oos;
        }
    
    @Override
    public void run() {
        try {
            /**
             * Ligação ao servidor
             */
            serverSocket = new ServerSocket(getPort());

            System.out.println("MultipleSocketServer Initialized");

            while (true) {//enquanto servidor estiver ligado
               
               Socket connection = serverSocket.accept();
//               TratarCliente client = new TratarCliente(connection);
//                Thread thread = new Thread(client);
//                thread.start();
             
            getReceberDataServer().add(false);
               String ok = new String("ok");
                    getOos().writeObject(ok);
                    threadOut = new Thread(new Out(oos));
                    threadOut.start();
                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (e.getMessage().equals("Address already in use: JVM_Bind")) {
                JOptionPane.showMessageDialog(null, "Address already in use");
            }
        }
    }

    /*@Override
    public void stop(int cod) {
        try {
            ((Client) clientesModel.get(cod)).stop();
        } catch (ArrayIndexOutOfBoundsException e) {
            if (cod > 0) {
                cod--;
                stop(cod);
            }


        }
    }

    /**
     * Pára a Partilha e desliga todos os clientes ligados á mesma
     */
    /*public void stopServer() {
        for (int i = 0; i < clientesModel.size(); i++) {
            ((TratarCliente) clientesModel.get(i)).stop();

        }
        try {
            serverSocket.close();
            Thread.currentThread().interrupt();
            DesativShareLimits();
            return;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 
    /**
     * Pausa a partilha, esquanto o estado for <code>false<code> o seridor 
     * não aceita novos clientes, continuando com as suas operações com os conectados
     * 
     */
    /*public void pauseServer() {
        estado = false;
    }

    /**
     * Retoma a aceitar novos clientes
     */
    /*public void resumeServer() {
        estado = true;
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

 
/**
     * Classe responsável por comumicar com um determinado cliente, cada cliente
     * connectado uma partilha tem a sua instância de "TratarCliente"
     */
    public class TratarCliente implements Runnable {

        private Socket con;
        private ObjectInputStream ois;
        private ObjectOutputStream oos;

        public TratarCliente(Socket con) {
            this.con = con;
            getReceberDataServer().add(false);

        }

        public void stop() {
            try {
                con.close();
                if (threadIn != null) {
                    threadIn.interrupt();
                }
                threadOut.interrupt();
                
                Thread.currentThread().interrupt();
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {

            try {
                
//                setOis(new ObjectInputStream(getCon().getInputStream()));
//                setOos(new ObjectOutputStream(getCon().getOutputStream()));
//                String resposta = (String) getOis().readObject();

               // if (resposta != null) {
                    String ok = new String("ok");
                    getOos().writeObject(ok);

                    //criar threads
                    threadOut = new Thread(new Out(oos));
                    threadOut.start();

                //} else {//se nao for entregue
//                    String erro = new String("Error");
//                    oos.writeObject(erro);
                //}
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * @return the con
         */
        public Socket getCon() {
            return con;
        }

        /**
         * @param con the con to set
         */
        public void setCon(Socket con) {
            this.con = con;
        }

        /**
         * @return the ois
         */
        public ObjectInputStream getOis() {
            return ois;
        }

        /**
         * @param ois the ois to set
         */
        public void setOis(ObjectInputStream ois) {
            this.ois = ois;
        }

        /**
         * @return the oos
         */
        public ObjectOutputStream getOos() {
            return oos;
        }

        /**
         * @param oos the oos to set
         */
        public void setOos(ObjectOutputStream oos) {
            this.oos = oos;
        }
    }
    
}
