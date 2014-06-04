/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat.ui;

import csheets.ext.sort.ui.SortAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;

/**
 *
 * @author i121228
 */
public class ChatMenu extends JMenu {
    
    public ChatMenu(UIController uiController) {
		super("Chat");
		setMnemonic(KeyEvent.VK_C);

		// Adds font actions
		add(new ChatAction(uiController));
	}	
}
