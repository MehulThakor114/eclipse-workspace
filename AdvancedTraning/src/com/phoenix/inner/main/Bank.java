package com.phoenix.inner.main;

import com.phoenix.inner.Account;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account(12345,"Parshwa",100000.00f);
		acc.print();
		
		//Creating inner class object
		
        Account.Locker ob = acc.new Locker(12,"Parshwa Sheth");
        ob.unlock();
        ob.keepThings();
        ob.lock();
        
        Account.Locker ob1= new Account(34343,"Jay Joshi",560000.00f).new Locker(15,"Jay J");
        ob1.unlock();
        ob1.keepThings();
        ob1.lock();
	}

}
