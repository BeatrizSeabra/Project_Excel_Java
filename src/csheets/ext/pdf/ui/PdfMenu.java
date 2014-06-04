/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.pdf.ui;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;
/**
 *
 * @author Marc
 */
public class PdfMenu extends JMenu {
    
    /**
	 * Creates a new simple menu.
	 * This constructor creates and adds the menu options. 
	 * In this simple example only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.ExampleAction})
	 * @param uiController the user interface controller
	 */
	public PdfMenu(UIController uiController) {
		super("PDF");
		setMnemonic(KeyEvent.VK_I);

		// Adds PDF actions
		add(new ExportPdfAction(uiController));
	}	

}
