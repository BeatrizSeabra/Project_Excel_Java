package csheets.ext.share.ui;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;


 // Representes the UI extension menu of the share extension.
 // @author Rui 1110506
 
public class ShareMenu extends JMenu {

	/**
	 * Creates a new share menu.
	 * This constructor creates and adds the menu options. 
	 * In this simple example only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.ExampleAction})
	 * @param uiController the user interface controller
	 */
	public ShareMenu(UIController uiController) {
		super("Share");
		setMnemonic(KeyEvent.VK_S);

		// Adds font actions
		add(new ServerAction(uiController));
                add(new ClientAction(uiController));
	}	
}
