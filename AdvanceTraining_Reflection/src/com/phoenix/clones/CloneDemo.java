package com.phoenix.clones;

import com.phoenix.dates.Date;
import com.phoenix.models.Product;

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product(3402,"Laptop","HP",45000.00f,new Date(4, 10, 2019));
		System.out.println("Orignal product: "+ product);
		
		try {
			//shallow copying
			Product clonedprod=(Product) product.clone();
			System.out.println("Cloned Product: "+clonedprod);
			
			clonedprod.getMfgdate().setDd(25);
			System.out.println("Orignal product: "+ product);
			System.out.println("Cloned Product: "+clonedprod);
			/*
			 * if(clonedprod==product) System.out.println("same object"); else
			 * System.out.println("different object");
			 * 
			 * Product ccprod=(Product) clonedprod.clone();
			 * System.out.println("Cloned of clone object: "+ccprod);
			 */
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
