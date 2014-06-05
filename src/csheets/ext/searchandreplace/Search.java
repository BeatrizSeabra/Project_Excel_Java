/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.searchandreplace;

import csheets.core.Address;
import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.ui.sheet.SpreadsheetTable;
import javax.swing.JOptionPane;

/**
 *
 * @author 1120339
 */
public class Search {

    public Search() {
    }

    

    public Address simpleSearch(SpreadsheetTable focusOwner, String text) {
        Spreadsheet spreadsheet = focusOwner.getSpreadsheet();
        int rows=spreadsheet.getRowCount();
        Cell row[];
        for (int i = 0; i < rows; i++) {
            row=spreadsheet.getRow(i);
            int length = row.length;
            for (int y = 0; y < length; y++) {
                if(row[y].getContent().matches(text)){
                    return new Address(y, i);
                }
            }
        }
        return null;
    }
}