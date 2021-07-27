package com.phoenix.string.main;

import com.phoenix.vehicles.Car;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s1="Hello"; 
		  StringBuilder s10 = new StringBuilder("Hello");
		  String s= new String("Hello");
		  String s6= new String("Hello");
		  if(s1.equals(s10)) 
			  System.out.println("Single-object-True they are Same");
		  else
		      System.out.println("Different-object-False They are not same");
		 
		
		  Car car1= new Car(101,"Tata",650000.00f);
		  Car car2= new Car(101,"Tata",650000.00f);
		  
		  if(car1.equals(car2)) 
			  System.out.println("Single-object-True they are Same"); 
		  else
		       System.out.println("Different-object-False They are not same");
		 
		
		
		  //String s3= s1.concat(s2); //s1 will not be updated because string is immutable 
		 // System.out.println(s1); System.out.println(s3);
		  
		  String s4=s1+" World"; //s1 will not be updated because string is immutable
		  System.out.println(s1); System.out.println(s4);
		 
		String color="green";
		switch(color) {
		
		case "red":
			System.out.println("Red");
		case "green":
			System.out.println("Green");
		default:
			System.out.println("Yellow");
		}
	}

}
