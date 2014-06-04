/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.contacts;

import csheets.ext.Extension;
import csheets.ext.contacts.ui.UIExtensionContacts;
import csheets.ext.simple.ui.UIExtensionExample;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author PedroRosário
 */
public class ExtensionContacts extends Extension {
    
    public static final String NAME = "Contacts";

    public ExtensionContacts() {
        super(NAME);
    }
    
    public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionContacts(this, uiController);
    }
    
}
