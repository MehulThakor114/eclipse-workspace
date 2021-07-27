package com.phoenix.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
public class NumStArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.addLast(40);
        stack.addLast(20);
        stack.addLast(70);
        stack.addLast(10);
        stack.addLast(80);
        
        System.out.println("Top of stack: "+stack.peekLast());
        System.out.println("Pop the top: "+stack.pollLast());
        System.out.println("Top of stack: "+stack.peekLast());
        
        while(!stack.isEmpty()) {
        	System.out.println("Pop the top: "+stack.pollLast());
        }
	}

}
