package com.phoenix.collections.set;

import java.util.HashSet;
import java.util.Set;

import com.phoenix.models.Product;

public class ProductSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Product> productSet = new HashSet<Product>();
		 productSet.add(new Product(1002,"Mobile","Samsung",23500.0f));
		 productSet.add(new Product(1005,"Laptop","Lenovo",23500.0f));
		 productSet.add(new Product(1006,"Refrigerator","Whirlpool",23500.0f));
		 productSet.add(new Product(1001,"UHD TV","Sony",23500.0f));
		 productSet.add(new Product(1002,"Mobile","Samsung",23500.0f));
	        
	        for(Product plist:productSet)
	        	System.out.println(plist);
	}

}
