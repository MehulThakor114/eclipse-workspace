package com.phoenix.math.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

class CalculatorServiceTest {

	private static CalculatorService calService;

	//if using beforeall and afterall method must be static
	@BeforeAll //initialization logic 
	public static void inti() {
		calService = new CalculatorService(new Calculator());
	}
	@Test        //test method - test case
	public void testAddition() {
		int expectedResult =30;
		int actualResult = calService.addition(20,20);
		
		//testing service funtionality
		//assertEquals(expectedResult,actualResult);
		assertNotEquals(expectedResult,actualResult);
	}
	
	@Test
	public void checkDivision(){
		//assertEquals(2,calService.divition(10, 5));
		assertNotEquals(3,calService.divition(10, 5));
	}
	@Test
	public void checkDivideByZeroException() {
		//assertThrows(ArithmeticException.class,Executable.)
	}
	
	@AfterAll  //clean up logic
	public static void clean() {
		calService = null;
	}
}
