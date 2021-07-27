package com.phoenix.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
public class ActorPhoneMap {

	public static void main(String[] args) {
		NavigableMap<String,Long> actorPhMap = new TreeMap<String,Long>();
		//Map<String,Long> actorPhMap = new HashMap<String,Long>();//unordered and unsorted
		//Map<String,Long> actorPhMap = new LinkedHashMap<String,Long>();//ordered and unsorted
		//Map<String,Long> actorPhMap = new TreeMap<String,Long>();//ordered and sorted
		Comparator<String> c = Collections.reverseOrder();
		//Map<String,Long> actorPhMap = new TreeMap<String,Long>(c);
		actorPhMap.put("Mehul", 9898989898L);
		actorPhMap.put("Rahul",   7878787878L);
		actorPhMap.put("Zala",    7979797979L);
		actorPhMap.put("Harshit",  8989898989L);
		
		//Using get method to fetch details of particular actor
		System.out.println("Phone No of Mehul :" + actorPhMap.get("Mehul"));
		
		//Printing key,value pairs
		
        System.out.println(actorPhMap);
         
         //Using Iterator
         Set<String> actors = actorPhMap.keySet();
         Iterator<String> it =actors.iterator();
         while(it.hasNext())
         {
        	 String actorName = it.next();
        	 long phoneNo = actorPhMap.get(actorName);
        	 System.out.println("Actor Name :" + actorName + "\tPhone No :" + phoneNo);
         }
         NavigableMap<String, Long> hdmap = actorPhMap.headMap("Mehul",true);
         System.out.println(hdmap);
         NavigableMap<String, Long> tlmap = actorPhMap.tailMap("Mehul",true);
         System.out.println(tlmap);
         SortedMap<String, Long> stmap = actorPhMap.subMap("Mehul",true,"Rahul",false);
         System.out.println(stmap);
	}

}
