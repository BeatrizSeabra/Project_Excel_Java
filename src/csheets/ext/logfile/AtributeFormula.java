/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.logfile;

import csheets.core.Address;
import csheets.core.Cell;
import csheets.core.CellListener;
import csheets.core.Spreadsheet;
import csheets.core.Workbook;
import csheets.core.WorkbookListener;
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

    private String evento, formula;
    private boolean activo = false;
    private static ArrayList<String> eve = new ArrayList();
    private static ArrayList<String> form = new ArrayList();
    private Address address;

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

    public void addCellEvent(UIController uiController, String formula, String[] event) {
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

    public void addWorkbookEvent(UIController uiController, String formula, String[] event) {
        Expression compile = null;
        ExcelExpressionCompiler ec = new ExcelExpressionCompiler();
        this.formula = formula;
        boolean exist = false;

        //check if the formula is valid
        try {

            Cell cell = uiController.getActiveCell();
            address = cell.getAddress();
            compile = ec.compile(cell, formula);

            Workbook workbook = uiController.getActiveWorkbook();

            if (event[0].equals("Open")) {
                workbook.addWorkbookListener(null);
                exist = true;
            }
            if (event[1].equals("Close")) {
                workbook.addWorkbookListener(null);
                exist = true;
            }
            if (event[2].equals("sheetCreated")) {
                workbook.addWorkbookListener(new WorkbookListener() {

                    @Override
                    public void spreadsheetInserted(Spreadsheet spreadsheet, int index) {
                        try {
                            spreadsheet.getCell(address).setContent(getFormula());
                        } catch (FormulaCompilationException ex) {
                            Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        WriteLogFile.writeLogFile(null, "sheetDeleted", null, getFormula());
                    }

                    @Override
                    public void spreadsheetRemoved(Spreadsheet spreadsheet) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void spreadsheetRenamed(Spreadsheet spreadsheet) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
                exist = true;
            }
            if (event[3].equals("sheetDeleted")) {
                workbook.addWorkbookListener(new WorkbookListener() {

                    @Override
                    public void spreadsheetInserted(Spreadsheet spreadsheet, int index) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void spreadsheetRemoved(Spreadsheet spreadsheet) {
                        try {
                            spreadsheet.getCell(address).setContent(getFormula());
                        } catch (FormulaCompilationException ex) {
                            Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        WriteLogFile.writeLogFile(null, "sheetDeleted", null, getFormula());
                    }

                    @Override
                    public void spreadsheetRenamed(Spreadsheet spreadsheet) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
                exist = true;
            }
            if (event[4].equals("sheetRenamed")) {
                workbook.addWorkbookListener(new WorkbookListener() {

                    @Override
                    public void spreadsheetInserted(Spreadsheet spreadsheet, int index) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void spreadsheetRemoved(Spreadsheet spreadsheet) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void spreadsheetRenamed(Spreadsheet spreadsheet) {
                        try {
                            spreadsheet.getCell(address).setContent(getFormula());
                        } catch (FormulaCompilationException ex) {
                            Logger.getLogger(AtributeFormula.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        WriteLogFile.writeLogFile(null, "sheetRenamed", null, getFormula());
                    }
                });
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
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void contentChanged(Cell cell) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
