/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.sort.ui;

import csheets.CleanSheets;
import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.core.Workbook;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stefan Parker
 */
public class SortActionZATest {
    
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
        UIController uiController=null;
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
        UIController uiController=null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.defineProperties();
        
    }

    /**
     * Test of actionPerformed method, of class SortActionZA.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        UIController uiController=null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.actionPerformed(event);
        
    }

    /**
     * Test of sortZA method, of class SortActionZA.
     */
    @Test
    public void testSortZA() throws Exception {
        System.out.println("sortZA");
        ArrayList<String> conteudos = new ArrayList();
        conteudos.add("e");
        conteudos.add("d");
        conteudos.add("c");
        conteudos.add("b");
        conteudos.add("a");
        CleanSheets cs= new CleanSheets();
        UIController uiController = new UIController(cs);
        Workbook wb=new Workbook(2);
	Spreadsheet s=wb.getSpreadsheet(0);
        Cell c=s.getCell(0,0);
        s.getCell(0,0).setContent("a");
        s.getCell(0,1).setContent("b");
        s.getCell(0,2).setContent("c");
        s.getCell(0,3).setContent("d");
        s.getCell(0,4).setContent("e");
        int maxrows = 5;
        int collumn = 0;
        SortActionZA instance = new SortActionZA(uiController);
        instance.sortZA(maxrows, collumn);
        assertEquals(conteudos, instance.conteudos);
    }
    
}
