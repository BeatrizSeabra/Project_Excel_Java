package csheets.ext.searchFiles.ui;

import csheets.ext.searchFilesBackground.ui.SearchFilesBackgroundAction;
import csheets.ext.searchFilesByContent.ui.SearchFilesByContentAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;

/**
 * Representa o Menu UI da Extensao searchFiles.
 * @author 1120564MarcoEsteves
 */
public class searchFilesMenu extends JMenu {

	/**
	 * Cria um menu da extensao searchFiles.
	 */
	public searchFilesMenu(UIController uiController) {
		super("SearchFiles Menu");
		setMnemonic(KeyEvent.VK_S);

		// Adds font actions
		add(new SearchFilesAction(uiController));
                add(new SearchFilesBackgroundAction(uiController));
                add(new SearchFilesByContentAction(uiController));
	}	
}
