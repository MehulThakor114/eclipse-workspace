package com.phoniex.interfaces.funtional;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static method reference
		Movable m = MyClass::aMethod;
		m.move();
		
		YourClass ob = new YourClass();
		//instance method reference
		m = ob::yourMethod;
		m.move();
		
		//Instance method reference on arbitrary object
		StringMerger sm = String::concat;
		System.out.println(sm.merge("hello", " World"));
		
		//Constructor reference
		messaging ob1 = Message::new;
		Message msg = ob1.getObject("mehul");
		System.out.println(msg.getMsg());
	}

}
