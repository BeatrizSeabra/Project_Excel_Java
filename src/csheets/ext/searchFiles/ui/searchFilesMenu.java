package csheets.ext.searchFiles.ui;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import csheets.ui.ctrl.UIController;

/**
 * Representes the UI extension menu of the simple extension.
 * @author 1120564MarcoEsteves
 */
public class searchFilesMenu extends JMenu {

	/**
	 * Creates a new simple menu.
	 * This constructor creates and adds the menu options. 
	 * In this simple example only one menu option is created.
	 * @param uiController the user interface controller
	 */
	public searchFilesMenu(UIController uiController) {
		super("SearchFiles Menu");
		setMnemonic(KeyEvent.VK_S);

		// Adds font actions
		add(new SearchFilesAction(uiController));
	}	
}
