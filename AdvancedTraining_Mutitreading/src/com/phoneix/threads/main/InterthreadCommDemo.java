package com.phoneix.threads.main;

import com.phoneix.threads.DataPrinterThread;
import com.phoneix.threads.DataReceiverThread;

public class InterthreadCommDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		
		Thread t1= new DataReceiverThread(arr);
		Thread t2= new DataPrinterThread(arr);
		
		t2.start();
		t1.start();
	}

}
