/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.image.ui;

import csheets.ui.Frame;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Tiago
 */
class EditImageAction extends FocusOwnerAction {

    protected UIController uiController;

    public EditImageAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Edit Image";
    }

    protected void defineProperties() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Frame frame = (Frame) focusOwner.getTopLevelAncestor();
        EditImage dialog = new EditImage(frame, false);
    }

}
