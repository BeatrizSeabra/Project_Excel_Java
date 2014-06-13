package csheets.ext.findinstances.ui;

import csheets.ext.findinstances.Cliente;
import java.awt.event.ActionEvent;


import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.net.BindException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RafaelChaves
 */
public class StartClientAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;
    protected Cliente c;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public StartClientAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Start Client Thread";
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
        try {
            c = new Cliente();
            c.startRunning();
            c.start();
        } catch (BindException e) {
            JOptionPane.showMessageDialog(null, "Error: Client already running");
        }

    }
}
