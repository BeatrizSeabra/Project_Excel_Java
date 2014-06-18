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
import static java.lang.Thread.sleep;
import java.util.logging.*;
import javax.swing.DefaultListModel;
import org.h2.command.dml.*;

/**
 *
 * @author 1120339
 */
public class Search {

    private Thread threadUpdate;
    private DefaultListModel<Address> model;

    public Search() {
        this.model = new DefaultListModel<Address>();
    }

    public Address simpleSearch(SpreadsheetTable focusOwner, String text) {
        if (text == null) {
            return null;
        }
        Spreadsheet spreadsheet = focusOwner.getSpreadsheet();
        int rows = spreadsheet.getRowCount();
        Cell row[];
        for (int i = 0; i < rows; i++) {
            row = spreadsheet.getRow(i);
            int length = row.length;
            for (int y = 0; y < length; y++) {
                if (row[y].getContent().matches(text)) {
                    return new Address(y, i);
                }
            }
        }
        return null;
    }

    public void SearchAll(UpdateSearch updatesearchUI, SpreadsheetTable focusOwner, String text) {
        if (text == null) {
            return;
        }
        Spreadsheet spreadsheet = focusOwner.getSpreadsheet();

        int rowCount = spreadsheet.getRowCount();
        Cell row[];
        for (int i = 0; i < rowCount; i++) {
            row = spreadsheet.getRow(i);
            int rowLength = row.length;
            for (int j = 0; j < rowLength; j++) {//para cada posicao do vector
                //funcao @macthes() encontra texto e expressoes regulares
                if (row[j].getContent().matches(text)) {//se for encontrada a palavra pesquisada
                    Address add = new Address(j, i);//retorna o address da cell
                    threadUpdate = new Thread(new Update(updatesearchUI, add));
                    threadUpdate.start();
                }
            }
        }
    }

    public class Update extends Thread {

        private UpdateSearch updateUI;
        private Address address;

        public Update(UpdateSearch updtUI, Address add) {
            this.updateUI = updtUI;
            this.address = add;
        }

        @Override
        public void run() {
            try {
                sleep(1500); //demora 1.5s
            } catch (InterruptedException ex) {
                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
            }
            model.addElement(address);
            System.out.println(address);
            this.updateUI.setJList(model);
        }
    }
}
