package com.phoenix.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  List<Product> productlist = new ArrayList<Product>();productlist.add(new
		  Product(1003,"Laptop","hp",35600.00f)); productlist.add(new
		  Product(1005,"Refregerator","Whirlpool",38200.00f)); productlist.add(new
		  Product(1003,"Mobile","Vivo",17999.00f)); productlist.add(new
		  Product(1003,"Mobile","Samsung",23800.00f)); productlist.add(new
		  Product(1003,"LED TV","Sony",57000.00f));
		  
		 /* Stream<Product> prodStream = productlist.stream(); Stream<Product>
		 * filteredStream = prodStream.filter(p->p.getPrice()>20000.00f); List<Product>
		 * filteredProductList = filteredStream.collect(Collectors.toList());
		 * filteredProductList.forEach(p->System.out.println(p)); System.out.println();
		 */
		// Stream Pipeline
		List<Product> products = productlist.stream().filter(p->p.getPrice()>20000.00f) 
		                                    .collect(Collectors.toList()); // terminal
	    products.forEach(System.out::println);	
	    
	    List<Float> prodPrices = productlist.stream().filter(p->p.getPrice()>20000.00f) 
	    		                            .map(product->product.getPrice()) //intermediate operation
                                            .collect(Collectors.toList()); // terminal operation
        prodPrices.forEach(System.out::println);
        
        long prodCount = productlist.stream().count();
        System.out.println("No of products in a list:" + prodCount);
        
        Product prodMaxPrice = productlist.stream().max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).get();
        System.out.println("Product having minimum price:" + prodMaxPrice);
        
        Product prodMinPrice = productlist.stream().min((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).get();
        System.out.println("Product having minimum price:" + prodMinPrice);
        
        float maxPrice = productlist.stream().map(p->p.getPrice()).max((price1,price2)->price1>price2?1:-1).get();
        System.out.println("Max price:" + maxPrice);
        
        float minPrice = productlist.stream().map(p->p.getPrice()).min((price1,price2)->price1>price2?1:-1).get();
        System.out.println("Max price:" + minPrice);
        
        		
        
	}

}
