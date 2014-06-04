package csheets.ext.share.ui;

import java.awt.event.ActionEvent;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;

/**
 * An action of the share extension that exemplifies how to interact with the
 * spreadsheet.
 *
 * @author Rui 1110506
 */
public class ClientAction extends FocusOwnerAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public ClientAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Client";
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
       ClientUI client = new ClientUI(uiController.getActiveSpreadsheet(), super.focusOwner.getSelectedCell().getAddress(), focusOwner);
       client.run();
    }
}
