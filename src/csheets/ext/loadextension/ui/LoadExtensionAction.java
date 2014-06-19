/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.loadextension.ui;

import java.awt.event.ActionEvent;


import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 *
 * @author RafaelChaves
 */
public class LoadExtensionAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public LoadExtensionAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Load Extension";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a new UI.
	 * @param event the event that was fired
	 */       
	public void actionPerformed(ActionEvent event) {
            LoadExtensionUI l= new LoadExtensionUI();
            l.setSize(350, 250);
            l.setResizable(false);
            l.setLocationRelativeTo(null);
            l.setVisible(true);
            //eventlist=l.getList();

	}
        
       
}