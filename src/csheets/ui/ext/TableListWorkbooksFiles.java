/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ui.ext;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 100675
 */
public class TableListWorkbooksFiles extends AbstractTableModel {

    private static final int numberColumns = 2;
    private ArrayList<File> files;
    
    /**
     * Creates a table model, to show the workbooks files found.
     * @param listFiles, ArrayList<File> that include the workbooks files
     */
    public TableListWorkbooksFiles(ArrayList<File> listFiles) 
    {
        files = new ArrayList<File>(listFiles);
        for (File file:files)
        {
            JOptionPane.showMessageDialog(null, file.getName());
        }
    } 
    
    @Override
    public int getRowCount() {
        return files.size();        
    }

    @Override
    public int getColumnCount() {
        return numberColumns;
    }
    
    @Override
    public String getColumnName(int column) {
        String name = "??";
        switch (column) 
        {
            case 0:
                name = "Name";
                break;
            case 1:
                name = "Path";
                break;
        }
        return name;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        File file = files.get(rowIndex);
        String value = null;
        switch (columnIndex) 
        {
            case 0:
                value = file.getName();                    
                break;
            case 1:
                value = file.getAbsolutePath();
                break;
        }
        return value;
    }
    
}