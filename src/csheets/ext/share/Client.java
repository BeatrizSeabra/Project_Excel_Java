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
 * @author  Rui 1110506
 */
public class Client extends BaseConnection implements Runnable {

    private String ip;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private Socket con;

    /**
     * Cria um novo cliente para uma partilha previamente defenida
     *
     * @param port
     * @param folha_actual
     * @param addres
     * @param ip
     */
    public Client(int port, Spreadsheet folha_actual, Address address, String ip) {
        super(folha_actual, port, address, null);
        this.ip = ip;
    }

    /**
     * Interronpe a partilha
     */
    @Override
    /*public void stop(int cod) {
        manager.stopClientConnection(this);
    }

    /**
     * Pára a conecção com uma partilha
     */
   /* public void stopClient() {
        try {
            threadIn.interrupt();
            if (threadOut != null) {
                threadOut.interrupt();
            }
            con.close();
            DesativShareLimits();
            Thread.currentThread().interrupt();
            return;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
    //@Override
    public void run() {
        try {
            InetAddress addressip = InetAddress.getByName(getIp());
            con = new Socket(addressip, getPort());

            System.out.println("SocketClient CONNECT");

            //receber resposta
            setOis(new ObjectInputStream(getCon().getInputStream()));
            try {
                String resposta = (String) getOis().readObject();
                if (resposta.contains("ok")) {
                    
                    //criar as threads
                    threadIn = new Thread(new In(ois));
                    threadIn.start();


                }
            } catch (ClassNotFoundException ex) {
                System.err.println(" > data received in unknown format ");
            }

        } catch (IOException f) {
            System.out.println("IOException: " + f.getMessage());
            JOptionPane.showMessageDialog(null, "Server not found");
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
    public ObjectOutputStream getOos() {
        return oos;
    }

    /**
     * @param oos the oos to set
     */
    public void setOos(ObjectOutputStream oos) {
        this.oos = oos;
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
}
