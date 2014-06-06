/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.searchFiles.ui;

import java.io.File;
import java.io.FilenameFilter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilizador
 */
public class SearchFilesControllerTest {
    
    public SearchFilesControllerTest() {
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
     * Testa o metodo searchNames da class SearchFilesController.
     */
    @Test
    public void testSearchNames() {
        System.out.println("searchNames");
        String pattern = "tes2";
        String dir = "D:";
        String[] expResult = {"tes2 - Cópia (2).txt"};
        String[] result = SearchFilesController.searchNames(pattern, dir);
        assertArrayEquals(expResult, result);
        
    }
    
    /**
     * Testa o metodo searchNames da class SearchFilesController.
     */
    @Test
    public void testSearchNames2() {
        System.out.println("searchNames");
        String pattern = "teste";
        String dir = "D:";
        String[] expResult = {"1 - testeópia (2).txt","teste.aaaaa-------------------- Is a Directory!!","teste1 - Cópia.txt","teste1.txt","teste2 - Cópia.txt","teste2.txt",};
        String[] result = SearchFilesController.searchNames(pattern, dir);
        assertArrayEquals(expResult, result);
        
    }

     /**
     * Testa o metodo searchFiles da classe SearchFilesController.
     */
    @Test
    public void testSearchFiles() {
        System.out.println("searchFiles");
        final String pattern = "tes2";
        File dir = new File("D:");
        File[] result = SearchFilesController.searchFiles(pattern, dir);
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.contains(pattern);
            }
        };
        File[] expResult = dir.listFiles(filter);
        assertArrayEquals(expResult, result);
       
    }
    
      /**
     * Testa o metodo searchFiles da classe SearchFilesController.
     */
    @Test
    public void testSearchFiles2() {
        System.out.println("searchFiles");
        final String pattern = "teste";
        File dir = new File("D:");
        File[] result = SearchFilesController.searchFiles(pattern, dir);
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.contains(pattern);
            }
        };
        File[] expResult = dir.listFiles(filter);
        assertArrayEquals(expResult, result);
       
    }
    
}
