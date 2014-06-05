package csheets.ext.share;

import csheets.core.Address;
import csheets.core.Cell;
import csheets.core.CellListener;
import csheets.core.Spreadsheet;
import csheets.ext.style.StylableCell;
import csheets.ext.style.StyleExtension;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 * Super classe que qualquer ligação, independente de ser do tipo
 * "Client" ou "Server" controla os dados de entrada e os de saida. 
 *
 * @author Júlia Dias
 */
public abstract class BaseConnection {

    private Spreadsheet folha;
    private int port;
    private Address inicio;//cell inicio
    private Address fim;//cell fim
    private boolean receberData;
    private ArrayList<Boolean> receberDataServer;
    public Thread threadIn;
    public Thread threadOut;

    
    public BaseConnection(Spreadsheet folha, int port, Address inicio, Address fim) {
     
        this.folha = folha;
        this.port = port;
        this.inicio = inicio;
        this.fim = fim;

        this.receberData = false;
        this.receberDataServer = new ArrayList<Boolean>();
        
    }

    /**
     * Metodo para fazer @Override nas suas subclasses
     * @param cod 
    */
    public void stop(int cod) {
    }
    
    /**
     * @return the folha
     */
    public Spreadsheet getFolha() {
        return folha;
    }

    /**
     * @param folha the folha to set
     */
    public void setFolha(Spreadsheet folha) {
        this.folha = folha;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return the inicio
     */
    public Address getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Address inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fim
     */
    public Address getFim() {
        return fim;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(Address fim) {
        if (this.fim == null) {
            this.fim = fim;
            
        } else {
            this.fim = fim;
        }
    }


    /**
     * @param cod_client
     * @return
     */
    public boolean isReceberData(int cod_client) {
        if (cod_client == -1) {
            return receberData;
        }
        return getReceberDataServer().get(cod_client);
    }

    /**
     *
     */
    public void setReceberData(boolean receberData, int cod_client) {
        if (cod_client == -1) {
            this.receberData = receberData;
        } else {
            this.getReceberDataServer().add(cod_client, receberData);
        }
    }

    /**
     * @return the receberDataServer
     */
    public ArrayList<Boolean> getReceberDataServer() {
        return receberDataServer;
    }

    /**
     * @param receberDataServer the receberDataServer to set
     */
    public void setReceberDataServer(ArrayList<Boolean> receberDataServer) {
        this.receberDataServer = receberDataServer;
    }

    /**
     * Class responsável pelo tratamento de todos os dados de entrada
     */
    public class In implements Runnable {

        private ObjectInputStream ois;
        private int cod_client;

        public In(ObjectInputStream ois) {
            this.ois = ois;
            cod_client = -1;
        }

        public In(ObjectInputStream ois, int cod) {
            this.ois = ois;
            cod_client = cod;
        }

        @Override
        public void run() {
            try {

                while (true) {
                    synchronized (ois) {
                        Object recv=ois.readObject();
                        
                        try {
                               //vai buscar inicio e fim da selecao das celulas
                            String[][] share = (String[][]) recv;
                            toSpreedsheet(share);
                            setFim(new Address(getInicio().getColumn() + share[0].length - 1, getInicio().getRow() + share.length - 1));
                        } catch (Exception e) {
                        }
                    }

                }

            } catch (Exception e) {
                stop(cod_client);
            }

        }

        /**
         * exporta para a @see Spreedsheet os dados recebidos
         * @param share 
         */
        private void toSpreedsheet(String[][] share) {
            setReceberData(true, cod_client);
            for (int i = 0; i < share.length; i++) {
                for (int j = 0; j < share[0].length; j++) {
                    try {
                        folha.getCell(getInicio().getColumn() + j, getInicio().getRow() + i).setContent(share[i][j]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            setReceberData(false, cod_client);
        }
    }

    /**
     * Classe responsavel pelos controlo de actividade das celulas pertencentes
     * a area partilhada
     *
     * @see CellListener, controla todos os dados de saida da ligação
     */
    public class Out implements Runnable {

        private ObjectOutputStream oos;
        private Object obj = new String("obj");
        private int cod_client;

        public Out(ObjectOutputStream oos) {
            this.oos = oos;
            cod_client = -1;
            
        }

        public Out(ObjectOutputStream oos, int cod) {
            this.oos = oos;
            cod_client = cod;
           
        }

        @Override
        public void run() {
            try {

                while (true) {
                    if (getFim() != null) {
                        synchronized (getObj()) {
                            getOos().writeObject(getCells());
                            getOos().flush();
                        }

                    }
                    synchronized (obj) {
                        obj.wait();
                    }

                }

            } catch (Exception e) {
                //e.printStackTrace();
            }

        }

        /**
         * retorna uma matriz de @see Cell 
         * @return 
         */
        private String[][] getCells() {
            String[][] matriz = new String[getFim().getRow() - getInicio().getRow() + 1][getFim().getColumn() - getInicio().getColumn() + 1];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = folha.getCell(getInicio().getColumn() + j, getInicio().getRow() + i).getContent();
                }

            }
            return matriz;
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
         * @return the obj
         */
        public Object getObj() {
            return obj;
        }

        /**
         * @param obj the obj to set
         */
        public void setObj(Object obj) {
            this.obj = obj;
        }
    }
}
