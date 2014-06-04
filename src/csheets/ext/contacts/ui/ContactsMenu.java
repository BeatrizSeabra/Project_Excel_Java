/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.contacts.ui;

import csheets.ext.simple.ui.ExampleAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;

/**
 *
 * @author PedroRosário
 */
class ContactsMenu extends JMenu {

    public ContactsMenu(UIController uiController) {
        super("Contacts");
        setMnemonic(KeyEvent.VK_C);
        add(new ContactsAction(uiController));
    }

}
