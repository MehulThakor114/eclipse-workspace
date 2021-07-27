package com.phoenix.inner;


public class Car {
	
	public void show()
	{
		ferrari.test();
		d.drive();
	}
	
	//Anonymous Inner Class - subclass of Ferrari
	Ferrari ferrari = new Ferrari()
	{
		private String model;
		
		{
			model="Ferrari Sport";
		}
		public void showModel()
		{
			System.out.println(model);
			
		}
		public void test()
		{
			System.out.println("Anonymous" + model);
		}
	};
	
	//////////////////////////////
	
	//Anonymous Inner class -interface Implementor
	
   Drivable d= new Drivable()	
  {
	   public void drive() {
	  System.out.println("Annonymous Drivable"); }
	    };
}

