/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.findworkbooksfiles.ui;

import csheets.ext.findworkbooksfiles.AdvancedWorkbookSearch;
import csheets.ui.FileChooser;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo Moreira (1120339)
 */
public class AdvancedWorkbookSearchAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public AdvancedWorkbookSearchAction(UIController uiController) {
        this.uiController = uiController;
    }

    @Override
    protected String getName() {
        return String.format("Advanced Workbook Search");
    }

    /**
     * An action that represents the functionality to find workbooks files on a
     * specified directory chosen by the user, through the FileChooser component
     * that provides the user a method to choose a diretory on disk. If any
     * files are found, they're shown through a JTable. The information shown is
     * the file name and his path on disk. If there are no files found, a
     * message will pop up on the screen giving that information to the user.
     * The JTable on which the files are shown, is "clickable". If a user
     * selects a row of the table (file name + path) a JDialog will pop up with
     * and the first line of the workbook will be shown. The user will have have
     * two JButtons on the JDialog: Open and Cancel. The Open button will open
     * the selected workbook. The Cancel button will close the JDialog,
     * returning to the JTable. Because of the fact it will be running through a
     * thread, the JTable information will be added as files are found.
     *
     * @param event the event that was fired
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        FileChooser fc = new FileChooser(null, null);
        fc.setFileSelectionMode(FileChooser.DIRECTORIES_ONLY);
        fc.showDialog(null, null);
        if (fc.getSelectedFile() == null) {
            return; //Exit if no file was selected
        }
        AdvancedWorkbookSearch advancedWorkbookSearch = new AdvancedWorkbookSearch();
        JFrameWorkbookSearchResults workbookSearchResults = new JFrameWorkbookSearchResults(null);
        advancedWorkbookSearch.advancedWorkbookSearch(fc.getSelectedFile(), ".*\\.cls", workbookSearchResults);
        JOptionPane.showMessageDialog(null, "The search began!\n This procedure may take a few minutes depending on the size of the directory you selected.\n"
                + "You can keep using the CleanSheets application while the search is running.\n Do NOT close the list until the search is over!");
    }

}
