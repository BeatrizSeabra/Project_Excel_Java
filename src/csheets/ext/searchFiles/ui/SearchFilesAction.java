package csheets.ext.searchFiles.ui;

import java.awt.event.ActionEvent;


import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 *
 * @author 1120564MarcoEsteves
 */
public class SearchFilesAction extends BaseAction {

    protected JFrame searchFiles;
    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public SearchFilesAction(UIController uiController) {
        this.uiController = uiController;
        this.searchFiles = searchFiles;
    }

    protected String getName() {
        return "Search Files";
    }

    protected void defineProperties() {
    }

    public void actionPerformed(ActionEvent event) {
        JDialogSearchFiles p= new JDialogSearchFiles(searchFiles,true);
        p.setVisible(true);
        p.setResizable(enabled);
        p.setMinimumSize(new Dimension(40, 40));
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );  
        
        }
    }
