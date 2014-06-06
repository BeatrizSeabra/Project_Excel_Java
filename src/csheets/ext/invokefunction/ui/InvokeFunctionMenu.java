package csheets.ext.invokefunction.ui;

import csheets.ext.simple.ui.*;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;

/**
 * Representes the UI extension menu of the invoke function extension.
 * @author 1120268
 */
public class InvokeFunctionMenu extends JMenu {

	/**
	 * Creates a new invoke function menu.
	 * This constructor creates and adds the menu options. 
	 * Only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.InvokeFunctionAction})
	 * @param uiController the user interface controller
	 */
	public InvokeFunctionMenu(UIController uiController) {
		super("Invoke Function");
		setMnemonic(KeyEvent.VK_I);

		// Adds font actions
		add(new InvokeFunctionAction(uiController));
	}	
}
