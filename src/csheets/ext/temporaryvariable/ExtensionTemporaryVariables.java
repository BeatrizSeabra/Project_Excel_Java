/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable;

import csheets.ext.Extension;
import csheets.ext.temporaryvariable.ui.UIExtensionTemporaryVariables;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author Diogo Moreira(1120339)
 */
public class ExtensionTemporaryVariables extends Extension{

    /**
     * Nome da Extensao
     */
    public static final String NAME = "Temporary Variables";
    
    public ExtensionTemporaryVariables() {
        super(NAME);
    }
    
    public UIExtension getUIExtension(UIController uiController) {
        return new UIExtensionTemporaryVariables(this, uiController);
    }
}
