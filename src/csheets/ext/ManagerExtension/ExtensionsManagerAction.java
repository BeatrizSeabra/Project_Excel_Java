/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.ManagerExtension;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;

/**
 *
 * @author Oleg
 */
public class ExtensionsManagerAction extends BaseAction{
        
    
	/** The user interface controller */
	protected UIController uiController;
        protected JMenu menu;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
         * @param menu the extension menu
	 */
	public ExtensionsManagerAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Extension manager";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a new UI.
	 * @param event the event that was fired
	 */       
	public void actionPerformed(ActionEvent event) {
            ExtensionsManagerWindow l= new ExtensionsManagerWindow(uiController);
            l.setSize(500,510);
            l.setResizable(false);
            l.setLocationRelativeTo(null);
            l.setVisible(true);
	}
        
	

	protected boolean requiresModification() {
		return true;
	}
    
}
