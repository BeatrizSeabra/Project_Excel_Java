/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.searchFilesByContent.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Pedro
 */
public class SearchFilesByContentAction extends BaseAction {
     
     
    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public SearchFilesByContentAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Search Files in Background";
    }

    protected void defineProperties() {
    }

    /**
     * A simple action that presents a confirmation dialog. If the user confirms
     * then the contents of the cell A1 of the current sheet are set to the
     * string "Changed".
     *
     * @param event the event that was fired
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        /*
        JDialogSearchFilesByContent background=new JDialogSearchFilesByContent(null, true,uiController);
        background.setVisible(true);
        background.setResizable(false);
        background.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
        background.pack();
        background.setLocationRelativeTo(null);
        */
    }

}
