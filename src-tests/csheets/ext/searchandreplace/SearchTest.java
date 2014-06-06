/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.searchandreplace;

import csheets.CleanSheets;
import csheets.core.Address;
import csheets.core.Spreadsheet;
import csheets.ui.ctrl.UIController;
import csheets.ui.sheet.SpreadsheetTable;
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
 * @author Diogo
 */
public class SearchTest {
    
    public SearchTest() {
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
     * Test of simpleSearch method, of class Search.
     */

    
    @Test
    public void testSimpleSearch() {
        System.out.println("simpleSearch");
        CleanSheets cleanSheets = new CleanSheets();
        UIController controller = new UIController(cleanSheets);
        File file = new File("src-tests/csheets/ext/searchandreplace/testeus22.cls");
        try {
            cleanSheets.load(file);
        } catch (IOException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Spreadsheet s=cleanSheets.getWorkbooks()[0].getSpreadsheet(0);
        
        controller.setActiveWorkbook(cleanSheets.getWorkbooks()[0]);
        controller.setActiveSpreadsheet(s);
        
        SpreadsheetTable focusOwner= new SpreadsheetTable(s, controller);
        
        String text = "a";
        Search instance = new Search();
        Address expResult = new Address(2, 1);
        Address result = instance.simpleSearch(focusOwner, text);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSimpleSearch2() {
        System.out.println("simpleSearch");
        CleanSheets cleanSheets = new CleanSheets();
        UIController controller = new UIController(cleanSheets);
        File file = new File("src-tests/csheets/ext/searchandreplace/testeus22.cls");
        try {
            cleanSheets.load(file);
        } catch (IOException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Spreadsheet s=cleanSheets.getWorkbooks()[0].getSpreadsheet(0);
        
        controller.setActiveWorkbook(cleanSheets.getWorkbooks()[0]);
        controller.setActiveSpreadsheet(s);
        
        SpreadsheetTable focusOwner= new SpreadsheetTable(s, controller);
        
        String text = "1";
        Search instance = new Search();
        Address expResult = new Address(0, 0);
        Address result = instance.simpleSearch(focusOwner, text);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSimpleSearch3() {
        System.out.println("simpleSearch");
        CleanSheets cleanSheets = new CleanSheets();
        UIController controller = new UIController(cleanSheets);
        File file = new File("src-tests/csheets/ext/searchandreplace/testeus22.cls");
        try {
            cleanSheets.load(file);
        } catch (IOException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Spreadsheet s=cleanSheets.getWorkbooks()[0].getSpreadsheet(0);
        
        controller.setActiveWorkbook(cleanSheets.getWorkbooks()[0]);
        controller.setActiveSpreadsheet(s);
        
        SpreadsheetTable focusOwner= new SpreadsheetTable(s, controller);
        
        String text = "VR[0-9]*";
        Search instance = new Search();
        Address expResult = new Address(1, 1);
        Address result = instance.simpleSearch(focusOwner, text);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSimpleSearch4() {
        System.out.println("simpleSearch");
        CleanSheets cleanSheets = new CleanSheets();
        UIController controller = new UIController(cleanSheets);
        File file = new File("src-tests/csheets/ext/searchandreplace/testeus22.cls");
        try {
            cleanSheets.load(file);
        } catch (IOException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Spreadsheet s=cleanSheets.getWorkbooks()[0].getSpreadsheet(0);
        
        controller.setActiveWorkbook(cleanSheets.getWorkbooks()[0]);
        controller.setActiveSpreadsheet(s);
        
        SpreadsheetTable focusOwner= new SpreadsheetTable(s, controller);
        
        String text = "[ ]*";
        Search instance = new Search();
        Address expResult = new Address(5, 0);
        Address result = instance.simpleSearch(focusOwner, text);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSimpleSearch5() {
        System.out.println("simpleSearch");
        CleanSheets cleanSheets = new CleanSheets();
        UIController controller = new UIController(cleanSheets);
        File file = new File("src-tests/csheets/ext/searchandreplace/testeus22.cls");
        try {
            cleanSheets.load(file);
        } catch (IOException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Spreadsheet s=cleanSheets.getWorkbooks()[0].getSpreadsheet(0);
        
        controller.setActiveWorkbook(cleanSheets.getWorkbooks()[0]);
        controller.setActiveSpreadsheet(s);
        
        SpreadsheetTable focusOwner= new SpreadsheetTable(s, controller);
        
        String text = "";
        Search instance = new Search();
        Address expResult = new Address(5, 0);
        Address result = instance.simpleSearch(focusOwner, text);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSimpleSearch6() {
        System.out.println("simpleSearch");
        CleanSheets cleanSheets = new CleanSheets();
        UIController controller = new UIController(cleanSheets);
        File file = new File("src-tests/csheets/ext/searchandreplace/testeus22.cls");
        try {
            cleanSheets.load(file);
        } catch (IOException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Spreadsheet s=cleanSheets.getWorkbooks()[0].getSpreadsheet(0);
        
        controller.setActiveWorkbook(cleanSheets.getWorkbooks()[0]);
        controller.setActiveSpreadsheet(s);
        
        SpreadsheetTable focusOwner= new SpreadsheetTable(s, controller);
        
        String text = null;
        Search instance = new Search();
        Address expResult = null;
        Address result = instance.simpleSearch(focusOwner, text);
        assertEquals(expResult, result);
    }
    
}
