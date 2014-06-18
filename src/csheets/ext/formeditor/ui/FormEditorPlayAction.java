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
 * @author Oleg and Rui 1110506
 */
public class FormEditorPlayAction extends BaseAction{
    
    /** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public FormEditorPlayAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Play Forms";
	}

	protected void defineProperties() {
	}

	/**
	 * An action that presents a new window, in which the user can select a function of the showned ones.
	 * @param event the event that was fired
	 */
	public void actionPerformed(ActionEvent event) {
            ChooseFormToPlay ChooseForm = new ChooseFormToPlay();
            ChooseForm.run();
        }
   
}
