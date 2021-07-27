package com.phoneix.threads.main;

import com.phoneix.models.Account;
import com.phoneix.threads.AccountThread;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account(12345,"Mr. and Mrs. Rakesh Mehra",10000.00);
		Thread t1 = new AccountThread(account, 3000.00,true);
		Thread t2 = new AccountThread(account, 4000.00,false);
		
		t1.setName("Mr. mehra");
		t2.setName("Mrs. mehra");
		
		t1.start();
		t2.start();
		
	}

}
