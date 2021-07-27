package com.phoenix.inner;

public class OuterML {
	
	public void show()
	{
		int a=10;
		class Inner
		{
			private int x;
			public Inner()
			{
				x=700;
			}
			public Inner(int x)
			{
				super();
				this.x=x;
			}
			public void test()
			{
				System.out.println(x);
				
				System.out.println("Method Variable: " + a);
			}
		}//End of local Inner class

		Inner in = new Inner();
		in.test();
		
	}//End of method

}
