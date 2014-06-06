/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.exportfiles.ui;

import csheets.ext.exportXML.ui.XMLAction;
import csheets.ext.exporttxt.ui.TxtAction;
import csheets.ext.pdf.ui.ExportPdfAction;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;

/**
 *
 * @author i120388
 */
public class ExportMenu extends JMenu {

    /**
     * Creates a new simple menu. This constructor creates and adds the menu
     * options. In this simple example only one menu option is created. A menu
     * option is an action (in this case
     * {@link csheets.ext.simple.ui.ExampleAction})
     *
     * @param uiController the user interface controller
     */
    public ExportMenu(UIController uiController) {
        super("Export");
        setMnemonic(KeyEvent.VK_I);

        // Adds font actions
        add(new XMLAction(uiController));
        add(new TxtAction(uiController));
        add(new ExportPdfAction(uiController));
    }
}
