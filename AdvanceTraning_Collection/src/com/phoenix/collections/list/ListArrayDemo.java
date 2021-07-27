package com.phoenix.collections.list;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array to list Conversion
		List<Integer> numList = Arrays.asList(100,600,300,200,800,500);
		numList.add(120);
		numList.remove(3);
		
		System.out.println(numList);
		//List to Array Conversion
		/*
		 * Integer[] iArr = new Integer[numList.size()];
		 * 
		 * iArr = numList.toArray(iArr); for(int ele:iArr) System.out.println(ele);
		 */
	}

}
