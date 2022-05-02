package com.mentalist;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class enables user to read numbers from a string and do addition operation on the same.
 * 
 * @author ssatishb
 *
 */
public class StringCalculator {

	public static void main(String[] args) {
		// TODO: Need to write a logic here.
	}
	
	/**
	 * This method read the numbers from a {@link String} provided and returns the total SUM.
	 * 
	 * @param String
	 * @return Integer
	 * @throws NegativeNumberException
	 */
	public Integer add(String numbers) throws NegativeNumberException {
		int sum = 0;
		
		// checking if the String is not EMPTY or BLANK
		if (!(numbers.isBlank() && numbers.isEmpty())) {
			StringBuilder delimeterString = new StringBuilder(",\\n");
			
			// extracting and removing the delimiter syntax here
			if (numbers.contains("//")) {
				delimeterString.append(numbers.charAt(numbers.indexOf("//") + 2));
				numbers = numbers.replace("//" + numbers.charAt(numbers.indexOf("//") + 2), "");
			}

			String[] numArray = numbers.split("[" + delimeterString + "]+");
			
			// throwing the exception if negative values are provided
			Predicate<String> isNegative = num -> Integer.parseInt(num) < 0;
			if (Stream.of(numArray).anyMatch(isNegative)) {
				throw new NegativeNumberException("Negatives not allowed - "
						+ Stream.of(numArray).filter(isNegative).collect(Collectors.toList()));
			}

			for (String value : numArray) {
				if (value.matches("[0-9]+"))
					sum += Integer.parseInt(value);
			}
		}

		return sum;
	}

}

/**
 * This class is written to customize the {@link Exception} for negative number test-case.
 * 
 * @author ssatishb
 *
 */
@SuppressWarnings("serial")
class NegativeNumberException extends Exception {

	public NegativeNumberException(String message) {
		super(message);
	}
}
