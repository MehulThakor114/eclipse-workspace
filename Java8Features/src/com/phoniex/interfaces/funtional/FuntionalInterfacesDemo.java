package com.phoniex.interfaces.funtional;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.phoenix.models.Product;

public class FuntionalInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Built-in funtional Interfaces
		Predicate<Integer> p = n1->n1>10;
		boolean res = p.test(10);	
		System.out.println(res);
		System.out.println(p.test(9));
		
		Predicate<String> p1 = s -> s.equals("Java");
		System.out.println(p1.test("Java"));
		System.out.println(p1.test("python"));
		

		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("welcome to Funtional Programming in Java");
		
		Supplier<Double> s1 = ()-> 12.5;
		System.out.println(s1.get());
		
		Supplier<String> s2 = ()-> "Good Evening";
		System.out.println(s2.get());
		
		Supplier<ArrayList<Integer>> s3 = ArrayList::new;
		ArrayList<Integer> numList = s3.get();
		System.out.println(numList.size());
		
		Consumer<Integer> c4 = ele -> numList.add(ele);
		c4.accept(100);
		c4.accept(70);
		c4.accept(80);
		c4.accept(10);
		c4.accept(60);
		System.out.println(numList.size());
		
		Function<String,Integer> f1 = s-> Integer.valueOf(s);
		System.out.println(f1.apply("34000"));
		
		Supplier<Product> s5 = () -> new Product(1703,"Laptop","Asus",32800.00f);
		Product pob = s5.get();
		
		Consumer<Product> c6 = pob1 -> System.out.println(pob1);
		
		Function<Product, Float> f7 = product -> product.getPrice();
		System.out.println(f7.apply(pob));
		
		Function<Product, String> f8 = product -> product.getBrand();
		System.out.println(f8.apply(pob));
		
		BiPredicate<Integer, Double> bp1 = (i,d)-> i>=d;
		System.out.println(bp1.test(123, 123.0));
		System.out.println(bp1.test(123, 34.0));
		System.out.println(bp1.test(123, 340.0));
		
		BiConsumer<Integer, String> bc1 = (n,s)-> System.out.println(n + "\t" + s);
		bc1.accept(100, "hello");
		bc1.accept(pob.getId(), pob.getName());
		
		BiFunction<String, Integer, Boolean> bof1 = (s,n)->s.equals(n);
		System.out.println(bof1.apply("100", 100));
		
		BiFunction<String, Integer, Boolean> bof2 = (s,n)->n==Integer.parseInt(s);
		System.out.println(bof2.apply("100", 100));
		
		UnaryOperator<String> u1= s->s.toUpperCase();
		System.out.println(u1.apply("hello"));
		System.out.println(u1.apply(pob.getBrand()));
		System.out.println(u1.apply(pob.getName()));
		
		BinaryOperator<String> b1 = (ss1,ss2) -> ss1.concat(ss2);
		System.out.println(b1.apply("Intern", "ational"));
        System.out.println(b1.apply("Mehul","thakor" ));		

	}
}
