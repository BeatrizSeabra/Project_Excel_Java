package csheets.ext.residenceimport.ui;

import java.awt.event.ActionEvent;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 * @author 1090675 - Tiago Pereira
 */
public class ResidenceImportAction extends BaseAction {
    
    /** The user interface controller */
    protected UIController uiController;

    /**
     * Creates a new action.
     * @param uiController the user interface controller
     */
    public ResidenceImportAction(UIController uiController) {
            this.uiController = uiController;
    }

    @Override
    protected String getName() {
            return "Residence";
    }

    @Override
    protected void defineProperties() {
    }

    /**    
     * @param event the event that was fired
     */
    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent event) 
    {
        // TODO
    }
        
}