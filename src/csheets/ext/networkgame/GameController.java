/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.networkgame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class GameController {

    Game game;
    List<Player> players = new ArrayList();
    
    public GameController(Game game, List<Player> players) {
        this.game = game;
        this.game.init("Exeplo", players);
        this.game.start();
    }
}
