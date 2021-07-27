package org.hibernate.cfg;

public class Factory implements SessionFactory,Session,Transaction {

	@Override
	public Session openSession() {
		// TODO Auto-generated method stub
		return new Factory();
	}
       
	Factory(){
		System.out.println("factory constructor");
	}

	@Override
	public Transaction beginTransaction() {
		// TODO Auto-generated method stub
		return new Factory();
	}

	@Override
	public void update() {
		System.out.println("updated");
		
	}
}
