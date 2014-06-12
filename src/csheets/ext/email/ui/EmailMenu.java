/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.email.ui;

import csheets.ui.ctrl.UIController;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;

/**
 *
 * @author Rui 1110506
 */
public class EmailMenu extends JMenu {
	/**
	 * Creates a new simple menu.
	 * This constructor creates and adds the menu options. 
	 * In this simple example only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.ExampleAction})
	 * @param uiController the user interface controller
	 */
	public EmailMenu(UIController uiController) {
		super("Email");
		setMnemonic(KeyEvent.VK_E);

		// Adds Email actions
		add(new EmailAction(uiController));
                add(new SendAction(uiController));
	}	
}
