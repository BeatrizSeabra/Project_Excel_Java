/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.searchandreplace;

import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.ui.sheet.SpreadsheetTable;
import javax.swing.JOptionPane;

/**
 *
 * @author 1120339
 */
public class Search {

    private String text;

    public Search() {
    }

    public void getTextFromDialog() {
        
    }

    public int[] textSearch(SpreadsheetTable focusOwner) {
        text=JOptionPane.showInputDialog(null, "Search text:");
        if(text.isEmpty()){
            return null;
        }
        Spreadsheet spreadsheet = focusOwner.getSpreadsheet();
        int cell[]= new int[2];
        int rows=spreadsheet.getRowCount();
        Cell row[];
        for (int i = 0; i < rows; i++) {
            row=spreadsheet.getRow(i);
            int length = row.length;
            for (int y = 0; y < length; y++) {
                if(row[y].getContent().matches(text)){
                    cell[0]=i;
                    cell[1]=y;
                    return cell;
                }
            }
        }
        return null;
    }
}