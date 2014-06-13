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
    public static void insert(Residence residence) {

        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        entityManager.persist(residence);
        entityManager.getTransaction().commit();
        csheets.PersistenceJPA.Persistence.getInstance().close();
    }

    public static List<Residence> getAll() {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        Query query = entityManager.createQuery("SELECT e FROM Residence e");
        //List<Residence> listResidence = new ArrayList<>();
        List<Residence> listResidence = query.getResultList();
        //listResidence = query.getResultList();
        csheets.PersistenceJPA.Persistence.getInstance().close();

        return listResidence;
    }

    public static void edit(Residence residence) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        entityManager.merge(residence);
        entityManager.getTransaction().commit();
        csheets.PersistenceJPA.Persistence.getInstance().close();
    }

    public static void delete(Residence residence) {
        EntityManager entityManager = csheets.PersistenceJPA.Persistence.getInstance().connection("JPA2PU");
        Query query = entityManager.createQuery("delete from Residence c where c.id_residence like :id_residence");
        query.setParameter("id_residence", residence.getId_residence());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        csheets.PersistenceJPA.Persistence.getInstance().close();
    }
    
}