package org.hibernate.cfg.main;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Session;
import org.hibernate.cfg.SessionFactory;
import org.hibernate.cfg.Transaction;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.buildSessionFactory();
		Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();
		tx.update();
	}

}
