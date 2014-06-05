/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.PersistenceJPA;

import csheets.ext.contacts.Contact;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class ContactsRepositoryTest {
    
    public ContactsRepositoryTest() {
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
     * Test of add method, of class ContactsRepository.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Contact contact = null;
        ContactsRepository.add(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeOccupation method, of class ContactsRepository.
     */
    @Test
    public void testChangeOccupation() {
        System.out.println("changeOccupation");
        Contact contact = new Contact("Teste1","teste2");
        String occupation = "Dentist";
        ContactsRepository.changeOccupation(contact, occupation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeFirstName method, of class ContactsRepository.
     */
    @Test
    public void testChangeFirstName() {
        System.out.println("changeFirstName");
        Contact contact = null;
        String firstName = "";
        ContactsRepository.changeFirstName(contact, firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeLastName method, of class ContactsRepository.
     */
    @Test
    public void testChangeLastName() {
        System.out.println("changeLastName");
        Contact contact = null;
        String lastName = "";
        ContactsRepository.changeLastName(contact, lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ContactsRepository.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Contact contact = null;
        ContactsRepository.remove(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class ContactsRepository.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Contact> expResult = null;
        List<Contact> result = ContactsRepository.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
