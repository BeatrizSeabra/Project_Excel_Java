/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.searchFilesByContent.ui;

import csheets.ui.ctrl.UIController;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;

/**
 *
 * @author Pedro
 */

    public class SearchFilesByContentMenu extends JMenu{
    /**
     * Creates a new simple menu. This constructor creates and adds the menu
     * options. In this simple example only one menu option is created. A menu
     * option is an action (in this case
     * {@link csheets.ext.simple.ui.ExampleAction})
     *
     * @param uiController the user interface controller
     */
    public SearchFilesByContentMenu(UIController uiController) {
        super("Search Files by Content");
        setMnemonic(KeyEvent.VK_E);
        
    }
}
