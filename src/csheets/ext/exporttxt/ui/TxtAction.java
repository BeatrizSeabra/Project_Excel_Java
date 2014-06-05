package csheets.ext.exporttxt.ui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * An action of the simple extension that exemplifies how to interact with the spreadsheet.
 * @author Tiba
 */
public class TxtAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public TxtAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Ficheiro de texto";
	}

	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
	 public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You saved this file: " + chooser.getSelectedFile().getName());
    }
        
    }
}
