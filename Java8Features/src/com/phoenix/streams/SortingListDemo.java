package com.phoenix.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class SortingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Product> productlist = new ArrayList<Product>();productlist.add(new
		 Product(1001,"Laptop","hp",35600.00f)); productlist.add(new
		 Product(1005,"Refregerator","Whirlpool",38200.00f)); productlist.add(new
		 Product(1002,"Mobile","Vivo",17999.00f)); productlist.add(new
		 Product(1003,"Mobile","Samsung",23800.00f)); productlist.add(new
		 Product(1004,"LED TV","Sony",57000.00f));
				  
		 Collections.sort(productlist);
	     productlist.forEach(System.out::println);
	     System.out.println();
	     //java 8
	     productlist.sort(Comparator.naturalOrder());
	     productlist.forEach(System.out::println);
	  
	     //sorting using stream
	     System.out.println("sorting using stream");
	     productlist.stream().sorted().forEach(System.out::println);
	     Stream<Product> obj = productlist.stream();
	     System.out.println("1: "+obj);
	     System.out.println("sorting using stream");
	     productlist.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	     System.out.println();
	     //Sorting according acse order of product name
	     productlist.stream().sorted(Comparator.comparing(Product::getName));
	     productlist.forEach(System.out::println);
	     System.out.println();
	     //Sorting according desc order of product name
	     productlist.stream().sorted(Comparator.comparing(Product::getName).reversed());
	     productlist.forEach(System.out::println);
	     System.out.println();
	     //Sorting according acse order of product brand
	     productlist.stream().sorted(Comparator.comparing(Product::getBrand));
	     productlist.forEach(System.out::println);
	     System.out.println();
	     //Sorting according desc order of product brand
	     productlist.stream().sorted(Comparator.comparing(Product::getBrand).reversed());
	     productlist.forEach(System.out::println);
	     
	     //Sorting according acse order of product Price
	     productlist.stream().sorted(Comparator.comparing(Product::getPrice));
	     productlist.forEach(System.out::println);
	     System.out.println();
	     //Sorting according desc order of product Price
	     productlist.stream().sorted(Comparator.comparing(Product::getPrice).reversed());
	     productlist.forEach(System.out::println);
	     System.out.println();
	     //Sorting according acse order of product name and brand 
	     productlist.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand))
	                         .forEach(System.out::println);
	     System.out.println();
	     //Sorting according acse order of product name and then desc order of brand 
	     productlist.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand,(brand1,brand2)->brand2.compareTo(brand1)))
         .forEach(System.out::println);
	     System.out.println();
	     //Sorting according desc order of product name and then asc order of brand 
	     productlist.stream().sorted(Comparator.comparing(Product::getName).reversed().thenComparing(Product::getBrand))
	                         .forEach(System.out::println);
	     System.out.println();
	     //Sorting according desc order of product name and then asc order of brand 
	     productlist.stream().sorted(Comparator.comparing(Product::getName).reversed().thenComparing(Product::getBrand))
	                .forEach(System.out::println);
	}

}
