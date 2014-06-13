package csheets.ext.residenceexport.ui;

import csheets.ext.residenceexport.ResidenceExport;
import java.awt.event.ActionEvent;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 * An action that allow the user of the cleansheets, to export the information
 * of contacts and residences (and their relationship) from the cells of application
 * to insert this information, on the table of Contacts and Residence, into the database.
 * @author 1090675 - Tiago Pereira
 */
public class ResidenceExportAction extends BaseAction {
    
    /** The user interface controller */
    protected UIController uiController;

    /**
     * Creates a new action.
     * @param uiController the user interface controller
     */
    public ResidenceExportAction(UIController uiController) {
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
     * An action that allow to export the information present on the workspace of the
     * cleansheets cells, to the table Contacts and Residence (and their relationship),
     * to insert into the database of application.
     * @param event the event that was fired
     */
    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent event) 
    {
        ResidenceExport residenceExport = new ResidenceExport();
        residenceExport.exportContactsResidenceToDatabase(uiController);
    }
        
}