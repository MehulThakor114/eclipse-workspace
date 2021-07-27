package com.phoenix.inner;

public class Outer {

	private int i;
	
	public Outer() {
		// TODO Auto-generated constructor stub
		i=100;
		
	}

	public void display()
	{
		System.out.println(i);
		
	}
	
	public static class Inner
	{
		private int j;
		
		public Inner() {
			// TODO Auto-generated constructor stub
		    j=10;
		}

		public Inner(int j) {
			super();
			this.j = j;
		}
		
		public void show()
		{
			System.out.println(j);
		}
		
	}
	
}
