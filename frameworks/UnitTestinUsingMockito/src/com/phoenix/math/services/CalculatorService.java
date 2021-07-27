package com.phoenix.math.services;

import com.phoenix.math.Calculator;

public class CalculatorService {

	private Calculator calci;
	 
    public CalculatorService() {
	// TODO Auto-generated constructor stub
    }

    public CalculatorService(Calculator calci) {
	  super();
	  this.calci = calci;
    }

    //Application business logic method
    public int addition(int a,int b) {
    	return calci.add(a, b);
    }
  //Application business logic method
    public int divition(int x,int y) {
    	return calci.divide(x, y);
    }

}
