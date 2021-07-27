package com.phoneix.threads;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		 try {
				for(int i=0;i<5;i++) {
					System.out.println("Current Thread: "+Thread.currentThread().getName());
					System.out.println(i);
				Thread.sleep(1000);}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
