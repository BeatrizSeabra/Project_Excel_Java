/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.temporaryvariable;

import csheets.core.Spreadsheet;
import csheets.core.SpreadsheetImpl;
import csheets.core.WorkbookListener;
import csheets.core.formula.TemporaryVariable;
import java.util.ArrayList;

/**
 *
 * @author Diogo Moreira (1120339)
 */
public class SpreadsheetVariableSynchronizer implements WorkbookListener {

    /**
     * When a new spreadsheet is added, the temporary variables of the other
     * sheets are added to the new spreadsheet
     *
     * @param spreadsheet
     * @param index
     */
    @Override
    public void spreadsheetInserted(Spreadsheet spreadsheet, int index) {
        ArrayList<TemporaryVariable> tempVarList = ((SpreadsheetImpl) spreadsheet.getWorkbook().getSpreadsheet(0)).getTemporaryVariableList();
        ((SpreadsheetImpl) spreadsheet).setTemporaryVariableList(tempVarList);
    }

    @Override
    public void spreadsheetRemoved(Spreadsheet spreadsheet) {
    }

    @Override
    public void spreadsheetRenamed(Spreadsheet spreadsheet) {
    }

}
