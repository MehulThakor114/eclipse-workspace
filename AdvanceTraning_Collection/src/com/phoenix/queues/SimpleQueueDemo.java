package com.phoenix.queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
public class SimpleQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<Integer> numQ = new LinkedList<Integer>();
		//Queue<Integer> numQ = new PriorityQueue<Integer>();
		Queue<Integer> numQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		numQ.add(100);
		numQ.offer(50);
		numQ.offer(20);
		numQ.add(70);
		numQ.add(50);
        
		System.out.println("Head of numQ: " + numQ.peek());
		System.out.println("Removing head: " + numQ.poll());
		System.out.println("Head of numQ: " + numQ.peek());
		while(!numQ.isEmpty()) {
			System.out.println("Polling Element: "+numQ.poll());
		}System.out.println("Head of numQ: " + numQ.peek());
		//System.out.println("Head of numQ: " + numQ.element());
		System.out.println("Polling Element: "+numQ.poll());
		//System.out.println("Polling Element: "+numQ.remove());
	}

}
