package csheets.ext.share.ui;

import csheets.core.Cell;
import csheets.ui.ctrl.FocusOwnerAction;
import java.awt.event.ActionEvent;


import csheets.ui.ctrl.UIController;

/**
 * An action of the share extension that exemplifies how to interact with the
 * spreadsheet.
 *
 * @author Rui 1110506
 */
public class ServerAction extends FocusOwnerAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public ServerAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Server";
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

        Cell area[][] = super.focusOwner.getSelectedCells();
        
       ServerUI server = new ServerUI(super.focusOwner, uiController);
       server.run();
       
    }

}
