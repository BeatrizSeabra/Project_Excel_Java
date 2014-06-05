/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat.ui;

import csheets.ext.Extension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.JMenu;

/**
 *
 * @author i121228
 */
public class UIExtensionChat extends UIExtension {
    private ChatMenu menu;
    
    public UIExtensionChat(Extension extension, UIController uiController) {
		super(extension, uiController);
	}
    
    public JMenu getMenu() {
	if (menu == null)
                    menu=new ChatMenu(uiController);
	return menu;
	}
}
