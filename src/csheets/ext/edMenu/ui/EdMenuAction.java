/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.edMenu.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import static javax.swing.Action.MNEMONIC_KEY;
import javax.swing.JMenuItem;

/**
 *
 * @author Pedro
 */
@SuppressWarnings("serial")
public class EdMenuAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new  action.
	 * @param uiController the user interface controller
	 */
	public EdMenuAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "*Add menu to window...*";
	}

	protected void defineProperties() {
		putValue(MNEMONIC_KEY, KeyEvent.VK_M);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
       MenuEdWindow m = new MenuEdWindow(uiController);
       m.setVisible(true);
       m.setSize(352, 200);
       m.setResizable(true);
       m.setLocationRelativeTo(null);   
       
    }
}