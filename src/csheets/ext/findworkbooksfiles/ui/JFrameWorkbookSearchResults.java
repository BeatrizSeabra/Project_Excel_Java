/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.findworkbooksfiles.ui;

import csheets.CleanSheets;
import csheets.core.Cell;
import csheets.core.Workbook;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * Class that represent the window (extends JFrame) with a table style that show
 * to user, the listing of the found files on the specified directories.
 *
 * @author 1090675 - Tiago Pereira & Diogo Moreira (1120339)
 */
public class JFrameWorkbookSearchResults extends JFrame {

    /**
     * Creates a window to show the workbooks files in a table style window.
     *
     * @param listingF ArrayList<File> that receives the workbooks files founded
     */
    DefaultTableModel dtm = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };
    JTable jTable = new JTable(dtm);
    int i = 0;
    
    public JFrameWorkbookSearchResults(List<File> listingF) {
        setTitle("Listing Workbooks files found in the directory");
        setSize(600, 200);
        
        jTable.setRowHeight(20);
        jTable.getTableHeader().setBackground(Color.ORANGE);
        jTable.getTableHeader().setResizingAllowed(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        dtm.addColumn("Name");
        dtm.addColumn("Path");
        jTable.getColumnModel().getColumn(0).setPreferredWidth(15);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(400);
        if (!(listingF == null)) {
            for (i = 0; i < listingF.size(); i++) {
                dtm.insertRow(i, new Object[]{listingF.get(i).getName(), listingF.get(i).getAbsolutePath()});
            }
        }
        getContentPane().add(new JScrollPane(jTable));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        ListSelectionModel cellSelectionModel = jTable.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                try {
                    String selectedData = null;
                    
                    int[] selectedRow = jTable.getSelectedRows();
                    
                    for (int i = 0; i < selectedRow.length; i++) {
                        selectedData = (String) jTable.getValueAt(selectedRow[i], 1);
                    }
                    CleanSheets cleanSheets = new CleanSheets();
                    File selectedFile = new File(selectedData);
                    Workbook workbook = cleanSheets.getWorkbookFromFile(selectedFile);
                    Cell[] firstRow=workbook.getSpreadsheet(0).getRow(0);
                    JDialogShowFirstLine showFirstLine = new JDialogShowFirstLine(null, false);
                    showFirstLine.setTitle("File Sample");
                    showFirstLine.setVisible(true);
                    showFirstLine.setResizable(false);
                    showFirstLine.setLocationRelativeTo(null);
                    showFirstLine.setFilePath(selectedData);
                    showFirstLine.updateText(firstRow);
                    
                } catch (IOException ex) {
                    Logger.getLogger(JFrameWorkbookSearchResults.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JFrameWorkbookSearchResults.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    public void updateInformation(File file) {
        dtm.insertRow(i, new Object[]{file.getName(), file.getAbsolutePath()});
        i++;
    }
    
}
