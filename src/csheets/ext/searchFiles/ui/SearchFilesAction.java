package csheets.ext.searchFiles.ui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

import java.io.File;
import java.io.FilenameFilter;


/**
 * 
 * @author 1120564MarcoEsteves
 */
public class SearchFilesAction extends BaseAction {

        private JDialogSearchFiles searchFiles;
	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public SearchFilesAction(UIController uiController) {
		this.uiController = uiController;
                //searchFiles = JDialogSearchFiles();
	}

	protected String getName() {
		return "Search Files";
	}

	protected void defineProperties() {
	}

	public void actionPerformed(ActionEvent event) {
                
		final String pattern=JOptionPane.showInputDialog(null, "Choose a pattern:");
                File dir = new File("D:");
                searchFiles(pattern, dir);
                
        }
         
       public static void searchFiles(final String pattern, File dir) {  
             
                FilenameFilter filter = new FilenameFilter() {
                    public boolean accept(File dir, String name) {
                        return name.contains(pattern);
                    }
                };
                File [] FilesAndDirs = dir.listFiles();
                String [] paths = dir.list(filter);
                /*for (int i = 0; i < FilesAndDirs.length; ++i) {
                    File tempFile = FilesAndDirs[i];
                    String filename = tempFile.getName();
                    
                    if (tempFile.isDirectory() && !filename.equals(".") && !filename.equals("..")) {  
                    searchFiles(pattern, tempFile);
                    }
                }*/
                 
                if (paths == null || paths.length == 0) {
                    JOptionPane.showMessageDialog(null, "No files", "Search Results", JOptionPane.ERROR_MESSAGE);
                }
                else {
                String displayMessage = "";
                    for (String path : paths) {
                        displayMessage += "*   ";
                        displayMessage += path;
                        displayMessage += "\n";
                    }
                JOptionPane.showMessageDialog(null, displayMessage,"List of files:", JOptionPane.INFORMATION_MESSAGE);
        }
       }
 
}