/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable;

import csheets.core.Spreadsheet;
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
        Spreadsheet spreadsheet = null;
        int index = 0;
        SpreadsheetVariableSynchronizer instance = new SpreadsheetVariableSynchronizer();
        instance.spreadsheetInserted(spreadsheet, index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spreadsheetRemoved method, of class SpreadsheetVariableSynchronizer.
     */
    @Test
    public void testSpreadsheetRemoved() {
        System.out.println("spreadsheetRemoved");
        Spreadsheet spreadsheet = null;
        SpreadsheetVariableSynchronizer instance = new SpreadsheetVariableSynchronizer();
        instance.spreadsheetRemoved(spreadsheet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spreadsheetRenamed method, of class SpreadsheetVariableSynchronizer.
     */
    @Test
    public void testSpreadsheetRenamed() {
        System.out.println("spreadsheetRenamed");
        Spreadsheet spreadsheet = null;
        SpreadsheetVariableSynchronizer instance = new SpreadsheetVariableSynchronizer();
        instance.spreadsheetRenamed(spreadsheet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
