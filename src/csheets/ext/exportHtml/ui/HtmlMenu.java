package csheets.ext.exportHtml.ui;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;

/**
 *
 * @author 1040314 - João Paulo Silva
 */
public class HtmlMenu extends JMenu{
    /**
     * Creates a new simple menu. This constructor creates and adds the menu
     * options. In this simple example only one menu option is created. A menu
     * option is an action (in this case
     * {@link csheets.ext.simple.ui.ExampleAction})
     *
     * @param uiController the user interface controller
     */
    public HtmlMenu(UIController uiController) {
        super("Export");
        setMnemonic(KeyEvent.VK_E);

        // Adds font actions
        add(new HtmlAction(uiController));
    }
}
