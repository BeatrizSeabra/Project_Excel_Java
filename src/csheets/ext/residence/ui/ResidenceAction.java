package csheets.ext.residence.ui;

import csheets.ext.simple.ui.*;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 * An action of the simple extension that exemplifies how to interact with the spreadsheet.
 * @author Alexandre Braganca
 */
public class ResidenceAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public ResidenceAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Residence...";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
	public void actionPerformed(ActionEvent event) {
            ResidenceUI residenceUI = new ResidenceUI();
            
	}
}
