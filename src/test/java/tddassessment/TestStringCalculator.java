package tddassessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestStringCalculator {

	static StringCalculator calculator;

	@BeforeAll
	static void setUp() {
		calculator = new StringCalculator();
	}

	@Test
	public void testEmptyStringWithCalculator() {
		assertEquals(0, calculator.add(""), "Should return a 0 for EMPTY string.");
	}

	@Test
	public void testSingleNumberStringWithCalculator() {
		assertEquals(5, calculator.add("5"), "Should return proper addition for the number(s).");
	}
}
