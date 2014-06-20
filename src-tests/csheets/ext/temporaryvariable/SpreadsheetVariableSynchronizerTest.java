/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable;

import csheets.core.Spreadsheet;
import csheets.core.SpreadsheetImpl;
import csheets.core.Workbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class SpreadsheetVariableSynchronizerTest {
    
    public SpreadsheetVariableSynchronizerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of spreadsheetInserted method, of class SpreadsheetVariableSynchronizer.
     */
    @Test
    public void testSpreadsheetInserted() {
        System.out.println("spreadsheetInserted");
        Workbook wb = new Workbook();
        wb.addSpreadsheet();
        Spreadsheet spreadsheet=wb.getSpreadsheet(0);
        int index = 0;
        SpreadsheetVariableSynchronizer instance = new SpreadsheetVariableSynchronizer();
        instance.spreadsheetInserted(spreadsheet, index);
    }
}
