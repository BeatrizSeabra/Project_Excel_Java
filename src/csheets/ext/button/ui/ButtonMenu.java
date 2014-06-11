package csheets.ext.button.ui;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import csheets.ui.ctrl.UIController;

/**
 * Representes the UI extension menu of the simple extension.
 *
 * @author Tiba
 */
public class ButtonMenu extends JMenu {

    /**
     * Creates a new button menu. This constructor creates and adds the menu
     * options.
     *
     * @param uiController the user interface controller
     */
    public ButtonMenu(UIController uiController) {
        super("Button");
        setMnemonic(KeyEvent.VK_B);

        // Adds font actions
        add(new ButtonAction(uiController));
    }
}
