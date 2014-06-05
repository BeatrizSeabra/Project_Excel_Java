package csheets.ext.invokefunction.ui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 * An action of the invoke function extension that exemplifies how to interact with the spreadsheet.
 * @author 1120268
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
	 * An action that presents a new window, in which the user can select a function of the showned ones.
	 * @param event the event that was fired
	 */
	public void actionPerformed(ActionEvent event) {
                
		Invoke invoke=new Invoke();
                invoke.setVisible(true);
                invoke.setLocation(500, 200);
		try {
			this.uiController.getActiveSpreadsheet().getCell(0, 0).setContent("Changed");
		} catch (Exception ex) {
			// para ja ignoramos a excepcao
                }
	}
}
