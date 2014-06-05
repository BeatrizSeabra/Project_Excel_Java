package csheets.ext.networkgame.ui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import javax.swing.JFrame;

/**
 * An action of the simple extension that exemplifies how to interact with the
 * spreadsheet.
 *
 * @author Alexandre Braganca
 */
public class NetworkGameAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;
    public int port;
    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public NetworkGameAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Look for players...";
    }

    protected void defineProperties() {
    }

    /**
     * A simple action that presents a confirmation dialog. If the user confirms
     * then the contents of the cell A1 of the current sheet are set to the
     * string "Changed".
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {

        JFrame mainWindow = new JFrame("Looking For players...");
        mainWindow.setSize(800, 600);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int result = JOptionPane.showConfirmDialog(null, "Do you want to host a game?");

        if (result == JOptionPane.YES_OPTION) {
            //server6
            mainWindow.pack();
            mainWindow.setVisible(true);
        } else {
            //client
        }

        // Set up the player selection screen
        mainWindow.pack();
        mainWindow.setVisible(true);

    }
}
