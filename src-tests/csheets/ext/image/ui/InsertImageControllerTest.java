/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.image.ui;

import csheets.ui.ctrl.UIController;
import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tiago
 */
public class InsertImageControllerTest {
    
    public InsertImageControllerTest() {
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
     * Test of OpenImage method, of class InsertImageController.
     */
    @Test
    public void testOpenImage() {
        System.out.println("OpenImage");
        UIController ui = null;
        InsertImageController instance = new InsertImageController(ui);
        BufferedImage expResult = null;
        BufferedImage result = instance.OpenImage();
        assertEquals(expResult, result);
    }
    
}
