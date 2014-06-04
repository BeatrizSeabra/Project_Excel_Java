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
    }

    /**
     * A simple action that presents a confirmation dialog. If the user confirms
     * then the contents of the cell A1 of the current sheet are set to the
     * string "Changed".
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {

        // Lets user select a font
        int result = JOptionPane.showConfirmDialog(null, "You have selected the Example option. Do you want to set cell A1 to 'Changed'");

        if (result == JOptionPane.YES_OPTION) {
            // Vamos exemplificar como se acede ao modelo de dominio (o workbook)
            try {
                this.uiController.getActiveSpreadsheet().getCell(0, 0).setContent("Changed");
            } catch (Exception ex) {
                // para ja ignoramos a excepcao
            }
        }
    }
}
