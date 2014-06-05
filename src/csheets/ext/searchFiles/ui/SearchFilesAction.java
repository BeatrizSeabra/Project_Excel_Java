package csheets.ext.searchFiles.ui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 * 
 * @author 1120564MarcoEsteves
 */
public class SearchFilesAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public SearchFilesAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Search Files";
	}

	protected void defineProperties() {
	}

	public void actionPerformed(ActionEvent event) {
                
		String pattern=JOptionPane.showInputDialog(null, "Choose a pattern:");
                //File f = new File(pattern);
               // List files = new ArrayList();
                //searchFiles(files, f, pattern);
                String arr [] = new String [30];
                    arr[0]=pattern;
                    arr[1]=pattern;
                    arr[2]=pattern;
                //JOptionPane.showMessageDialog(null, Arrays.toString(arr));
                JOptionPane.showInputDialog(null, "List of files:", "Input", JOptionPane.INFORMATION_MESSAGE, null, arr, "OK");
        }
         
       public static void searchFiles(List files, File f, String pattern) {  
            File[] paths = f.listFiles();  
            for (int i = 0; i < paths.length; ++i) {  
                File pathname = paths[i];  
                String nm = pathname.getName();  
                if (nm.equalsIgnoreCase(pattern)) {  
                    files.add (pathname);  
                }  
                if (pathname.isDirectory() && !nm.equals(".") && !nm.equals("..")) {  
                    searchFiles(files, pathname, pattern);  
                }  
            }  
        }
        
}