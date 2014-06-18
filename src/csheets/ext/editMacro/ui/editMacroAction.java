package csheets.ext.editMacro.ui;

import java.awt.event.ActionEvent;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Representa a acçao de executar a extensao Edit Macro.
 *
 * @author 1120388
 */
public class editMacroAction extends BaseAction {

    /**
     * Controlador da interface com o utilizador.
     */
    protected UIController uiController;

    /**
     * Cria uma nova ação.
     *
     * @param uiController A interface com o utilizador.
     */
    public editMacroAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Edit Macro";
    }

    protected void defineProperties() {
    }

    public void actionPerformed(ActionEvent event) {
        JDialogEditMacro editMacro = new JDialogEditMacro(null, true, uiController);
        editMacro.setTitle("RUN MACRO");
        editMacro.setVisible(true);
        editMacro.setResizable(enabled);
        editMacro.setMinimumSize(new Dimension(40, 40));
        editMacro.setLocationRelativeTo(null);
        editMacro.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
