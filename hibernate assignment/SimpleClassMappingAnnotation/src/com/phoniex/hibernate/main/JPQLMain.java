package com.phoniex.hibernate.main;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoniex.entities.Product;

/*
 * @auther mehul.thakor@stl.tech
 * @creation date 8-Jul-2021
 * @version 1.0
 * copyright Sterlite Technologies Ltd.
 * @description It is used to perform database operations using JPQL
 * */
public class JPQLMain {
      
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//Hibernate Query using JPQL - Object Oriented Query Language 
		//Works on Persistence class and it's attributes only 
		//does not understand table and column name
		
		//Query query = session.createQuery("from Product");
		//Query query = session.createQuery("from Product p where p.brand = 'realme'");
		//Query query = session.createQuery("from Product p where p.price>= 10000.00");
		//Query query = session.createQuery("from Product p where p.productName = 'laptop'");
		//Query query = session.createQuery("from Product p where p.productName = 'Mobile' and p.brand ='hp'");
		//Query query = session.createQuery("from Product p where p.price between 5000.00 and 10000.00");
		//Query query = session.createQuery("from Product p where p.productName like 'r%'");
		//Query query = session.createQuery("from Product p where p.brand is not null");
		//Query query = session.createQuery("from Product p order by p.price");
		//Query query = session.createQuery("from Product p order by p.price desc");
		//Query query = session.createQuery("from Product p order by p.productName,p.price desc");
		//Query query = session.createQuery("from Product p where p.price<=50000.00 order by p.price");
		//Query query = session.createQuery("from Product p where p.price<=50000.00 and p.brand like '%a%' order by p.price desc");
		
		/*
		 * List<Product> productList = query.getResultList(); for(Product product:
		 * productList) System.out.println(product);
		 */
		
		//projection - selecting particular fields(columns) in JPQL
		/*
		 * Query query =
		 * session.createQuery("select p.productName,p.price from Product p");
		 * List<Object[]> objList = query.getResultList(); for(Object[] obArr: objList)
		 * { //System.out.println("Product Name: " + obArr[0] + "\tprice: " + obArr[1]);
		 * for(Object ob: obArr) { System.out.print(ob + "\t"); } System.out.println();
		 * }
		 */
		Query query = session.createQuery("select max(p.price) from Product p");
		float maxPrice = (float)query.getSingleResult();
		System.out.println("Maximum Price: " + maxPrice);
		
		tx.commit();
		session.close();
	}
	
}
