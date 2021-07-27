package com.phoenix.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.phoenix.comparator.CompareNum;
/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
public class NumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numlist=new ArrayList<Integer>();
		numlist.add(120);
		numlist.add(150);
		numlist.add(90);
		numlist.add(20);
		numlist.add(120);
		numlist.add(100);
		
		numlist.forEach(n->System.out.println(n));
		
		
		//Iterating over list
		for(int i=0;i<numlist.size();i++)
		{
			int ele= numlist.get(i);
			System.out.println(ele);
		}
	
	System.out.println("Using Iterator");
	//Using Iterator
	Iterator<Integer> it = numlist.iterator();
	while(it.hasNext()) {
		int ele = it.next();
		System.out.println(ele);
	}
	
	
	System.out.println("Using For each loop");
	//Using for each loop
	for(int ele:numlist)
	{
		System.out.println(ele);
	}
	//Printing list  directly
		System.out.println(numlist);
		
	Collections.sort(numlist);
	System.out.println("sorted List using forEach loop");
	for(int ele:numlist)
	{
		System.out.println(ele);
	}
	Collections.sort(numlist, new CompareNum());
	System.out.println("As per user-defined Comparator");
	for(int ele:numlist)
	{
		System.out.println(ele);
	}
	
	Comparator<Integer> c = Collections.reverseOrder();
	Collections.sort(numlist,c);
	System.out.println("using reverseOrder method desplay in reverse order");
	for(int ele:numlist)
	{
		System.out.println(ele);
	}
	
	/*
	 * //Reverse List Collections.reverse(numlist);
	 * System.out.println("Reverse List"); //Using for each loop for(int
	 * ele:numlist) { System.out.println(ele); }
	 */
	}
}
