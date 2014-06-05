/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.extensionsmanager.ui;

import csheets.CleanSheets;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Oleg
 */
public class ExtensionsManagerAction extends BaseAction {
    
    /** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public ExtensionsManagerAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Extensions Manager";
	}

	protected void defineProperties() {
            putValue(SMALL_ICON, new ImageIcon(CleanSheets.class.getResource("res/img/toolbar.gif")));
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
	public void actionPerformed(ActionEvent event) {
                
		
		try {
                        ExtensionsManagerWindow emw = new ExtensionsManagerWindow();
                        emw.setVisible(true);
                        emw.setSize(500, 350);
                        emw.setResizable(true);
                        emw.setLocationRelativeTo(null);
		} catch (Exception ex) {
			// para ja ignoramos a excepcao
                }
	}
    
}
