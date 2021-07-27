package com.phoneix.threads.main;

import com.phoneix.threads.MyRunnable;

public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("John");
		t2.setName("sara");
		
		t1.start();
		t2.start();
		
	}

}
