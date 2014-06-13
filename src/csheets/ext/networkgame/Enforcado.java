/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.networkgame;

import csheets.ext.connection.Server;
import csheets.ext.networkgame.ui.EnforcadoUI;
import csheets.ext.networkgame.ui.ResultUI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Enforcado extends Game {

    public ArrayList<String> dictionary;
    public int wordIndex = 0;
    public ArrayList<Boolean> discovered = new ArrayList<Boolean>();
    public String message = "";
    public String atempts = null;
    public int strikes = 0;
    public boolean isServer;

    public Enforcado(String name, List<Player> players, Server s, InetAddress address) {
        super(name, players, s, address);
    }

    @Override
    public void init(boolean isServer) {
        this.isServer = isServer;
        dictionary = load("./src/META-INF/dicionary.txt");
        if (this.isServer) {
            //pick a new word
            wordIndex = getRanInt(dictionary.size());

            //send it to the other player
            try {
                message = "GM" + "W" + wordIndex;
                this.s.sendData(message.getBytes(), this.address.getHostName(), 7777);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Enforcado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        for (int i = 0; i < dictionary.get(wordIndex).length(); i++) {
            discovered.add(false);
        }

        //mark spaces as discovered
        for (int i = 0; i < dictionary.get(wordIndex).length(); i++) {
            if (dictionary.get(wordIndex).charAt(i) == ' ') {
                discovered.set(i, true);
            }
        }
    }

    @Override
    public void start() {
        NetworkGameController.mainWindow.dispose();
        NetworkGameController.initJFrame("Enforcado");
        NetworkGameController.mainWindow.add(new EnforcadoUI(this));
        NetworkGameController.packJFrame();
    }

    @Override
    public void handleData(byte[] dados) {
        String file_string = "";
        for (int i = 0; i < dados.length; i++) {
            file_string += (char) dados[i];
        }
        if (file_string.charAt(2) == 'W') {                       //Word Index
            wordIndex = Integer.parseInt(file_string.substring(3, file_string.length() - 1));
        } else if (file_string.charAt(2) == 'A') {                  //atempt
            if (atempts == null) {
                atempts = file_string.substring(3, file_string.length() - 1);
            } else {
                atempts += " " + file_string.substring(3, file_string.length() - 1);
            }
        } else if (file_string.charAt(2) == 'E') {
            if (file_string.charAt(3) == 'W') {
                NetworkGameController.mainWindow.dispose();
                NetworkGameController.initJFrame("Results");
                NetworkGameController.mainWindow.add(new ResultUI("You Win"));
                NetworkGameController.packJFrame();
            } else {
                NetworkGameController.mainWindow.dispose();
                NetworkGameController.initJFrame("Results");
                NetworkGameController.mainWindow.add(new ResultUI("You Loose"));
                NetworkGameController.packJFrame();
            }
            if (isServer) {
                int result = JOptionPane.showConfirmDialog(null, "Another Round?");
                String message = "GM" + "R";
                if (result == JOptionPane.YES_OPTION) {
                    try {
                        message += "Y";
                        s.sendData(message.getBytes(), address.getHostName(), 7777);
                    } catch (UnknownHostException ex) {
                        Logger.getLogger(Enforcado.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    NetworkGameController.mainWindow.dispose();
                    NetworkGameController.initJFrame("Enforcado");
                    NetworkGameController.mainWindow.add(new EnforcadoUI(this));
                    NetworkGameController.packJFrame();
                } else {
                    try {
                        message += "N";
                        s.sendData(message.getBytes(), address.getHostName(), 7777);
                    } catch (UnknownHostException ex) {
                        Logger.getLogger(Enforcado.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    NetworkGameController.s.allDone = true;
                    NetworkGameController.mainWindow.dispose();
                }
            }
        } else if (file_string.charAt(2) == 'R') {
            if (file_string.charAt(3) == 'Y') {
                NetworkGameController.mainWindow.dispose();
                NetworkGameController.initJFrame("Enforcado");
                NetworkGameController.mainWindow.add(new EnforcadoUI(this));
                NetworkGameController.packJFrame();

            } else {
                NetworkGameController.s.allDone = true;
                NetworkGameController.mainWindow.dispose();
            }
        }
    }

    public ArrayList<String> load(String filename) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Enforcado.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> lines = new ArrayList<String>();
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException ex) {
            Logger.getLogger(Enforcado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lines;
    }

    private int getRanInt(int size) {
        return (int) (Math.random() * size);
    }
}
////game logic here
//    String message = "Sending to: " + address + "GM" + "Player " + players.get(0).name + " wins";
//
//    
//        try {
//            s.sendData(message.getBytes(), address.getHostName(), 7777);
//        System.out.println(message);
//    }
//    catch (UnknownHostException ex
//
//    
//        ) {
//            Logger.getLogger(GameExample.class.getName()).log(Level.SEVERE, null, ex);
//    }
//
//}
//
//@Override
//        public void handleData(byte[] dados) {
//        String s = "";
//        for (int i = 2; i < dados.length; i++) {
//            s += (char) dados[i];
//        }
//        lbl = new JLabel(s);
//        System.out.println("Recebido de "+ address.toString() +": "+s);
