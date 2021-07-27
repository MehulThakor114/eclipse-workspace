package com.phoenix.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream ins = IntStream.of(70,30,20,60,10);
		ins.forEach(System.out::println);
		System.out.println("Sorting in asc order");
		IntStream ins1 = IntStream.of(70,30,20,60,10);
		ins1.sorted().forEach(System.out::println);
		
	    System.out.println("Using iterate");
	    IntStream ins2 = IntStream.iterate(1, i->i+1);
	    ins2.limit(10).skip(5).forEach(System.out::println);
	    
	    
	    System.out.println("Stream of long type number");
	    //LongStream ls = LongStream.range(100L, 105L);
	    LongStream ls = LongStream.rangeClosed(100L, 105L);
	    ls.forEach(System.out::println);
	    
	}

}
