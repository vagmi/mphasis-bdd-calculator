package in.vagmim.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest     
{
	private Calculator calculator;
	@Before() 
	public void createCalculator() {
		this.calculator = new Calculator();
	}
	
	@Test
	public void shouldAddValues() {
		calculator.push(20);
		calculator.push("+");
		calculator.push(22);
		
		assertEquals(42,calculator.getResult());
	}
	
	@Test
	public void shouldSubtractValues() {
		calculator.push(62);
		calculator.push("-");
		calculator.push(20);
		assertEquals(42,calculator.getResult());
	}
	
	@Test
	public void shouldMultiplyValues() {
		calculator.push(6);
		calculator.push("*");
		calculator.push(7);
		assertEquals(42,calculator.getResult());
	}
	
	@Test
	public void shouldDivideValues() {
		calculator.push(210);
		calculator.push("/");
		calculator.push(5);
		assertEquals(42,calculator.getResult());
	}
}
