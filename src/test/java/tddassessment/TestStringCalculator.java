package tddassessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStringCalculator {
	
	StringCalculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new StringCalculator();
	}
	
	@Test
	public void testEmptyStringWithCalculator() {
		assertEquals(0, calculator.add(""), "Should return a 0 for EMPTY string.");
	}
}
