package csheets.ext.findworkbooksfiles.ui;

import csheets.ext.findworkbooksfiles.FindWorkbooksFiles;
import csheets.ui.FileChooser;
import java.awt.event.ActionEvent;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * An action that allow to search workbooks files, in a directory choosed from user,
 through file chooser window (instance of FileChooser class), and then class
 FindWorkbooksFiles will search for workbooks files, on the directory picked from user,
 and if the files exist, an instance of the class JFrameWorkbookSearchResults(extends JFrame),
 will be created, to show an window with table style, to inform the name(s)and
 the path(s) of that file(s), to user.
 * @author 1090675 - Tiago Pereira
 */
public class FindWorkbooksFilesAction extends BaseAction {
    
    /** The user interface controller */
    protected UIController uiController;

    /**
     * Creates a new action.
     * @param uiController the user interface controller
     */
    public FindWorkbooksFilesAction(UIController uiController) {
            this.uiController = uiController;
    }

    @Override
    protected String getName() {
            return "Find Workbooks Files...";
    }

    @Override
    protected void defineProperties() {
    }

    /**
     * A action that presents the functionality to find workbooks files on
     * specified directory choose by the user, indicated through the FileChooser
     * component that provides to user choice a diretory on disk, and then show
     * to the user, an window represent a table model, if the directory will have
     * workbooks files, inform the name and the respective path of the file, otherwise
     * if the specified directory don´t have any workbooks files, inform the user
     * through message. The listing of the founded files are shown alphabetically.
     * 
     * @param event the event that was fired
     */
    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent event) 
    {
        FileChooser fc = new FileChooser(null,null);
        fc.setFileSelectionMode(FileChooser.DIRECTORIES_ONLY);
        fc.showDialog(null, null);
        FindWorkbooksFiles findWF = new FindWorkbooksFiles();
        List<File> listingFiles = findWF.findWorkbooksFiles(fc.getSelectedFile(), ".*\\.cls");
        // Sort listingFiles by alphabetical order
        class ComparatorFiles implements Comparator<File> 
        {
            @Override
            public int compare(File f1, File f2) 
            {
                return f1.getName().compareTo(f2.getName());                  
            }  
        }; 
        Collections.sort(listingFiles, new ComparatorFiles());        
        if (listingFiles.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"The currently directory don´t have any workbooks files!",
                    "Workbooks Files Not Founded",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {                
            JFrameWorkbookSearchResults windowLWF = new JFrameWorkbookSearchResults(listingFiles);
        }
    }
        
}