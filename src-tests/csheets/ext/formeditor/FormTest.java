/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor;

import java.util.ArrayList;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oleg
 */
public class FormTest {
    
    public FormTest() {
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
     * Test of getnLines method, of class Form.
     */
    @Test
    public void testGetnLines() {
        System.out.println("getnLines");
        int d = 1;
        String[] s = {"selected"};
        Form instance = new Form(d, s);
        int expResult = 1;
        int result = instance.getnLines();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSelected method, of class Form.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        int d = 2;
        String [] s = {"selected", "open"};
        Form instance = new Form(d, s);
        String[] expResult = {"selected", "open"};
        String[] result = instance.getSelected();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getButtonList method, of class Form.
     */
    @Test
    public void testGetButtonList() {
        System.out.println("getButtonList");
        ArrayList<String> s = new ArrayList();
        s.add("ok");
        s.add("open");
        Form instance = new Form();
        instance.setButtonList(s);
        ArrayList expResult = s;
        ArrayList result = instance.getButtonList();
        assertEquals(expResult, result);
    }
}