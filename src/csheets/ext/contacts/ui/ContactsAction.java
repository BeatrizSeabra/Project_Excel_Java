/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.contacts.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author PedroRosário
 */
public class ContactsAction extends BaseAction {

    protected UIController uiController;

    public ContactsAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Contacts";
    }

    protected void defineProperties() {
        setEnabled(true);
    }

    /**
     * A simple action that presents a confirmation dialog. If the user confirms
     * then the contents of the cell A1 of the current sheet are set to the
     * string "Changed".
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {
 
       ContactsUI window = new ContactsUI();
       window.setVisible(true);
      //cWindow.setSize(352, 200);
      // cWindow.setResizable(true);
      // cWindow.setLocationRelativeTo(null);
    }
}
