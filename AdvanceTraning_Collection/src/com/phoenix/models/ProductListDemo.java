package com.phoenix.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.comparator.ProductNameComparator;

/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
public class ProductListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Product> productlist = new ArrayList<Product>();
        productlist.add(new Product(1002,"Mobile","Samsung",23500.0f));
        productlist.add(new Product(1005,"Laptop","Lenovo",23500.0f));
        productlist.add(new Product(1006,"Refrigerator","Whirlpool",23500.0f));
        productlist.add(new Product(1001,"UHD TV","Sony",23500.0f));
        productlist.add(new Product(1002,"Mobile","Samsung",23500.0f));
        
        for(Product plist:productlist)
        	System.out.println(plist);
        System.out.println();
        System.out.println("after sorting according to id in asce");
        System.out.println();
        Collections.sort(productlist);
        for(Product plist:productlist)
        	System.out.println(plist);
        
        System.out.println();
        System.out.println("after sorting according to id in desc");
        System.out.println();
        Collections.sort(productlist,Collections.reverseOrder());
        for(Product plist:productlist)
        	System.out.println(plist);
        
        Comparator<Product> cNm = new ProductNameComparator(); 
        Collections.sort(productlist,cNm);
        System.out.println("sorting according to name in asce");
        for(Product plist:productlist)
        	System.out.println(plist);
        //for java version before 1.8
        Collections.sort(productlist,Collections.reverseOrder(cNm));
        System.out.println("sorting according to name in desc");
        for(Product plist:productlist)
        	System.out.println(plist);
        // for new java version
        Collections.sort(productlist,cNm.reversed());
        System.out.println("sorting according to name in desc");
        for(Product plist:productlist)
        	System.out.println(plist);
        
        
	}

}
