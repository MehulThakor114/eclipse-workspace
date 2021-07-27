package com.phoenix.queues;
/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
import java.util.Deque;
import java.util.LinkedList;

public class NumDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<Integer> deq = new LinkedList<Integer>();
        deq.add(100);
        deq.add(200);
        deq.addFirst(150);
        deq.addFirst(180);
        deq.addLast(120);
        deq.addLast(130);
        
        System.out.println("Front of deq: "+ deq.peek());
        System.out.println("First element of deq: "+ deq.peekFirst());
        System.out.println("Last element of deq: "+ deq.peekLast());
        
        System.out.println("Polling Elements: "+ deq.peek());
        System.out.println("Polling first element: "+ deq.peekFirst());
        System.out.println("Polling last element: "+ deq.peekLast());
	}

}
