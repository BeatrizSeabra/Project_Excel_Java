/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.email.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Rui 1110506
 */
public class EmailAction extends BaseAction{

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public EmailAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Email Configuration";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
	public void actionPerformed(ActionEvent event) {
	 EmailSetup EmailFrame = new EmailSetup();
         EmailFrame.run();
	}
}

