package csheets.ext.invokefunction.ui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 * An action of the simple extension that exemplifies how to interact with the spreadsheet.
 * @author Alexandre Braganca
 */
public class InvokeFunctionAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public InvokeFunctionAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Choose Function";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
	public void actionPerformed(ActionEvent event) {
                
		InvokeUI invoke=new InvokeUI();
		try {
			this.uiController.getActiveSpreadsheet().getCell(0, 0).setContent("Changed");
		} catch (Exception ex) {
			// para ja ignoramos a excepcao
                }
	}
}
