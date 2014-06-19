/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.macrotomenuitem.ui;

import java.awt.event.ActionEvent;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 * @author 1090675 - Tiago Pereira
 */
public class MacroToMenuItemAction extends BaseAction {
    
    /** The user interface controller */
    protected UIController uiController;

    /**
     * Creates a new action.
     * @param uiController the user interface controller
     */
    public MacroToMenuItemAction(UIController uiController) {
            this.uiController = uiController;
    }

    @Override
    protected String getName() {
            return "Macro To MenuItem";
    }

    @Override
    protected void defineProperties() {
    }

    /**
     * An action that consist on show a window on the select of the menu option 
     * to enables the user to define the macro that you want to associate to 
     * menu item. You can also set up the macro runs before the menu option (before),
     * it is executed instead of the menu option (arround), or if it is executed 
     * after the menu option (after).
     * @param event the event that was fired
     */
    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent event) 
    {        
        WindowMacroToMenuItem windowMacroToMenuItem = new WindowMacroToMenuItem();
        windowMacroToMenuItem.setVisible(true);
        windowMacroToMenuItem.setLocationRelativeTo(null);
    }
        
}