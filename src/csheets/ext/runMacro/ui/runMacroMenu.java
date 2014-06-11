package csheets.ext.runMacro.ui;

import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import csheets.ui.ctrl.UIController;

/**
 * Representa o Menu UI da Extensao Run Macro.
 *
 * @author 1120564MacroEsteves
 */
public class runMacroMenu extends JMenu {

    /**
     * Cria um menu da extensao Run Macro.
     */
    public runMacroMenu(UIController uiController) {
        super("Run Macro");
        setMnemonic(KeyEvent.VK_R);

        // Adds font actions
        add(new runMacroAction(uiController));
    }
}
