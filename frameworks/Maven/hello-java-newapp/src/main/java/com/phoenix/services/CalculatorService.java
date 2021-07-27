package com.phoenix.services;

import com.phoenix.math.Calculator;

public class CalculatorService {

	private Calculator calculator;
	
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	public CalculatorService(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public int addition(int a,int b) {
		return calculator.addition(a, b);
	}
}
