/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.sort.ui;

/**
 *
 * @author Stefan Parker
 */
import csheets.CleanSheets;
import csheets.core.Cell;
import csheets.core.formula.compiler.FormulaCompilationException;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.util.ArrayList;
import java.util.Collections;
import static javax.swing.Action.SMALL_ICON;
import javax.swing.ImageIcon;

public class SortActionZA extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;
    ArrayList<String> conteudos = new ArrayList();

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public SortActionZA(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Sort Cell from Z-A";
    }

    protected void defineProperties() {
        setEnabled(true);
        putValue(SMALL_ICON, new ImageIcon(CleanSheets.class.getResource("res/img/sort.gif")));
    }

    public void actionPerformed(ActionEvent event) {

        try {
            int maxrows = this.uiController.getActiveSpreadsheet().getRowCount();
            int collumn = this.uiController.getActiveCell().getAddress().getColumn();
            sortZA(maxrows, collumn);

        } catch (Exception ex) {
            // para ja ignoramos a excepcao
        }
    }

    public void sortZA(int maxrows, int collumn) throws FormulaCompilationException {
        if (!conteudos.isEmpty()) {
            conteudos.removeAll(conteudos);
        }
        for (int i = 0; i < maxrows; i++) {
            String conteudo = this.uiController.getActiveSpreadsheet().getCell(collumn, i).getContent();
            if (!(conteudo.isEmpty() || conteudo.equals(" "))) {
                this.uiController.getActiveSpreadsheet().getCell(collumn, i).setContent("");
                conteudos.add(conteudo);
            }
        }
        Collections.sort(conteudos, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(conteudos);
        for (int i = 0; i < conteudos.size(); i++) {
            this.uiController.getActiveSpreadsheet().getCell(collumn, i).setContent(conteudos.get(i));
        }
    }
}
