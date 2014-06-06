package csheets.ext.share.ui;

import csheets.ext.share.ExtensionShare;
import java.awt.event.ActionEvent;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;
import javax.swing.ImageIcon;

/**
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
        putValue(SMALL_ICON, new ImageIcon(ExtensionShare.class.getResource("res/img/client.png")));
    }

    /**
     * A share action that creates a new Client
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {

        ClientUI client = new ClientUI(uiController.getActiveSpreadsheet(), super.focusOwner.getSelectedCell().getAddress(), focusOwner);
        client.run();
    }

}
