/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.PersistenceJPA;

import csheets.ext.contacts.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Nuno
 */
public class ContactsManager {
    
    private static ContactsManager instance;
    
    private ContactsManager() {}
    
    public static synchronized ContactsManager getInstance() {
        if (instance == null) {
            instance = new ContactsManager();
        }
        return instance;
    }
    
    public void insert(Contact contact) {
        EntityManager em = ConnectionManager.getInstance().getEm();
        
        em.persist(contact);
        em.getTransaction().commit();
        
    }
    
    public List<Contact> getAll()
    {
        EntityManager em = ConnectionManager.getInstance().getEm();

        Query query = em.createQuery("SELECT e FROM Contact e");
        
        List<Contact> listContact = new ArrayList<>();
        
        listContact = query.getResultList();
        
        return listContact;

    }
}
