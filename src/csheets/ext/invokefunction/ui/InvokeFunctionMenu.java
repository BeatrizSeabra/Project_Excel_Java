package csheets.ext.invokefunction.ui;

import csheets.ext.simple.ui.*;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;

/**
 * Representes the UI extension menu of the simple extension.
 * @author Alexandre Braganca
 */
public class InvokeFunctionMenu extends JMenu {

	/**
	 * Creates a new simple menu.
	 * This constructor creates and adds the menu options. 
	 * In this simple example only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.ExampleAction})
	 * @param uiController the user interface controller
	 */
	public InvokeFunctionMenu(UIController uiController) {
		super("Invoke Function");
		setMnemonic(KeyEvent.VK_I);

		// Adds font actions
		add(new InvokeFunctionAction(uiController));
	}	
}
