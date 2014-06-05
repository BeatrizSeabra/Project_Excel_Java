/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.edMenu.ui;

import csheets.ext.edMenu.EdMenuExtension;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.Action.MNEMONIC_KEY;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Pedro
 */
@SuppressWarnings("serial")
public class EdMenuAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new font action.
	 * @param uiController the user interface controller
	 */
	public EdMenuAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Menu Editor...";
	}

	protected void defineProperties() {
		putValue(MNEMONIC_KEY, KeyEvent.VK_M);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
       MenuEdWindow m = new MenuEdWindow();
       m.setVisible(true);
       m.setSize(352, 200);
       m.setResizable(true);
       m.setLocationRelativeTo(null);
    }
    
    
    
    
    
}