package com.phoneix.threads.main;

import java.util.*;

import com.phoneix.threads.ListThread1;
import com.phoneix.threads.ListThread2;

public class ListThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cities = new ArrayList<>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Kolkata");
		System.out.println("In main: "+cities);
		//multiple threads are operating on common objects
		Thread t1 = new ListThread1(cities);
 		Thread t2 = new ListThread2(cities);
 		
 		t1.start();
 		t2.start();
	}

}
