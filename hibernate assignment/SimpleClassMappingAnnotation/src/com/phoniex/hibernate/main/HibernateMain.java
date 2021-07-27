package com.phoniex.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoniex.entities.Product;

/*
 * @auther mehul.thakor@stl.tech
 * @creation date 7-Jul-2021
 * @version 1.0
 * copyright Sterlite Technologies Ltd.
 * @description It is used to perform database operations using Hibernate Framework
 * */
public class HibernateMain {

	public static void main(String[] args) {
		// create configuration object and read hibernate configuration
		Configuration cfg = new Configuration().configure();
		// build session factory (singleton & Heavyweight)
		SessionFactory factory = cfg.buildSessionFactory();
        //Establish database connection
		Session ss = factory.openSession();
		
		//obtain hibernate transaction
		Transaction tx = ss.beginTransaction();
		
		//code for database operations - CRUD
		
		// get database row as an object
		//Product product = ss.get(Product.class, 1001);
		//System.out.println(product);
		
		
		//insert an object as a new row
		Product p = new Product(5603,"mobile","Oppo",15000.00f);
		ss.update(p);
		/*
		 * Product p = ss.load(Product.class, 5603);
		 * 
		 * System.out.println("product Id: "+p.getProductId());
		 * System.out.println("product Name: "+p.getProductName());
		 * System.out.println("Brand: "+p.getBrand());
		 * System.out.println("price: "+p.getPrice());
		 */
		//update row price using an object
		/*
		 * Product p = ss.get(Product.class, 5603); if(p!=null) {
		 * p.setPrice(p.getPrice()+2000.00f); p.setBrand("Redmi"); ss.update(p);} else
		 * System.out.println("sorry! product not found");
		 * 
		 * p = ss.get(Product.class, 5603); if(p!=null) { System.out.println(p); } else
		 * System.out.println("sorry! product not found");
		 * 
		 * 
		 * p = ss.get(Product.class, 5603); if(p!=null) { ss.delete(p);} else
		 * System.out.println("sorry! product not found");
		 */
		/*Product p = new Product();
		p.setProductName("Desktop computer");
		p.setBrand("Dell");
		p.setPrice(55000.00f);
		ss.save(p);*/
		//commit transaction
		tx.commit();
		
		//close session(database connection)
		ss.close();
	}

}
