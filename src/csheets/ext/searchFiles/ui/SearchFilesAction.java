package csheets.ext.searchFiles.ui;

import java.awt.event.ActionEvent;


import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 *
 * @author 1120564MarcoEsteves
 */
public class SearchFilesAction extends BaseAction {

    protected JFrame searchFiles;
    /**
     * Controlador da interface com o utilizador.
     */
    protected UIController uiController;

    /**
     * Cria uma nova ação.
     *
     * @param uiController A interface com o utilizador.
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
        p.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );  
        
        }
    }
