/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.networkgame;

import csheets.ext.connection.Server;
import csheets.ext.networkgame.ui.GameChoserPanel;
import csheets.ext.networkgame.ui.ServerPanel;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Miguel
 */
public class NetworkGameController {

    public static JFrame mainWindow;
    public static boolean connected = false;
    public static List<Game> games = new ArrayList();

    public NetworkGameController() {

        //start server in port: 7777
        Server s = new Server(7777) {

            @Override
            public void handleMessage(byte[] data, InetAddress address, int port) {
                initJFrame();
                mainWindow.add(new GameChoserPanel(games, data));
                packJFrame();

                //System.out.println("Recivied " + data.toString().toString());
            }
        };
        s.start();

        initJFrame();
        mainWindow.add(new ServerPanel());
        packJFrame();

    }

    void initJFrame() {
        mainWindow = new JFrame("Looking For players...");
        mainWindow.setSize(800, 600);
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    void packJFrame() {
        mainWindow.pack();
        mainWindow.setVisible(true);
    }
}
