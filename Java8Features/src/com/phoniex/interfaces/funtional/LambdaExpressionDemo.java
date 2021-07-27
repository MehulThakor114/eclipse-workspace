package com.phoniex.interfaces.funtional;

public class LambdaExpressionDemo {
	public void doMath(Addable ob) {
		System.out.println(ob.add(15,15));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Movable m = ()->System.out.println("Anonymous object moves");
        m.move();
        
        Jumpable j = ()->System.out.println("jumping");
        j.jump();
        
        Addable ob = (int a,int b)->{return a + b;};
        Addable ob1 = (a,b)->{return a + b;};
        Addable ob2 = (a,b)-> a + b;
        
        System.out.println(ob.add(5, 10));
        System.out.println(ob1.add(15, 20));
        System.out.println(ob2.add(5, 2));
        
        Greeting g = (a)->{return "hello " + a;};
        System.out.println(g.greet("Mehul"));
        
        LambdaExpressionDemo ref = new LambdaExpressionDemo();
        ref.doMath((a,b)-> a + b);
        
        //calling default method
        float res1 = ob	.addFloats(25.00f, 10.0f);
        System.out.println("adding of floats "+res1);
        //invoking static method of interface
        Addable.show();
	}

}
