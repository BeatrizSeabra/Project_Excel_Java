/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.networkgame;

import csheets.ext.connection.Server;
import java.net.InetAddress;
import java.util.List;

/**
 *
 * @author Miguel
 */
public abstract class Game {
    
    protected String name;
    protected List<Player> players;
    protected Server s;
    protected InetAddress address;
    
    public Game(String name, List<Player> players, Server s, InetAddress address){
        this.s = s;
        this.name = name;
        this.players = players;
        this.address = address;
        init();
    }
    
    public abstract void init();
    
    public abstract void start();
    
    public abstract void handleData(byte[] dados);
    
    public String getName(){
        return this.name;
    }
}
