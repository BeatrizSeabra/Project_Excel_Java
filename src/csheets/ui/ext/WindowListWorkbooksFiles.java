/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ui.ext;

import java.awt.HeadlessException;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author 1090675
 */
public class WindowListWorkbooksFiles extends JFrame {
    
    /**
     * Creates a window to show the workbooks files.	 
     * @param files, ArrayList<File> that include the workbooks files
     */
    public WindowListWorkbooksFiles(ArrayList<File> files)
    {
        TableListWorkbooksFiles modelTable = new TableListWorkbooksFiles(files);
        JTable jTable = new JTable(modelTable);
        JFrame jFrame = new JFrame("Listing of Workbooks files found in the directory");
        //jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollPane jScroll = new JScrollPane();
        jScroll.setViewportView(jTable);
        jFrame.add(jScroll);
        jFrame.add(jTable);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    
}
