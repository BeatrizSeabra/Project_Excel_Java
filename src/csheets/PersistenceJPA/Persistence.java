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
    
    public static EntityManager getEntityManager() {

		EntityManagerFactory entityManagerFActory = javax.persistence.Persistence.
			createEntityManagerFactory("ExpenseManager");
		EntityManager entityManager = entityManagerFActory.
			createEntityManager();
		return entityManager;
	}
    
}
