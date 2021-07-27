package com.phoenix.collections.searching;

import java.util.Arrays;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50,20,80,40,10,90};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		
		int searchIdx = Arrays.binarySearch(arr, 20);
		System.out.println("element fount at index no: "+searchIdx);

	}

}
