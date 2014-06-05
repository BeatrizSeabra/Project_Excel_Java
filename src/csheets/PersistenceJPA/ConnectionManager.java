/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.PersistenceJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Nuno
 */
public class ConnectionManager {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    private static ConnectionManager instance;
    
    private ConnectionManager() {}
    
    public static synchronized ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }
    
    public EntityManager createConnection(String unitName) {
        
        emf = Persistence.createEntityManagerFactory(unitName);
        em = emf.createEntityManager();
        em.getTransaction().begin();
        
        return em;
    }
    
    public void closeConn()
    {
        em.close(); 
        emf.close();
    }
    
    public EntityManager getEm()
    {
        return em;
    }
}
