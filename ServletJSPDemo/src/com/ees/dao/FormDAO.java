package com.ees.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ees.vo.GeneralVO;


public class FormDAO {
	
public void insert(GeneralVO gv)
	
	{
		System.out.println("DAO");
		 Session session = null;
		// System.out.println(personalinfo.getFirstName());
		  try{
		  // This step will read hibernate.cfg.xml 

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session =sessionFactory.openSession();
		 //Create new instance of Contact and set 
        Transaction transaction = session.beginTransaction();
		System.out.println("Inserting Record");
		  
		  
		  System.out.println("Done");
		 
		 
		 session.save(gv);
		  
		  
		 transaction.commit();
		  }catch(Exception e){
		  e.printStackTrace();
		  }finally{
		  // Actual contact insertion will happen at this step
			/*  session.flush();
			  session.close();
*/
		  }
		
		
	}
	
	
	

}
