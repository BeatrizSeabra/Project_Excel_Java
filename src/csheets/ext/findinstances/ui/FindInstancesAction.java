/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findinstances.ui;

import csheets.ext.findinstances.Cliente;
import java.awt.event.ActionEvent;


import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.util.ArrayList;

/**
 *
 * @author RafaelChaves
 */
public class FindInstancesAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public FindInstancesAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Find Instances";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
                        
       /* private void initEventList()
        {
            eventlist.add("OnClick");
            eventlist.add("OnChange");

        }
        */
        
	public void actionPerformed(ActionEvent event) {
            Cliente c=new Cliente();
            c.start();
            FindInstancesUI l= new FindInstancesUI();
            l.setSize(300, 300);
            l.setResizable(false);
            l.setLocationRelativeTo(null);
            l.setVisible(true);
            //eventlist=l.getList();

	}
        
       
}