package com.phoneix.threads.main;

import com.phoneix.threads.MyThread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.setName("Mehul");
		t2.setName("Rahul");
		t1.setPriority(2);
		t2.setPriority(8);
		t1.start();
		t2.start();

		}
	}

