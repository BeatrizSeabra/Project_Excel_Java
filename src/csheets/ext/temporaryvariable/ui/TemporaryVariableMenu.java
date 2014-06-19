/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable.ui;

import csheets.ext.temporaryvariable.TemporaryVariablesEditorAction;
import csheets.ui.ctrl.UIController;
import javax.swing.JMenu;

/**
 *
 * @author Diogo Moreira (1120339)
 */
public class TemporaryVariableMenu extends JMenu{

    public TemporaryVariableMenu(UIController controller) {
        super("Temporary Variables");
        add(new TemporaryVariablesEditorAction(controller));
    }
    
}
