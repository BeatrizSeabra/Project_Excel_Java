/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.core.formula.lang;

import csheets.core.Address;
import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.core.Value;
import csheets.core.Workbook;
import csheets.core.formula.Expression;
import csheets.core.formula.Formula;
import csheets.core.formula.Literal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class AttributionTest {
    
    public AttributionTest() {
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
     * Test of applyTo method, of class Attribution.
     */
    @Test
    public void testApplyTo() throws Exception {
      // Fetches a cell
       Workbook workbook = new Workbook(1);
       Spreadsheet sheet = workbook.getSpreadsheet(0);
       Cell cell = sheet.getCell(new Address(0, 0));
       Expression leftOperand = new CellReference(cell);
       Expression rightOperand = new Formula(cell, new Literal(new Value(5)));
       Attribution instance = new Attribution();
       Value expResult = new Value(new Double(5));
       Value result = instance.applyTo(leftOperand, rightOperand);
       System.out.println("result: "+ result.toNumber());
       System.out.println("expResult: "+ expResult.toNumber());
       assertEquals(expResult, result);

    }

    /**
     * Test of getIdentifier method, of class Attribution.
     */
    @Test
    public void testGetIdentifier() {
        System.out.println("getIdentifier");
        Attribution instance = new Attribution();
        String expResult = ":=";
        String result = instance.getIdentifier();
        assertEquals(expResult, result);
      }

    /**
     * Test of getOperandValueType method, of class Attribution.
     */
    @Test
    public void testGetOperandValueType() {
        System.out.println("getOperandValueType");
        Attribution instance = new Attribution();
        Value.Type expResult = Value.Type.NUMERIC;
        Value.Type result = instance.getOperandValueType();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Attribution.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Attribution instance = new Attribution();
        String expResult = ":=";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
