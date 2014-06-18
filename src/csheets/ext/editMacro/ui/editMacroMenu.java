package csheets.ext.editMacro.ui;

import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import csheets.ui.ctrl.UIController;

/**
 * Representa o Menu UI da Extensao edit Macro.
 *
 * @author 1120388
 */
public class editMacroMenu extends JMenu {

    /**
     * Cria um menu da extensao Run Macro.
     */
    public editMacroMenu(UIController uiController) {
        super("Edit Macro");
        setMnemonic(KeyEvent.VK_R);

        // Adds font actions
        add(new editMacroAction(uiController));
    }
}
