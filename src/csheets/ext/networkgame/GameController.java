/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.networkgame;

import csheets.ext.connection.Server;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class GameController {

    Game game;
    List<Player> players = new ArrayList();
    Server s;
    boolean isServer;
    InetAddress address;
    
    
    public GameController(Game game, List<Player> players, Server s, InetAddress address, boolean isServer) {
        this.game = game;
        this.s = s;
        this.isServer = isServer;
        this.address = address;
        this.game.init(isServer);
        this.game.start();
    }

    void recieve(byte[] data) {
        game.handleData(data);
    }
}
