package csheets.ext.share;

import csheets.core.Address;
import csheets.core.Cell;
import csheets.core.CellListener;
import csheets.core.Spreadsheet;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import org.jasypt.util.binary.BasicBinaryEncryptor;

/**
 * Super classe que qualquer ligação, controla os dados de entrada e os de
 * saida. (Client / Server)
 *
 * @author Rui 1110506 and Marc and Oleg 1120622
 */
public abstract class BaseConnection {

    private String password;
    private Spreadsheet folha;
    private int port;
    private Address inicio;
    private Address fim;
    private boolean receberData;
    private BasicBinaryEncryptor binaryEncryptor;
    public Thread threadIn;
    public Thread threadOut;
    public MultiShare multiShare;
    private Color randomColor;
    private boolean read_only;

    public BaseConnection(String password, Spreadsheet folha, int port, Address inicio, Address fim) {
        this.folha = folha;
        this.port = port;
        this.inicio = inicio;
        this.fim = fim;
        this.password = password;
        this.receberData = false;
        this.multiShare = MultiShare.getShares();
        binaryEncryptor = new BasicBinaryEncryptor();
        binaryEncryptor.setPassword(password);
        //gerar cor aleatoria para o nome das ligações
        Random randomGenerator = new Random();
        randomColor = new Color(randomGenerator.nextInt(255),
                randomGenerator.nextInt(255),
                randomGenerator.nextInt(255));
    }
    
    public Object encryptor(Object obj) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(out);
            os.writeObject(obj);
            byte[] bites = out.toByteArray();
            byte[] encrypt = binaryEncryptor.encrypt(bites);
            return (Object) new ByteObject(encrypt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object decrypt(Object obj) {
        try {
            byte[] bites = ((ByteObject) obj).bytes;
            byte[] plainBytes = binaryEncryptor.decrypt(bites);
            ByteArrayInputStream in = new ByteArrayInputStream(plainBytes);
            ObjectInputStream is = new ObjectInputStream(in);
            return is.readObject();
        } catch (Exception e) {
            return null;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Spreadsheet getFolha() {
        return folha;
    }

    public void setFolha(Spreadsheet folha) {
        this.folha = folha;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Address getInicio() {
        return inicio;
    }

    public void setInicio(Address inicio) {
        this.inicio = inicio;
    }
    public Address getFim() {
        return fim;
    }

    public void setFim(Address fim) {
        if (this.fim == null) {
            this.fim = fim;  
        } else {
            this.fim = fim;
        }
    }
    
    public Color getRandomColor() {
        return randomColor;
    }

    public void setRandomColor(Color randomColor) {
        this.randomColor = randomColor;
    }
 
    public boolean isRead_only() {
        return read_only;
    }

    
    public void setRead_only(boolean read_only) {
        this.read_only = read_only;
    }
    
    public MultiShare getMultiShare() {
        return multiShare;
    }
    
    public void setMultiShare(MultiShare multiShare) {
        this.multiShare = multiShare;
    }

    public boolean isReceberData() {
            return receberData;
    }


    public void setReceberData(boolean receberData) {
            this.receberData = receberData; 
    }

    public class In implements Runnable {

        private ObjectInputStream ois;

        public In(ObjectInputStream ois) {
            this.ois = ois;
            
        }

        @Override
        public void run() {
            try {

                while (true) {
                    synchronized (ois) {
                        Object recv = decrypt(ois.readObject());
                        try {
                            String[][] share = (String[][]) recv;
                            toSpreedsheet(share);
                            setFim(new Address(getInicio().getColumn() + share[0].length - 1, getInicio().getRow() + share.length - 1));
                        } catch (Exception e) {
                        }
                    }

                }
            } catch (Exception e) {
            }
        }
        
        private void toSpreedsheet(String[][] share) {
            setReceberData(true);
            for (int i = 0; i < share.length; i++) {
                for (int j = 0; j < share[0].length; j++) {
                    try {
                        folha.getCell(getInicio().getColumn() + j, getInicio().getRow() + i).setContent(share[i][j]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            setReceberData(false);
        }
    }

    public class Out implements Runnable, CellListener {

        private ObjectOutputStream oos;
        private Object obj = new String("obj");

        public Out(ObjectOutputStream oos) {
            this.oos = oos;
            folha.addCellListener(this);
        }

        @Override
        public void run() {
            try {
                while (true) {
                    if (getFim() != null) {
                        synchronized (getObj()) {
                            getOos().writeObject(encryptor(getCells()));
                            getOos().flush();
                        }
                    }
                    synchronized (obj) {
                        obj.wait();
                    }
                }
            } catch (Exception e) {
            }
        }

        private String[][] getCells() {
            String[][] matriz = new String[getFim().getRow() - getInicio().getRow() + 1][getFim().getColumn() - getInicio().getColumn() + 1];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = folha.getCell(getInicio().getColumn() + j, getInicio().getRow() + i).getContent();
                }
            }
            return matriz;
        }

        @Override
        public void valueChanged(Cell cell) {
            if (isReceberData() == true) {
                return;
            }
            if (cell.getAddress().getColumn() >= getInicio().getColumn() && cell.getAddress().getRow() >= getInicio().getRow()) {
                if (cell.getAddress().getColumn() <= getFim().getColumn() && cell.getAddress().getRow() <= getFim().getRow()) {
                    synchronized (getObj()) {
                        getObj().notifyAll();
                    }
                }
            }
        }

        @Override
        public void contentChanged(Cell cell) {
        }

        @Override
        public void dependentsChanged(Cell cell) {
        }

        @Override
        public void cellCleared(Cell cell) {
        }

        @Override
        public void cellCopied(Cell cell, Cell source) {
        }

        public ObjectOutputStream getOos() {
            return oos;
        }

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }
    }
}