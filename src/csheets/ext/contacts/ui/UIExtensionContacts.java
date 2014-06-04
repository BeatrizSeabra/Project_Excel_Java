/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.contacts.ui;

import csheets.ext.Extension;
import csheets.ext.simple.ui.ExampleMenu;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.JMenu;

/**
 *
 * @author PedroRosário
 */
public class UIExtensionContacts extends UIExtension {
    
    private ContactsMenu cMenu;

    public UIExtensionContacts(Extension extension, UIController uiController) {
        super(extension, uiController);
    }
    
    public JMenu getMenu() {
		if (cMenu == null)
			cMenu = new ContactsMenu(uiController);
		return cMenu;
	}
    
}
