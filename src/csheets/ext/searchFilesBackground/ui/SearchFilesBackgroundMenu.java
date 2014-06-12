package csheets.ext.searchFilesBackground.ui;

import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import csheets.ui.ctrl.UIController;

/**
 *
 * @author i120388
 */
public class SearchFilesBackgroundMenu extends JMenu{
    /**
     * Creates a new simple menu. This constructor creates and adds the menu
     * options. In this simple example only one menu option is created. A menu
     * option is an action (in this case
     * {@link csheets.ext.simple.ui.ExampleAction})
     *
     * @param uiController the user interface controller
     */
    public SearchFilesBackgroundMenu(UIController uiController) {
        super("Search Files in Background");
        setMnemonic(KeyEvent.VK_E);
        
    }
}
