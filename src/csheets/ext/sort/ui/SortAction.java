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
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import csheets.ui.sheet.CellTransferHandler;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;

public class SortAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;
    ArrayList<String> conteudos = new ArrayList();
    List<Integer> conteudosN = new ArrayList();
    protected CellTransferHandler cth = new CellTransferHandler();
    int contR = 0;
    int contC = 0;
    Cell[][] range = new Cell[contC][contR];

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public SortAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Sort Cell from A-Z";
    }

    protected void defineProperties() {
        setEnabled(true);
        putValue(SMALL_ICON, new ImageIcon(CleanSheets.class.getResource("res/img/sort.gif")));
    }

    public ArrayList getCollumns() {
        ArrayList al = new ArrayList();

        for (int i = 0; i < range.length; i++) {
            contR++;
            for (int j = 0; j < range[i].length; j++) {
                if (!al.contains(range[i][j].getAddress().getColumn())) {
                    contC++;
                    al.add(range[i][j].getAddress().getColumn());
                }
            }
        }
        return al;
    }
    /*
     added a few lines of code to the previous method of sorting
     week 2 US008
     */

    public void actionPerformed(ActionEvent event) {

        try {
            int maxrows = this.uiController.getActiveSpreadsheet().getRowCount();
            cth = (CellTransferHandler) this.uiController.getCellTransferHandler();
            range = cth.getSelec();

            ArrayList columns = getCollumns();
            for (int i = 0; i < columns.size(); i++) {
                sortAZ(maxrows, (int) columns.get(i));
            }
        } catch (FormulaCompilationException ex) {
            System.out.println("Não foi possivel localizar a celula ativa ou o numero de linhas existentes");
        }
    }

    public void sortAZ(int maxrows, int collumn) throws FormulaCompilationException {
        checkListEmpty();
        //addToLists(maxrows, collumn);
        //String col = askColumn();
        orderContents();
        setContentCells(collumn);

    }

    /*public void addToLists(int maxrows, int collumn) throws FormulaCompilationException {
     for (int i = 0; i < maxrows; i++) {
     String conteudo = this.uiController.getActiveSpreadsheet().getCell(collumn, i).getContent();
     try {
     int conteudoN = Integer.parseInt(conteudo);
     this.uiController.getActiveSpreadsheet().getCell(collumn, i).setContent("");
     conteudosN.add(conteudoN);
     } catch (NumberFormatException e) {
     if (!(conteudo.isEmpty() || conteudo.equals(" "))) {
     this.uiController.getActiveSpreadsheet().getCell(collumn, i).setContent("");
     conteudos.add(conteudo);
     }
     }
     }
     }*/
    public void checkListEmpty() {
        if (!conteudos.isEmpty()) {
            conteudos.removeAll(conteudos);
        }
        if (!conteudosN.isEmpty()) {
            conteudosN.removeAll(conteudosN);
        }
    }

    public void setContentCells(int collumn) throws FormulaCompilationException {
        for (int j = 0; j < conteudosN.size(); j++) {
            this.uiController.getActiveSpreadsheet().getCell(collumn, j).setContent(Integer.toString(conteudosN.get(j)));
        }
        for (int i = 0; i < conteudos.size(); i++) {
            this.uiController.getActiveSpreadsheet().getCell(collumn, i + conteudosN.size()).setContent(conteudos.get(i));
        }

    }

    public void orderContents() throws FormulaCompilationException {
        boolean sorting = true;
        while (sorting == true) {
            sorting = false;
            int j = 0;
            for (int i = 0; i < range.length - 1; i++) {
                String firstValue = range[i][0].getContent();
                String secondValue = range[i + 1][0].getContent();
                if (secondValue.compareToIgnoreCase(firstValue) < 0) {
                    for (j = 0; j < range[0].length; j++) {
                        String tmp = range[i][j].getContent();
                        range[i][j].setContent(range[i + 1][j].getContent());
                        range[i + 1][j].setContent(tmp);
                        sorting = true;
                    }
                }
            }
        }
    }


    /*public String askColumn() {
     String col = JOptionPane.showInputDialog("Choose a Column:", JOptionPane.QUESTION_MESSAGE);
     return col;
     }*/
}
