/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.temporaryvariable;

import csheets.ext.Extension;
import csheets.ext.temporaryvariable.ui.UIExtensionTempVarSideBar;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author Diogo Moreira(1120339)
 */
public class ExtensionTemporaryVariablesSideBar extends Extension {

    /**
     * Nome da Extensao
     */
    public static final String NAME = "Temporary Variables Side Bar";

    private UIExtensionTempVarSideBar extensionTemporaryVariables;

    public ExtensionTemporaryVariablesSideBar() {
        super(NAME);
    }

    public UIExtension getUIExtension(UIController uiController) {
        this.extensionTemporaryVariables = new UIExtensionTempVarSideBar(this, uiController);
        return this.extensionTemporaryVariables;
    }

    public UIExtensionTempVarSideBar getExtensionTemporaryVariables() {
        return this.extensionTemporaryVariables;
    }
    
    
}
