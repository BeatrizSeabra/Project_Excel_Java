/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.networkgame.ui;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Miguel
 */
public class HangmanPanel extends JPanel {

    int strikes = 0;

    public HangmanPanel(int i) {
        strikes = i;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawLine(350, 0, 350, 500);
        g.drawLine(450, 350, 600, 350);
        g.drawLine(600, 350, 600, 100);
        g.drawLine(600, 100, 500, 100);
        g.drawLine(500, 100, 500, 150);
        g.drawOval(475, 150, 50, 50);
        switch (strikes) {
            case 3:
                g.drawLine(500, 250, 475, 275);
                g.drawLine(500, 250, 525, 275);
            case 2:
                g.drawLine(500, 225, 475, 225);
                g.drawLine(500, 225, 525, 225);
            case 1:
                g.drawLine(500, 200, 500, 250);
            case 0:
                break;
        }
    }
}
