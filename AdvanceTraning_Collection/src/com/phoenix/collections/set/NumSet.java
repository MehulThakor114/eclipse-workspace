package com.phoenix.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.phoenix.comparator.CompareNum;
/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
public class NumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<Integer> numSet = new HashSet<Integer>();
		//Set<Integer> numSet = new LinkedHashSet<Integer>();
		//Set<Integer> numSet = new TreeSet<Integer>();
		//Set<Integer> numSet = new TreeSet<Integer>(new CompareNum());
		Set<Integer> numSet = new TreeSet<Integer>(Collections.reverseOrder());
        numSet.add(120);
        numSet.add(150);
        numSet.add(90);
        numSet.add(20);
        numSet.add(120);
        numSet.add(100);
        
        System.out.println("Using Iterator");
        Iterator<Integer> it = numSet.iterator();
        while(it.hasNext())
        {
        	int ele = it.next();
        	System.out.println(ele);
        }
        
        //Using For Each Loop
        System.out.println("Using For Each Loop");
        for(int ele:numSet)
        {
        	System.out.println(ele);
        }
        
        System.out.println(numSet);
	}

}
