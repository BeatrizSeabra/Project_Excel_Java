/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.networkgame;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class EnforcadoTest {
    
    public EnforcadoTest() {
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
     * Test of init method, of class Enforcado.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Enforcado instance = null;
        instance.init(true);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Enforcado.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Enforcado instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of getRanInt method, of class Enforcado.
     */
    @Test
    public void testGetRanInt() {
        System.out.println("getRanInt");
        Enforcado instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleData method, of class Enforcado.
     */
    @Test
    public void testHandleData() {
        System.out.println("handleData");
        byte[] dados = null;
        Enforcado instance = null;
        instance.handleData(dados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class Enforcado.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        String filename = "";
        Enforcado instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.load(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
