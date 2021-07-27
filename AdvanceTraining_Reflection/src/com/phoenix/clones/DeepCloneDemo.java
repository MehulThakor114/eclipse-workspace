package com.phoenix.clones;

import com.phoenix.dates.Date;
import com.phoenix.models.Product;

public class DeepCloneDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product(3402,"Laptop","HP",45000.00f,new Date(4, 10, 2019));
		System.out.println("Orignal product: "+ product);
		
		//deep copying
		
		//get the clone of container object Product
		Product clonedprod;
		try {
			clonedprod = (Product) product.clone();
			System.out.println("Cloned Product: "+clonedprod);
			Date orignalMfgDate = product.getMfgdate();
			//get the clone of contained object Mfg Date
			Date ClonedMfgDate = (Date)orignalMfgDate.clone();
			// deep copying
			clonedprod.setMfgdate(ClonedMfgDate);
			
			clonedprod.getMfgdate().setDd(25);
			System.out.println("Orignal product: "+ product);
			System.out.println("Cloned Product: "+clonedprod);
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
