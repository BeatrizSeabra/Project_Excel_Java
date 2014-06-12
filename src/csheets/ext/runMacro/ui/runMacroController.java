package csheets.ext.runMacro.ui;

import csheets.core.Cell;
import csheets.core.Workbook;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;
import csheets.ui.sheet.SpreadsheetTable;
import java.awt.event.ActionEvent;

/**
 *
 * @author 1120564MarcoEsteves
 */
public class runMacroController extends FocusOwnerAction {

    protected UIController uiController;

    public runMacroController(SpreadsheetTable focusOwner, UIController uicont) {
        this.focusOwner = focusOwner;
        this.uiController = uicont;
    }

    /**
     * Recebe a macro, e depois de executa-la, envia os resultados numa string.
     */
    public String results(String macro) {
        String[] lines = macro.split("\n");
        int x = 0;
        int y = 0;
        Cell tmp = getEmptyCell(x, y);
        String res = "";

        for (int i = 0; i < lines.length; i++) {
            try {
                String content = lines[i];

                tmp.setContent(content);
                res = res + tmp.getFormula() + "= ";
                res = res + tmp.getFormula().evaluate().toString() + "\n";

                tmp.setContent("");
            } catch (Exception e) {
                System.err.println(e);
            }

        }
        return res;
    }

    /**
     * Este metodo, retorna uma celula vazia.
     */
    public Cell getEmptyCell(int x, int y) {
        Cell tmp = this.uiController.getActiveSpreadsheet().getCell(x, y);
        if (!"".equals(tmp.getContent())) {
            ++x;
            tmp = getEmptyCell(x, y);
        }
        return tmp;
    }

    protected String getName() {
        return "Run Action";

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
