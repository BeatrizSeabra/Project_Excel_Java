/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.PersistenceJPA;

import csheets.ext.contacts.Residence;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Nuno
 */
public class ResidenceRepository {
    
//    private static ResidenceRepository instance;
//    
//    private ResidenceRepository() {}
//    
//    public static synchronized ResidenceRepository getInstance() {
//        if (instance == null) {
//            instance = new ResidenceRepository();
//        }
//        return instance;
//    }
    
    public void insert(Residence residence) {

        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        entityManager.getTransaction().begin();
        entityManager.persist(residence);
        entityManager.getTransaction().commit();
        csheets.PersistenceJPA.Persistence.getInstance().close(); 
        
    }
    
    public List<Residence> getAll()
    {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT e FROM Residence e");
        List<Residence> listResidence = new ArrayList<>();
        listResidence = query.getResultList();

        return listResidence;

    }
}
