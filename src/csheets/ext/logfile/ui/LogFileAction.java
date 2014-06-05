/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.logfile.ui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author RafaelChaves
 */
public class LogFileAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;
        protected ArrayList<String> eventlist;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public LogFileAction(UIController uiController) {
		this.uiController = uiController;
                this.eventlist= new ArrayList();
	}

	protected String getName() {
		return "LogFile";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
        
	public void actionPerformed(ActionEvent event) {

            LogFileUI l= new LogFileUI(eventlist);
            l.setSize(170, 170);
            l.setResizable(false);
            l.setLocationRelativeTo(null);
            l.setVisible(true);
            eventlist=l.getList();   

	}
        
       
}
