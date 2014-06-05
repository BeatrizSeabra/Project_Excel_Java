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
public class GameExample extends Game{
    
    
    @Override
    public void init(String name, List<Player> players) {
        //set up some variables
        this.name = name;
        this.players = players;
    }

    @Override
    public void start() {
        //game logic here
        System.out.println("Player " + players.get(0).name + " wins");
    }
    
}
