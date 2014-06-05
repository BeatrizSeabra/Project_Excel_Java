package csheets.ext.share.ui;

import csheets.core.Cell;
import csheets.ext.share.ExtensionShare;
import csheets.ext.share.ui.*;
import java.awt.event.ActionEvent;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;

/**
 * An action of the share extension that creates a new Server.
 * 
 * @author Júlia Dias
 */
public class ServerAction extends FocusOwnerAction{
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

    protected void defineProperties() {//no properties
    }

    /**
     * The share action that
     *creates a new @see ServerUI
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {

        Cell area[][]=super.focusOwner.getSelectedCells();
        
        ServerUI server=new ServerUI(super.focusOwner,uiController);
        server.run();
        
    }
}
