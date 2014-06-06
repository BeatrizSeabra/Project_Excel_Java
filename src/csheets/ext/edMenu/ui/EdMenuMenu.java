/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.edMenu.ui;

import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import csheets.ui.ctrl.UIController;

/**
 *
 * @author Pedro
 */
public class EdMenuMenu extends JMenu {

	/**
	 * Creates a new  menu.
	 * @param uiController the user interface controller
	 */
	public EdMenuMenu(UIController uiController) {
		super("New Menus");
		setMnemonic(KeyEvent.VK_S);
                
                add(new EdMenuAction(uiController));
                    
		
	}
}
    
