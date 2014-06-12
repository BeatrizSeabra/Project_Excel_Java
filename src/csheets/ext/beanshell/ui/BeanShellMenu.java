package csheets.ext.beanshell.ui;

import csheets.ui.ctrl.UIController;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;

/**
 *
 * @author Fabio Carvalho 1121228
 */
public class BeanShellMenu extends JMenu{
    /**
	 * Creates a new simple menu.
	 * This constructor creates and adds the menu options. 
	 * In this simple example only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.ExampleAction})
	 * @param uiController the user interface controller
	 */
	public BeanShellMenu(UIController uiController) {
		super("Beanshell");
		setMnemonic(KeyEvent.VK_B);

		// Adds font actions
		add(new BeanShellAction(uiController));
	}	
}
