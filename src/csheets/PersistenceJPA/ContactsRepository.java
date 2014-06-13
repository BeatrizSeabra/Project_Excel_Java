/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.PersistenceJPA;

import csheets.ext.contacts.Contact;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Luis and 1090675 - Tiago Pereira
 */
public class ContactsRepository {

    /**
     *
     * @param contact
     */
    public static void add(Contact contact) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        entityManager.persist(contact);
        entityManager.getTransaction().commit();
        csheets.PersistenceJPA.Persistence.getInstance().close();
        //System.err.println("The following contact was added: " + Contact.getFirstName() + " " + Contact.getLastName());
    }

    /**
     * Author: Luís Abreu 1120546
     * Changes the occupation of a contact from the contact table on the JPA database
     * @param contact
     * @param occupation
     * 
     */
    public static void changeOccupation(Contact contact, String occupation) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        Query query = entityManager.createQuery("update Contact c set c.occupation='"+occupation+"' where c.id like :id");
        query.setParameter("id", contact.getId());
        int changed = query.executeUpdate();
        csheets.PersistenceJPA.Persistence.getInstance().close();
    }

    /**
     *  Changes the first name of a contact from the contact table on the JPA database
     * @param contact
     * @param firstName
     */
    public static void changeFirstName(Contact contact, String firstName) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        Query query = entityManager.createQuery("update Contact c set c.lastName='"+firstName+"' where c.id like :id");
        query.setParameter("id", contact.getId());
        int changed = query.executeUpdate();
        csheets.PersistenceJPA.Persistence.getInstance().close();
    }

    /**
     *  Changes the last name of a contact from the contact table on the JPA database
     * @param contact
     * @param lastName
     */
    public static void changeLastName(Contact contact, String lastName) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        Query query = entityManager.createQuery("update Contact c set c.lastName='"+lastName+"' where c.id like :id");
        query.setParameter("id", contact.getId());
        int changed = query.executeUpdate();
        csheets.PersistenceJPA.Persistence.getInstance().close();
    }
    
    /**
     *  Removes a contact from the contact table on the JPA database
     * @param contact
     */
    public static void remove(Contact contact) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
//        String hqlString = "DELETE contact FROM Contact c, WHERE Id=" + contact.getId() + ";";
//        entityManager.createQuery(hqlString).executeUpdate();
//        entityManager.refresh(contact);
//        csheets.PersistenceJPA.Persistence.getInstance().close();
        
        Query query = entityManager.createQuery("delete from Contact c where c.id like :id");
        query.setParameter("id", contact.getId());
        int deleted = query.executeUpdate();
        csheets.PersistenceJPA.Persistence.getInstance().close();

    }
    
    public static void deleteAll() { 
        //long init = 0;  
        //long end;  
        //long diff;  
        //init = System.currentTimeMillis();  
       // open();  
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        try {  
            entityManager.getTransaction().begin();  
            entityManager.createNativeQuery("DELETE FROM Contacts").executeUpdate();
            //entityManager.createNativeQuery("ALTER SEQUENCE GEN_CONTACTS RESTART WITH 0").executeUpdate();
        } catch (Exception e) {  
            System.out.println("Deu erro!" + e);  
            entityManager.getTransaction().rollback(); // desfaz transacao se ocorrer erro ao persitir  
        } finally {  
            if (entityManager.getTransaction().isActive()) {  
                entityManager.getTransaction().commit();  
            }  
            //close();  
            //end = System.currentTimeMillis();  
            //diff = end - init;  
            //System.out.println("Tempo de resposta = " + (diff / 1000.0) + " segundos em JPA - Hibernate");  
  
        }
    }
    
    public static void eliminarTabela() { 
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        entityManager.getTransaction().begin();  
        entityManager.createNativeQuery("DROP TABLE Contacts").executeUpdate();
        entityManager.getTransaction().commit();
                
    }
       
    public static List<Contact> getAll()
    {
        EntityManager em = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");

        Query query = em.createQuery("SELECT c FROM Contact c");
        
        List<Contact> listContact = query.getResultList();
        
        csheets.PersistenceJPA.Persistence.getInstance().close();
        
        return listContact;

    }

}