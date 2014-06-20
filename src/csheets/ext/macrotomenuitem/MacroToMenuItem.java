/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.macrotomenuitem;

import csheets.ext.editMacro.compiler.Macro;
import javax.swing.JMenuItem;

/**
 * Class that receve the configuration of the association of the 
 * @author 1090675 - Tiago Pereira
 */
public class MacroToMenuItem {
        
    private Macro macro;
    private JMenuItem menuItem;
    private String extendMenuItem;

    /**
     * 
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