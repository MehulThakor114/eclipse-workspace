package com.phoenix.reflection;

import java.lang.reflect.*;

public class ReflectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class  c = Class.forName("com.phoenix.models.Product");
			Field[] ob = c.getFields();
			for(Field f:ob){
				//System.out.println(f.getName());
				System.out.println(f);
			}
			
			Method[] ob1 = c.getMethods();
			for(Method f:ob1){
				//System.out.println(f.getName());
				System.out.println(f);
			}
			System.out.println("\n");
			Method[] ob2 = c.getDeclaredMethods();
			for(Method f:ob2){
				//System.out.println(f.getName());
				System.out.println(f);
			}
			
			System.out.println("\n");
			Constructor[] ob3 = c.getDeclaredConstructors();
			for(Constructor f:ob3){
				//System.out.println(f.getName());
				System.out.println(f);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
