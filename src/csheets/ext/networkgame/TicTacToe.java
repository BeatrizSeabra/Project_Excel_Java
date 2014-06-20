/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.networkgame;

import csheets.ext.connection.Server;
import csheets.ext.networkgame.ui.TicTacToeUI;
import java.net.InetAddress;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PedroRosário
 */
public class TicTacToe extends Game {

    public boolean isServer;

    public TicTacToe(String name, List<Player> players, Server s, InetAddress address) {
        super(name, players, s, address);
    }

    @Override
    public void init(boolean isServer) {
        this.isServer = isServer;
    }

    @Override
    public void start() {
        NetworkGameController.mainWindow.dispose();
        NetworkGameController.initJFrame("Tic Tac Toe");
        NetworkGameController.mainWindow.add(new TicTacToeUI(this));
        NetworkGameController.packJFrame();
    }

    @Override
    public void handleData(byte[] dados) {
        String file_string = "";
        for (int i = 0; i < dados.length; i++) {
            file_string += (char) dados[i];
        }
        if (file_string.charAt(2) == 'X') {
            switch (file_string.charAt(3)) {
                case '1':
                    TicTacToeUI.jButton1.setText("X");
                    break;
                case '2':
                    TicTacToeUI.jButton2.setText("X");
                    break;
                case '3':
                    TicTacToeUI.jButton3.setText("X");
                    break;
                case '4':
                    TicTacToeUI.jButton4.setText("X");
                    break;
                case '5':
                    TicTacToeUI.jButton5.setText("X");
                    break;
                case '6':
                    TicTacToeUI.jButton6.setText("X");

                    break;
                case '7':
                    TicTacToeUI.jButton7.setText("X");
                    break;

                case '8':
                    TicTacToeUI.jButton8.setText("X");
                    break;
                case '9':
                    TicTacToeUI.jButton9.setText("X");
                    break;

            }
        } else if (file_string.charAt(2) == 'O') {
            switch (file_string.charAt(3)) {
                case '1':
                    TicTacToeUI.jButton1.setText("O");
                    break;
                case '2':
                    TicTacToeUI.jButton2.setText("O");
                    break;
                case '3':
                    TicTacToeUI.jButton3.setText("O");
                    break;
                case '4':
                    TicTacToeUI.jButton4.setText("O");
                    break;
                case '5':
                    TicTacToeUI.jButton5.setText("O");
                    break;
                case '6':
                    TicTacToeUI.jButton6.setText("O");

                    break;
                case '7':
                    TicTacToeUI.jButton7.setText("O");
                    break;

                case '8':
                    TicTacToeUI.jButton8.setText("O");
                    break;
                case '9':
                    TicTacToeUI.jButton9.setText("O");
                    break;

            }

        }else if(file_string.charAt(2)=='W'){
            if(file_string.charAt(3)=='X'){
                JOptionPane.showMessageDialog(null, "Player X Won!", "Winner", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null, "Player O Won!", "Winner", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else if(file_string.charAt(2)=='W'){
            JOptionPane.showMessageDialog(null, "Tie!", "Winner", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
