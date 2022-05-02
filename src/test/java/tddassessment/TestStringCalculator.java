package tddassessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
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

	@Test
	public void testSeveralNumberStringWithCalculator() {
		assertEquals(23, calculator.add("14,2,7"), "Should return proper addition for the number(s).");
	}

	@Test
	public void testNewLineBetweenNumbersStringWithCalculator() {
		assertEquals(36, calculator.add("6\n21,9"),
				"Should return proper addition for the number(s) even with a New Line character in between.");
	}

	@Test
	public void testNewDelimiterStringWithCalculator() {
		assertEquals(36, calculator.add("//;6\n21,9"),
				"Should return proper addition for the number(s) provided a new delimiter in a string.");
	}
}