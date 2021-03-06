/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor.ui;

import csheets.ui.ctrl.UIController;
import javax.swing.JMenu;

/**
 *
 * @author Oleg & Rui 1110506
 */
public class FormEditorMenu extends JMenu {
    /**
	 * Creates a new invoke function menu.
	 * This constructor creates and adds the menu options. 
	 * Only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.InvokeFunctionAction})
	 * @param uiController the user interface controller
	 */
	public FormEditorMenu(UIController uiController) {
		super("Forms");
		//setMnemonic(KeyEvent.VK_I);
		// Adds font actions
                add(new FormEditorNewAction(uiController));
                add(new FormEditorEditAction(uiController));
                add(new FormEditorPlayAction(uiController));
	}	
}
