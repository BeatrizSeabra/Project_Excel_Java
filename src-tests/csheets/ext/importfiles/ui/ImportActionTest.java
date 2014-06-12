/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.importfiles.ui;

import java.awt.event.ActionEvent;
import java.io.File;
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
public class ImportActionTest {
    
    public ImportActionTest() {
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
     * Test of getName method, of class ImportAction.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ImportAction instance = null;
        String expResult = "TEXT ";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of defineProperties method, of class ImportAction.
     */
    @Test
    public void testDefineProperties() {
        System.out.println("defineProperties");
        ImportAction instance = null;
        instance.defineProperties();
      
    }

    /**
     * Test of actionPerformed method, of class ImportAction.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        ImportAction instance = null;
        instance.actionPerformed(event);
      
    }

    /**
     * Test of getFile method, of class ImportAction.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        ImportAction instance = null;
        File expResult = null;
        File result = instance.getFile();
        assertEquals(expResult, result);
       
    }
    
}
