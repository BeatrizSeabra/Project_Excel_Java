/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.logfile;

import csheets.core.Cell;
import csheets.core.CellListener;
import csheets.core.formula.Expression;
import csheets.core.formula.compiler.ExcelExpressionCompiler;
import csheets.core.formula.compiler.FormulaCompilationException;
import csheets.ui.ctrl.UIController;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefan Parker
 */
public class AtributeFormula {

    String evento, formula;
    public boolean activo = false;
    public static ArrayList<String> eve = new ArrayList();
    public static ArrayList<String> form = new ArrayList();

    public AtributeFormula() {
    }

    public AtributeFormula(String evento, String formula) {
        setEvento(evento);
        setFormula(formula);
    }

    public String getEvento() {
        return evento;
    }

    public String getFormula() {
        return formula;
    }

    public ArrayList<String> getEve() {
        return eve;
    }

    public ArrayList<String> getForm() {
        return form;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setEvento(String evento) {
        this.evento = evento;
        eve.add(this.evento);
        activo = true;
    }

    public void setFormula(String formula) {
        this.formula = formula;
        form.add(this.formula);
    }

    public void addEvent(UIController uiController, String formula, String[] event) {
        Expression compile = null;
        ExcelExpressionCompiler ec = new ExcelExpressionCompiler();
        this.formula = formula;
        boolean exist = false;

        //check if the formula is valid
        try {
            compile = ec.compile(uiController.getActiveCell(), formula);

            Cell cell = uiController.getActiveCell();
            if (event[0].equals("onChange")) {
                cell.addCellListener(new OnChangeListener());
                exist = true;
            }
            if (event[1].equals("onClick")) {
                cell.addCellListener(new OnClickListener());
                exist = true;
            }
            if (exist) {
                JOptionPane.showMessageDialog(null, "Done!");
            }

        } catch (FormulaCompilationException ex) {
            JOptionPane.showMessageDialog(null, "Error formula! Insert a valid formula!!");
        }

    }

    class OnChangeListener implements CellListener {

        @Override
        public void valueChanged(Cell cell) {
            try {
                cell.setContent(formula);
            } catch (FormulaCompilationException ex) {
                Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
            }
            WriteLogFile.writeLogFile(null, "onChange", null, formula);
        }

        @Override
        public void contentChanged(Cell cell) {
            try {
                cell.setContent(formula);
            } catch (FormulaCompilationException ex) {
                Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
            }
            WriteLogFile.writeLogFile(null, "onChange", null, formula);
        }

        @Override
        public void dependentsChanged(Cell cell) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void cellCleared(Cell cell) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void cellCopied(Cell cell, Cell source) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class OnClickListener implements CellListener {

        @Override
        public void valueChanged(Cell cell) {
            try {
                cell.setContent(formula);
            } catch (FormulaCompilationException ex) {
                Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
            }
            WriteLogFile.writeLogFile(null, "onClick", null, formula);
        }

        @Override
        public void contentChanged(Cell cell) {
            try {
                cell.setContent(formula);
            } catch (FormulaCompilationException ex) {
                Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
            }
            WriteLogFile.writeLogFile(null, "onClick", null, formula);
        }

        @Override
        public void dependentsChanged(Cell cell) {
            try {
                cell.setContent(formula);
            } catch (FormulaCompilationException ex) {
                Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
            }
            WriteLogFile.writeLogFile(null, "onClick", null, formula);
        }

        @Override
        public void cellCleared(Cell cell) {
            try {
                cell.setContent(formula);
            } catch (FormulaCompilationException ex) {
                Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
            }
            WriteLogFile.writeLogFile(null, "onClick", null, formula);
        }

        @Override
        public void cellCopied(Cell cell, Cell source) {
            try {
                cell.setContent(formula);
            } catch (FormulaCompilationException ex) {
                Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
            }
            WriteLogFile.writeLogFile(null, "onClick", null, formula);
        }

    }

}
