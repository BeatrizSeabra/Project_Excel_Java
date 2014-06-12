/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.runMacro.ui;

import csheets.CleanSheets;
import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.core.Workbook;
import csheets.ui.ctrl.UIController;
import csheets.ui.sheet.SpreadsheetTable;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1120564MarcoEsteves
 */
public class runMacroControllerTest {

    private Spreadsheet s;
    private SpreadsheetTable sT;
    private Workbook wb;
    private CleanSheets ui;
    private UIController controller;

    @Before
    public void setUp() {
        ui = new CleanSheets();
        File file = new File("src-tests/csheets/ext/runMacro/ui/teste.cls");
        try {
            ui.load(file);
        } catch (IOException ex) {
            Logger.getLogger(runMacroControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(runMacroControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller = new UIController(ui);
        s = ui.getWorkbooks()[0].getSpreadsheet(0);

        controller.setActiveWorkbook(ui.getWorkbooks()[0]);
        controller.setActiveSpreadsheet(s);

        sT = new SpreadsheetTable(s, controller);
    }

    /**
     * Teste unitario ao metodo Results.
     */
    @Test
    public void testResults() {
        System.out.println("results");
        String macro = "=1+2";
        runMacroController instance = new runMacroController(sT, controller);
        String expResult = "1+2= 3\n";
        String result = instance.results(macro);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste unitario ao metodo Results.
     */
    @Test
    public void testResults2() {
        System.out.println("results");
        String macro = "=5*4";
        runMacroController instance = new runMacroController(sT, controller);
        String expResult = "5*4= 20\n";
        String result = instance.results(macro);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Teste unitario ao metodo GetEmptyCell.
     */
    @Test
    public void testGetEmptyCell() {
        System.out.println("getEmptyCell");
        int x = 40;
        int y = 40;
        runMacroController instance = new runMacroController(sT, controller);
        Cell expResult = this.controller.getActiveSpreadsheet().getCell(x, y);;
        Cell result = instance.getEmptyCell(x, y);
        assertEquals(expResult, result);

    }

}
