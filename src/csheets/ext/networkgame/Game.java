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
    public Server s;
    public InetAddress address;
    
    public Game(String name, List<Player> players, Server s, InetAddress address){
        this.s = s;
        this.name = name;
        this.players = players;
        this.address = address;
    }
    
    public abstract void init(boolean isServer);
    
    public abstract void start();
    
    public abstract void handleData(byte[] dados);
    
    public String getName(){
        return this.name;
    }
}
