/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.networkgame;

import csheets.ext.connection.Server;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class GameExample extends Game{

    public GameExample(String name, List<Player> players, Server s,InetAddress address) {
        super(name, players, s, address);
    }
    
    
    @Override
    public void init() {
        //set up some variables
        this.name = name;
        this.players = players;
    }

    @Override
    public void start() {
        //game logic here
        String message = "GM"+"Player " + players.get(0).name + " wins";
        System.out.println(message);
        try {
            s.sendData(message.getBytes(), address.getHostName(), 7777);
        } catch (UnknownHostException ex) {
            Logger.getLogger(GameExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void handleData(byte[] dados) {
        String s = "";
        for (int i = 2; i < dados.length; i++) {
            s += (char) dados[i];
        }
        System.out.println("Recebido de "+ address.toString() +": "+s);
    }
    
    
}
