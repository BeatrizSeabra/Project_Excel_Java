package csheets.ext.residenceimportcleansheets.ui;

import csheets.ext.residenceimportcleansheets.ResidenceImport;
import java.awt.event.ActionEvent;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 * An action that allow the user of the cleansheets, to import the information
 * of contacts and residences (and their relationship) from the database of the 
 * application, to show that, on the cells of the cleansheets workspace.
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
     * An action that allow to import the information present on the tables
     * Contacts and Residence (and their relationship) of the database of application,
     * and show a list with the contacts and their associated residence(s) into 
     * the cells of cleansheets workspace.
     * @param event the event that was fired
     */
    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent event) 
    {        
        ResidenceImport residenceImport = new ResidenceImport();
        residenceImport.importContactsResidenceToCleansheets(uiController);
    }
        
}