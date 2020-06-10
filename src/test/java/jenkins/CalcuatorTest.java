package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcuatorTest {

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertEquals(10, calc.addNumbers(5, 5));
	}
	
	@Test
	public void substractTest() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.substractNumbers(10, 5));
	}

}
