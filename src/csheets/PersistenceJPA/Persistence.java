/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.PersistenceJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Luis
 */
public final class Persistence {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    private static Persistence instance;
    
    public static synchronized Persistence getInstance() {
        if (instance == null) {
            instance = new Persistence();
        }
        return instance;
    }
    
    public EntityManager connection(String unitName) {
        
        emf = javax.persistence.Persistence.createEntityManagerFactory(unitName);
        em = emf.createEntityManager();
        em.getTransaction().begin();
        
        return em;
    }
    
        public void close()
    {
        em.close(); 
        emf.close();
    }
    
}
