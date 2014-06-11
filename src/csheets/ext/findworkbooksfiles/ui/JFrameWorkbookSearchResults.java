/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.findworkbooksfiles.ui;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
    int i=0;

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
    }

    public void updateInformation(File file) {
        dtm.insertRow(i, new Object[]{file.getName(), file.getAbsolutePath()});
        i++;
    }

}
