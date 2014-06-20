/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.loadextension.ui;

import java.awt.event.ActionEvent;


import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import javax.swing.JMenu;

/**
 *
 * @author RafaelChaves
 */
public class LoadExtensionAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;
        protected JMenu menu;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
         * @param menu the extension menu
	 */
	public LoadExtensionAction(UIController uiController, JMenu menu) {
		this.uiController = uiController;
                this.menu=menu;
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
            LoadExtensionUI l= new LoadExtensionUI(uiController, menu);
            l.setSize(350, 250);
            l.setResizable(false);
            l.setLocationRelativeTo(null);
            l.setVisible(true);
            //eventlist=l.getList();

	}
        
       
}