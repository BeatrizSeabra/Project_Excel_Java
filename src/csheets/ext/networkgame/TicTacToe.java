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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
