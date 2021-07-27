package com.phoenix.stacks;

import java.util.Stack;
/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
public class NumStackDemo {
    public static void main(String[] args) {
    	Stack<Integer> numSt = new Stack<Integer>();
    	numSt.push(40);
    	numSt.push(20);
    	numSt.push(70);
    	numSt.push(10);
    	numSt.push(80);
    	
    	System.out.println("Top of Stack: " + numSt.peek());
    	int idx = numSt.search(70);
    	System.out.println("Element 70 is found at index " + idx);
    	System.out.println("Pop the top: "+numSt.pop());
    	
    	while(!numSt.empty()) {
    		System.out.println("pop the top: "+numSt.pop());
    	}
    }
}
