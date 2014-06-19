/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable.ui;

import csheets.ext.Extension;
import csheets.ext.beanshell.ui.BeanShellMenu;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.JMenu;

/**
 *
 * @author Diogo Moreira(1120339)
 */
public class UIExtensionTempVarMenu extends UIExtension{

    public UIExtensionTempVarMenu(Extension extension, UIController uiController) {
        super(extension, uiController);
    }
    
    public JMenu getMenu() {
        return new TemporaryVariableMenu(uiController);
    }
}
