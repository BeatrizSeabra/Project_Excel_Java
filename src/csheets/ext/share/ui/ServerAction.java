package csheets.ext.share.ui;

import csheets.ext.share.ExtensionShare;
import java.awt.event.ActionEvent;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;
import javax.swing.ImageIcon;

/**
 * An action of the share extension that creates a new Server.
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

    protected String getName() {//Server Option
        return "Server";
    }

    protected void defineProperties() {
          putValue(SMALL_ICON, new ImageIcon(ExtensionShare.class.getResource("res/img/server.png")));
    }

    /**
     * The share action that creates a new @see ServerUI
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {
        ServerUI server = new ServerUI(super.focusOwner, uiController);
        server.run();

    }
}
