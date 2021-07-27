package com.phoenix.string.main;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sb = new StringBuffer();
       System.out.println("Capacity: "+sb.capacity());
       System.out.println("Size: "+sb.length());
       sb.append("hello");
       System.out.println("Capacity: "+sb.capacity());
       System.out.println("Size: "+sb.length());
       sb.append("This is springBufferDemo");
      
       //sb.reverse();
       System.out.println("Capacity: "+sb.capacity());
       System.out.println("Size: "+sb.length());
       System.out.println(sb);
       
       String s =sb.reverse().toString();
       System.out.println(s);
       
       Long i1 = 100L;
       Float f1 = 100.0f;
       //if(i1==f1)
       if(i1>=f1) {
    	   System.out.println("same");
       }else 
    	   System.out.println("different");
	}

}
