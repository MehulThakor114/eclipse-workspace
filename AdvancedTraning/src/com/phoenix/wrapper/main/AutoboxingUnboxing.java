package com.phoenix.wrapper.main;

public class AutoboxingUnboxing {
	
   public static void main(String args[]) {
	    Integer i1 = 100; //autoboxing
	    System.out.println(i1);
	    int i = i1;   //autounboxing
	    System.out.println(i);
	
	    Float f1 = 200.0f;  //autoboxing
	    System.out.println(f1);
	    float f = f1;        //autounboxing
	    System.out.println(f);
	    
	    Double d1 = 200.00;  //autoboxing
	    System.out.println(d1);
	    double d = d1;       //autounboxing
	    System.out.println(d);
	    
	    Boolean b1 = true;   //autoboxing
	    System.out.println(b1);
	    boolean b = b1;     //autoboxing
	    System.out.println(b);
	}
}
