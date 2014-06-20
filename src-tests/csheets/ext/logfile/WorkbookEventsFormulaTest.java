/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.logfile;

import csheets.CleanSheets;
import static csheets.ext.logfile.ui.WorkbookEventsFormulaUI.*;
import csheets.ui.ctrl.UIController;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author Nuno
 */
public class WorkbookEventsFormulaTest {
    
    public WorkbookEventsFormulaTest() {
    }
    
    @Test
    public void addFormula() {
    
        String [] formulas = new String[5];
        
        formulas[OPEN] = "Abriu folha";
        formulas[CLOSE] = "Fechou folha";
        formulas[SHEETCTEATED] = "Criou Folha";
        formulas[SHEETDELETED] = "Eliminou Folha";
        formulas[SHEETRENAMED] = "Renomeou Folha";
        
        ArrayList<String> mylist = new ArrayList<>();
        
        mylist.add("Open");
        mylist.add("Close");
        mylist.add("sheetCreated");
        mylist.add("sheetDeleted");
        mylist.add("sheetRenamed");
        
        CleanSheets csheets = new CleanSheets();
        UIController uiController = new UIController(csheets);
        
        uiController.setEvlf(mylist);
        
        uiController.setFormula(OPEN, formulas[OPEN]);
        uiController.setFormula(CLOSE, formulas[CLOSE]);
        uiController.setFormula(SHEETCTEATED, formulas[SHEETCTEATED]);
        uiController.setFormula(SHEETDELETED, formulas[SHEETDELETED]);
        uiController.setFormula(SHEETRENAMED, formulas[SHEETRENAMED]);
        
        uiController.writeLogFileWB("Open");
        uiController.writeLogFileWB("Close");
        uiController.writeLogFileWB("sheetCreated");
        uiController.writeLogFileWB("sheetDeleted");
        uiController.writeLogFileWB("sheetRenamed");
        
    }

}
