package csheets.ext.runMacro.ui;

import java.awt.event.ActionEvent;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * @author 1120564MarcoEsteves
 */
public class runMacroAction extends BaseAction {

 protected JFrame runMacro;
    /**
     * Controlador da interface com o utilizador.
     */
    protected UIController uiController;

    /**
     * Cria uma nova ação.
     *
     * @param uiController A interface com o utilizador.
     */
    public runMacroAction(UIController uiController) {
        this.uiController = uiController;
        this.runMacro = runMacro;
    }

    protected String getName() {
        return "Run Macro";
    }

    protected void defineProperties() {
    }

    public void actionPerformed(ActionEvent event) {
        JDialogRunMacro p= new JDialogRunMacro(runMacro,true);
        p.setVisible(true);
        p.setResizable(enabled);
        p.setMinimumSize(new Dimension(40, 40));
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );  
        
        }
}