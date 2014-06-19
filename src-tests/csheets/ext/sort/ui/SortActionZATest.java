/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.sort.ui;

import csheets.CleanSheets;
import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.core.formula.compiler.FormulaCompilationException;
import csheets.ext.runMacro.ui.runMacroControllerTest;
import csheets.ui.ctrl.UIController;
import csheets.ui.sheet.SpreadsheetTable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stefan Parker
 * @author 1120564MarcoEsteves (week3)
 */
public class SortActionZATest {

    private Spreadsheet s;
    private SpreadsheetTable sT;
    private CleanSheets ui;
    private UIController controller;
    Cell[][] range = new Cell[3][1];

    public SortActionZATest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ui = new CleanSheets();
        File file = new File("src-tests/csheets/ext/sort/ui/SortTest.cls");
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

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class SortActionZA.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UIController uiController = null;
        SortActionZA instance = new SortActionZA(uiController);
        String expResult = "Sort Cell from Z-A";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of defineProperties method, of class SortActionZA.
     */
    @Test
    public void testDefineProperties() {
        System.out.println("defineProperties");
        UIController uiController = null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.defineProperties();

    }

    /**
     * Test of checkListEmpty method, of class SortActionZA.
     */
    @Test
    public void testCheckListEmpty() {
        System.out.println("checkListEmpty");
        UIController uiController = null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.checkListEmpty();
        int expected = 0;
        int result = instance.conteudos.size();
        assertEquals(expected, result);

    }

    /**
     * Test of orderContents method, of class SortActionZA.
     */
    @Test
    public void testOrderContents() throws FormulaCompilationException {
        System.out.println("orderContents");
        SortAction instance = new SortAction(controller);
        instance.range = new Cell[1][3];
        for (int i = 0; i < 3; i++) {
            instance.range[0][i] = sT.getSpreadsheet().getCell(0, i);
            instance.range[0][i].setContent(sT.getSpreadsheet().getCell(0, i).getContent());
        }
        instance.orderContents(0);
        SortAction expResult = new SortAction(controller);
        expResult.range = new Cell[1][3];
        expResult.range[0][0] = sT.getSpreadsheet().getCell(0, 0);
        expResult.range[0][1] = sT.getSpreadsheet().getCell(0, 1);
        expResult.range[0][2] = sT.getSpreadsheet().getCell(0, 2);
        expResult.range[0][0].setContent(sT.getSpreadsheet().getCell(0, 1).getContent());
        expResult.range[0][1].setContent(sT.getSpreadsheet().getCell(0, 0).getContent());
        expResult.range[0][2].setContent(sT.getSpreadsheet().getCell(0, 2).getContent());
        Assert.assertArrayEquals(instance.range, expResult.range);
    }

    /**
     * Test of getCollumns method, of class SortActionZA.
     */
    @Test
    public void testGetCollumns() throws FormulaCompilationException {
        System.out.println("getCollumns");
        ArrayList expResult = new ArrayList();
        SortAction instance = new SortAction(controller);
        instance.range = new Cell[1][3];
        for (int i = 0; i < 3; i++) {
            instance.range[0][i] = sT.getSpreadsheet().getCell(0, i);
            instance.range[0][i].setContent(sT.getSpreadsheet().getCell(0, i).getContent());
        }
        int[] col = new int[1];
        col[0] = 1;
        expResult.add(col);
        ArrayList result = instance.getCollumns();
        assertEquals(expResult, result);

    }

    /**
     * Test of askColumn method, of class SortActionZA.
     */
    @Test
    public void testAskColumn() throws FormulaCompilationException {
        System.out.println("askColumn");
        ArrayList columns = new ArrayList();
        Object[] col = new String[1];
        col[0] = "0";
        columns.add(col.toString());
        String[] abc = {"A"};
        SortAction instance = new SortAction(controller);
        instance.range = new Cell[1][3];
        for (int i = 0; i < 3; i++) {
            instance.range[0][i] = sT.getSpreadsheet().getCell(0, i);
            instance.range[0][i].setContent(sT.getSpreadsheet().getCell(0, i).getContent());

        }
        String expResult = "A";
        String result = instance.askColumn(columns, abc);
        assertEquals(expResult, result);
    }
}
