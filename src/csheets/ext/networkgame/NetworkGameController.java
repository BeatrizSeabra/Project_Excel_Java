/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.networkgame;

import csheets.ext.connection.Server;
import csheets.ext.networkgame.ui.ClientPanel;
import csheets.ext.networkgame.ui.GameChoserPanel;
import csheets.ext.networkgame.ui.ServerPanel;
import java.awt.Point;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class NetworkGameController {

    public static JFrame mainWindow;
    public static boolean connected = false;
    public static Player profile = new Player("Player 1");
    public static List<Player> players = new ArrayList();
    public static List<Game> games = new ArrayList();
    public static Server s;
    public static GameController gc;

    public NetworkGameController() {
        
        //start server in port: 7777
        s = new Server(7777) {

            @Override
            public void handleMessage(byte[] data, InetAddress address, int port) {
                String file_string = "";
                for (int i = 0; i < data.length; i++) {
                    file_string += (char) data[i];
                }
                if (file_string.contains("CN")) {                       //CN Connection
                    mainWindow.dispose();
                    initJFrame("Players Found");
                    addGames(address);
                    mainWindow.add(new GameChoserPanel(games, data, s, address));
                    packJFrame();
                } else if (file_string.contains("GS")) {                                        //GS game selected response  
                    addGames(address);
                    int game = parseGame(data);
                    players.add(parsePlayer(data));
                    if (players.size() == 1) {
                        profile = new Player("Player 2");
                        players.add(profile);
                    }
                    gc = new GameController(games.get(game), players, s, address);
                    System.out.println("GC init");
                } else if (file_string.contains("GM")) {                                        //GM GAme message
                    gc.recieve(data);
                }

                //System.out.println("Recivied " + data.toString().toString());
            }
        };
        int result = JOptionPane.showConfirmDialog(null, "Run a server?");

        if (result == JOptionPane.YES_OPTION) {
            s.start();
            initJFrame("Looking For players...");
            mainWindow.add(new ServerPanel());
            players.add(profile);
            packJFrame();
        } else {
            initJFrame("Looking For players...");
            mainWindow.add(new ClientPanel(s, profile.name));
            packJFrame();
        }

    }

    public static void initJFrame(String title) {
        mainWindow = new JFrame(title);
        mainWindow.setSize(800, 600);
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainWindow.setLocation(new Point(600, 400));
    }

    public static void packJFrame() {
        mainWindow.pack();
        mainWindow.setVisible(true);
    }

    public static int parseGame(byte[] data) {
         String s = "";
        for (int i = 2; i < 3; i++) {
            s += (char) data[i];
        }
        
        return Integer.parseInt(s);
    }

    public static Player parsePlayer(byte[] data) {
        Player p;
        String s = "";
        for (int i = 3; i < data.length; i++) {
            s += (char) data[i];
        }

        p = new Player(s);

        return p;
    }

    public static void addGames(InetAddress address){
        games.add(new GameExample("Example", players, s, address));
    }
}
