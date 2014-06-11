package csheets.ext.importfiles.ui;

import csheets.ext.importfiles.ui.ImportAction;
import csheets.ext.residenceimport.ui.ResidenceImportAction;
import csheets.ui.FileChooser;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;

/**
 * Representes the UI extension menu of the simple extension.
 * @author Tiago
 */
public class ImportMenu extends JMenu {

	/**
	 * Creates a new simple menu.
	 * This constructor creates and adds the menu options. 
	 * In this simple example only one menu option is created.
	 * A menu option is an action (in this case {@link csheets.ext.simple.ui.ExampleAction})
	 * @param uiController the user interface controller
	 */
	public ImportMenu(UIController uiController, FileChooser chooser) {
            super("Import");
            setMnemonic(KeyEvent.VK_I);

            // Adds font actions
            add(new ImportAction(uiController,chooser));
            add(new ResidenceImportAction(uiController));                
	}	
}

