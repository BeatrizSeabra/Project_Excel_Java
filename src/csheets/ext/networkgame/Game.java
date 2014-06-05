/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.networkgame;

import java.util.List;

/**
 *
 * @author Miguel
 */
public abstract class Game {
    
    protected String name;
    protected List<Player> players;
    
    public abstract void init(String name, List<Player> players);
    
    public abstract void start();
    
    public String getName(){
        return this.name;
    }
}
