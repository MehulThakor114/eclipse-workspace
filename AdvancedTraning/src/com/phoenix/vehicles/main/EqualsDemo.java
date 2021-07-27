package com.phoenix.vehicles.main;

import com.phoenix.vehicles.Car;

public class EqualsDemo {

	public static void main(String[] args) {
		
		  String s1 = new String("Mehul");
	      String s2 = new String("Thakor");
		
		// TODO Auto-generated method stub
          Car c1 = new Car(101,"TATA",3000000.00f);
          Car c2 = new Car(101,"TATA",3000000.00f);
          if(c1.equals(c2)) {
        	  System.out.println("same");
          }else
        	  System.out.println("different");
      
          if(c1.equals(s1)) {
        	  System.out.println("same");
          }else
        	  System.out.println("different");
          System.out.println("Hash code of s1 "+s1.hashCode());  
          System.out.println("Hash code of s1 "+s2.hashCode());
          
          System.out.println("Hash code of s1 "+c1.hashCode());  
          System.out.println("Hash code of s1 "+c2.hashCode());
	}

}
