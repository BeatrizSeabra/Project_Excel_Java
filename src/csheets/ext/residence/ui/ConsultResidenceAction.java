/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.residence.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nuno
 */
public class ConsultResidenceAction extends BaseAction {
/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public ConsultResidenceAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Consult Residence...";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
	public void actionPerformed(ActionEvent event) {
            ConsultResidenceUI residenceUI = ConsultResidenceUI.getInstance();
            ConsultResidenceUI.getInstance().setVisible(true);
	}
}
