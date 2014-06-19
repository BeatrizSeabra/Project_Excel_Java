/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable;

import csheets.core.SpreadsheetImpl;
import csheets.ext.temporaryvariable.ui.UIExtensionTempVarSideBar;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import java.awt.event.ActionEvent;

/**
 *
 * @author Diogo
 */
public class TemporaryVariablesEditorAction extends BaseAction{
    
    private UIController controller;

    public TemporaryVariablesEditorAction(UIController controller) {
        this.controller = controller;
    }
    
    
    
    @Override
    protected String getName() {
        return "Start Side Bar Tracking";
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        UIExtension[] extensions = controller.getExtensions();
        for (int i = 0; i < extensions.length; i++) {
            if(extensions[i].getExtension().getName().equals("Temporary Variables Side Bar")){
                UIExtensionTempVarSideBar aux = ((ExtensionTemporaryVariablesSideBar)extensions[i].getExtension()).getExtensionTemporaryVariables();
                ((SpreadsheetImpl)controller.getActiveWorkbook().getSpreadsheet(0)).addTemporaryVariableListener(aux);
            }
        }
    }
    
}
