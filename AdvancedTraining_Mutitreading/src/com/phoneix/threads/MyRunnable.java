package com.phoneix.threads;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		List<String> cities = new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("delhi");
		cities.add("bangaluru");
		cities.forEach(System.out::println);
				
	}

}
