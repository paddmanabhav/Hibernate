package com.paddma.JpaDemo;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//to  insert the data into a database
//    	Alien alien = new Alien();
//    	alien.setAname("paddma");
//    	alien.setId(1);
//    	alien.setTech("software");
    	
    	EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("pu");
    	EntityManager eManager = emFactory.createEntityManager();
    	
    	//TO find a data from database
    	Alien alien = eManager.find(Alien.class, 1);
    	
    	//to insert the data into a database
//    	eManager.getTransaction().begin();
//    	eManager.persist(alien);
//    	eManager.getTransaction().commit();
    	System.out.println(alien);
    	
    	
    	
    	
    }
}
