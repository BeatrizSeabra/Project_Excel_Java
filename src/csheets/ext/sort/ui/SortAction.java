/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.sort.ui;

/**
 *
 * @author Stefan Parker
 * @author 1120564MarcoEsteves (week3)
 */
import csheets.CleanSheets;
import csheets.core.Cell;
import csheets.core.formula.compiler.FormulaCompilationException;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import csheets.ui.sheet.CellTransferHandler;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
    String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
        "T", "U", "V", "W", "X", "Y", "Z", "A", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM",
        "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AW", "AX", "AY", "AZ"};

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
            int k = 0;
            String col = askColumn(columns, abc);
            if (col != "A") {
                for (int m = 0; m < abc.length; m++) {
                    if (col == abc[m].toString()) {
                        k = m;
                    }
                }
            }

            for (int i = 0; i < columns.size(); i++) {
                sortAZ(maxrows, (int) columns.get(i), columns, k);
            }
        } catch (FormulaCompilationException ex) {
            System.out.println("Não foi possivel localizar a celula ativa ou o numero de linhas existentes");
        }
    }

    public void sortAZ(int maxrows, int collumn, ArrayList columns, int k) throws FormulaCompilationException {
        checkListEmpty();
        //addToLists(maxrows, collumn);    
        orderContents(k);
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

    /**
     * Method to sort the contents of the cells.
     *
     *
     */
    public void orderContents(int k) throws FormulaCompilationException {
        boolean sorting = true;
        while (sorting == true) {

            sorting = false;
            for (int i = 0; i < range.length - 1; i++) {
                try {
                    int number1 = Integer.parseInt(range[i][k].getContent());
                    int number2 = Integer.parseInt(range[i + 1][k].getContent());
                    if (number2 < number1) {
                        for (int j = 0; j < range[0].length; j++) {
                            String tmp = range[i][j].getContent();
                            range[i][j].setContent(range[i + 1][j].getContent());
                            range[i + 1][j].setContent(tmp);
                            sorting = true;
                        }
                    }
                } catch (NumberFormatException nfe) {
                    String firstValue = range[i][k].getContent();
                    String secondValue = range[i + 1][k].getContent();
                    if (secondValue.compareToIgnoreCase(firstValue) < 0) {
                        for (int j = 0; j < range[0].length; j++) {
                            String tmp = range[i][j].getContent();
                            range[i][j].setContent(range[i + 1][j].getContent());
                            range[i + 1][j].setContent(tmp);
                            sorting = true;
                        }
                    }
                }
            }
        }
    }

    /**
     * Method to ask the user to reference column.
     *
     *
     */
    public String askColumn(ArrayList columns, String[] abc) {

        if (columns.size() != 1) {
            Object[] col = new String[columns.size()];
            int n = 0;
            for (Object obj : columns) {
                for (int i = 0; i < abc.length; i++) {
                    if (obj.equals(i)) {
                        col[n] = abc[i].toString();
                        n++;
                    }
                }
            }
            Object tmp = JOptionPane.showInputDialog(null, "Choose a Reference Column", "REFERENCE COLUMN", JOptionPane.QUESTION_MESSAGE, null, col, col[0]);
            String column = tmp.toString();
            return column;
        } else {
            Object[] col = new String[columns.size()];
            int n = 0;
            for (Object obj : columns) {
                for (int i = 0; i < abc.length; i++) {
                    if (obj.equals(i)) {
                        col[n] = abc[i].toString();
                        n++;
                    }
                }
            }
            String column = col.toString();
            return column;
        }
    }
}
