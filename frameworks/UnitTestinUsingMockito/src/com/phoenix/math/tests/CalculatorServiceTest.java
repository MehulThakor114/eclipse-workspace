package com.phoenix.math.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

	@Mock
	private CalculatorService calciService;
	
	@InjectMocks
	private Calculator calculator;
	
	@Before
	public void initService() {
		// Creating Mock object of calculatorService
		//calciService = Mockito.mock(CalculatorService.class);
		//calciService = Mockito.spy(CalculatorService.class);
		//creating partial mock - wrapper or real object of calculator service
		//calciService = Mockito.spy(new CalculatorService(new Calculator()));
	}
	@Test
	public void testAddition() {
		//Creating mock behavior of mock object
		Mockito.when(calciService.addition(100, 200)).thenReturn(300);
		
		//creating spy behavior on real method
		//Mockito.when(calciService.addition(10, 20)).thenCallRealMethod();
		
		assertEquals(300,calciService.addition(100, 200));
	}

}
