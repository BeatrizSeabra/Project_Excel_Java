/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.sort.ui;

/**
 *
 * @author Stefan Parker
 */
import csheets.CleanSheets;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import javax.swing.ImageIcon;


public class SortAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public SortAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Sort Cell";
	}

	protected void defineProperties() {
		setEnabled(true);
		putValue(SMALL_ICON, new ImageIcon(CleanSheets.class.getResource("res/img/sort.gif")));
	}

	public void actionPerformed(ActionEvent event) {
                
		
		try {
			String a=this.uiController.getActiveSpreadsheet().getCell(0, 0).getContent();
			this.uiController.getActiveSpreadsheet().getCell(0, 1).setContent(a);
		} catch (Exception ex) {
			// para ja ignoramos a excepcao
                }
	}
}
