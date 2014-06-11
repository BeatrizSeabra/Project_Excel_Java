/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.logfile.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nélson
 */
public class LogFileWorkBookAction extends BaseAction {
  /** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public LogFileWorkBookAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Workbook Events";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
                        
        
	public void actionPerformed(ActionEvent event) {

            WorkBookEventsUI l= new WorkBookEventsUI(uiController);
            l.setSize(340, 270);
            l.setResizable(false);
            l.setLocationRelativeTo(null);
            l.setVisible(true);

	}
        
       
}
  

