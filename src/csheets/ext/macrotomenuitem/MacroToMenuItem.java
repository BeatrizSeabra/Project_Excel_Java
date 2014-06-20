/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.macrotomenuitem;

import csheets.ext.editMacro.compiler.Macro;
import javax.swing.JMenuItem;

/**
 * Class that has the attributes related to a macro, a menu item of cleansheets, 
 * and a string with the extensions for applying to the menu. These variables 
 * are needed to define the association between the running of the macro 
 * on the selection of the menu item of the cleansheets application.
 * @author 1090675 - Tiago Pereira
 */
public class MacroToMenuItem {
    
    /**
     * Macro macro, represent the macro that the user want to associate and run 
     * with the menu item of the cleansheets application
     * JMenuItem menuItem, represent the menu item that the user wants to associate
     * to running the defined macro
     * String extendMenuItem, represent the extension to apply to the menu item
     * of the cleansheets application, that inform if the macro will run before,
     * around or after the functionality of the specified menu.
     */    
    private Macro macro;
    private JMenuItem menuItem;
    private String extendMenuItem;

    /**
     * Initialize an object of type MacroToMenuItem with macro on the parameter 
     * of the construtor of the class, that represent the macro that the user 
     * want to associate and run, on the selection of the menu item of the 
     * cleansheets application.
     * @param macro
     */
    public MacroToMenuItem(Macro macro) {
        this.macro = macro;
    }
    
    /**
     * @return the macro
     */
    public Macro getMacro() {
        return macro;
    }

    /**
     * @param macro the macro to set
     */
    public void setMacro(Macro macro) {
        this.macro = macro;
    }

    /**
     * @return the menuItem
     */
    public JMenuItem getMenuItem() {
        return menuItem;
    }

    /**
     * @param menuItem the menuItem to set
     */
    public void setMenuItem(JMenuItem menuItem) {
        this.menuItem = menuItem;
    }

    /**
     * @return the extendMenuItem
     */
    public String getExtendMenuItem() {
        return extendMenuItem;
    }

    /**
     * @param extendMenuItem the extendMenuItem to set
     */
    public void setExtendMenuItem(String extendMenuItem) {
        this.extendMenuItem = extendMenuItem;
    }
  
}