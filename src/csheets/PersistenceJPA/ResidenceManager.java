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
public class ResidenceManager {
    
    private static ResidenceManager instance;
    
    private ResidenceManager() {}
    
    public static synchronized ResidenceManager getInstance() {
        if (instance == null) {
            instance = new ResidenceManager();
        }
        return instance;
    }
    
    public void insert(Residence residence) {
        EntityManager em = ConnectionManager.getInstance().getEm();
        
        em.persist(residence);
        em.getTransaction().commit();
        
    }
    
    public List<Residence> getAll()
    {
        EntityManager em = ConnectionManager.getInstance().getEm();

        Query query = em.createQuery("SELECT e FROM Residence e");
        
        List<Residence> listResidence = new ArrayList<>();
        
        listResidence = query.getResultList();
        
        return listResidence;

    }
}
