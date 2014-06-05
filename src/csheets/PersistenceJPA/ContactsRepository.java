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
 * @author Luis
 */
public class ContactsRepository {

    public void add(Contact contact) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(contact);
        entityManager.getTransaction().commit();
        entityManager.close();
        //System.err.println("The following contact was added: " + Contact.getFirstName() + " " + Contact.getLastName());

    }

    public void changeOccupation(Contact contact, String occupation) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getEntityManager();
        entityManager.getTransaction().begin();
        String hqlString = "UPDATE Contacts SET Occupation='" + occupation + "', WHERE Id='" + contact.getId() + "';";
        entityManager.createQuery(hqlString).executeUpdate();
        entityManager.refresh(contact);
        entityManager.close();
    }

    public void changeFirstName(Contact contact, String firstName) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getEntityManager();
        entityManager.getTransaction().begin();
        String hqlString = "UPDATE Contacts SET firstName='" + firstName + "', WHERE Id='" + contact.getId() + "';";
        entityManager.createQuery(hqlString).executeUpdate();
        entityManager.refresh(contact);
        entityManager.close();
    }

    public void changeLastName(Contact contact, String lastName) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getEntityManager();
        entityManager.getTransaction().begin();
        String hqlString = "UPDATE Contacts SET lastName='" + lastName + "', WHERE Id='" + contact.getId() + "';";
        entityManager.createQuery(hqlString).executeUpdate();
        entityManager.refresh(contact);
        entityManager.close();

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
