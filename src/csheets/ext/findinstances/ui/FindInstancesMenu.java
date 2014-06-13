/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findinstances.ui;

/**
 *
 * @author RafaelChaves
 */
import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;

/**
 * Representes the UI extension menu of the simple extension.
 * @author Alexandre Braganca
 */
public class FindInstancesMenu extends JMenu {

	/**
	 * Creates a new simple menu.
	 * This constructor creates and adds the menu options.
	 * A menu option is an action (in this case {@link csheets.ext.findinstances.ui.FindInstancesAction} and {@link csheets.ext.findinstances.ui.StartClientAction})
	 * @param uiController the user interface controller
	 */
	public FindInstancesMenu(UIController uiController) {
		super("Find Instances");
		setMnemonic(KeyEvent.VK_F);

		// Adds font actions
		add(new FindInstancesAction(uiController));
                add(new StartClientAction(uiController));
	}

}
