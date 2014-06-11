/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Oleg
 */
public class FormEditorEditAction extends BaseAction{
    
    /** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public FormEditorEditAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Edit";
	}

	protected void defineProperties() {
	}

	/**
	 * An action that presents a new window, in which the user can select a function of the showned ones.
	 * @param event the event that was fired
	 */
	public void actionPerformed(ActionEvent event) {                
		/*FormEditor invoke=new FormEditor(this.uiController);
                invoke.setVisible(true);
                invoke.setLocation(500, 200);*/
	}
   
}
