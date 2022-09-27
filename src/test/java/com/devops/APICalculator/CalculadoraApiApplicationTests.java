package com.devops.CalculatorAPI;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import com.devops.CalculatorAPI.model.Operations;

@RunWith(SpringRunner.class)
@SpringBootTest
class CalculatorAPIApplicationTests {


	@Autowired
	Operations calculator;

	@Test
	public void whenTwoNumbersComeAnAdditionnIsExpectedAsResult() {
		// Arrange
		double number1 = 0;
		double number2 = 1;
		double expected = 1;
		double deltaExpected = 0;
		//Act
		double currentResult = calculator.addition(number1, number2);

		//Assert
		assertEquals("The addition is not equals than the expected ", expected, currentResult, deltaExpected);
	}

	@Test
	public void whenTwoNumbersComeASubstractionIsExpectedAsResult() {
		// Arrange
		double number1 = 5;
		double number2 = 2;
		double expected = 3;
		double deltaExpected = 0;
		//Act
		double currentResult = calculator.substraction(number1, number2);

		//Assert
		assertEquals("The substraction is not equals than the expected ", expected, currentResult, deltaExpected);
	}

	@Test
	public void whenTwoNumbersComeAMultiplicationIsExpectedAsResult() {
		// Arrange
		double number1 = 10;
		double number2 = 4;
		double expected = 40;
		double deltaExpected = 0;
		//Act
		double currentResult = calculator.multiplication(number1, number2);

		//Assert
		assertEquals("The multiplication is not equals than the expected", expected, currentResult, deltaExpected);
	}

	@Test
	public void whenTwoNumbersComeADivisionIsExpectedAsResult() {
		// Arrange
		double number1 = 24;
		double number2 = 8;
		double expected = 3;
		double deltaExpected = 0;
		//Act
		double currentResult = calculator.division(number1, number2);

		//Assert
		assertEquals("The Division is not equals than the expected", expected, currentResult, deltaExpected);
	}

}
