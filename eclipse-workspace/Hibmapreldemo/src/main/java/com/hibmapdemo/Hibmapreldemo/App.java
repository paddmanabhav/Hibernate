package com.hibmapdemo.Hibmapreldemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	
    		Laptop laptop = new Laptop();
    		
    		laptop.setLid(101);
    		laptop.setLname("HP");
    		
    		Student s = new Student();
    		s.setRollno(1);
    		s.setMark(50);
    		s.setName("paddma");
    		s.getLaptop().add(laptop);
    		laptop.getStudent().add(s);
    		
  	
    		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    		SessionFactory sf = con.buildSessionFactory();	
    		Session session = sf.openSession();
    		
    		Transaction tx = session.beginTransaction();
    		session.save(s);		
    		session.save(laptop); 
    	
//    		laptop = (Laptop) session.get(Laptop.class, 101);
    		tx.commit();
//    		System.out.println(laptop);
//    		System.out.println(s);
    }
    
}
