/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.extensionsmanager.ui;

import csheets.ui.ctrl.UIController;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;

/**
 *
 * @author Oleg
 */
public class ExtensionsManagerMenu extends JMenu {
    
    /**
	 * Creates a new simple menu.
	 * This constructor creates and adds the menu options. 
	 * In this simple example only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.ExampleAction})
	 * @param uiController the user interface controller
	 */
	public ExtensionsManagerMenu(UIController uiController) {
		super("Extensions Manager");
		//setMnemonic(KeyEvent.VK_I);

		// Adds font actions
		add(new ExtensionsManagerAction(uiController));
	}
    
}
