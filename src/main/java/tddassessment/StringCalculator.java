package tddassessment;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {

	public static void main(String[] args) {
		// TODO: Need to write a logic here.

		// StringCalculator calculator = new StringCalculator();
		// try {
		// System.out.println(calculator.add("2,3,-4\n5,-2"));
		// } catch (NegativeNumberException e) {
		// e.printStackTrace();
		// }
	}

	public Integer add(String numbers) throws NegativeNumberException {
		int sum = 0;

		if (!(numbers.isBlank() && numbers.isEmpty())) {
			StringBuilder delimeterString = new StringBuilder(",\\n");

			if (numbers.contains("//")) {
				delimeterString.append(numbers.charAt(numbers.indexOf("//") + 2));
				numbers = numbers.replace("//" + numbers.charAt(numbers.indexOf("//") + 2), "");
			}

			String[] numArray = numbers.split("[" + delimeterString + "]+");

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

@SuppressWarnings("serial")
class NegativeNumberException extends Exception {

	public NegativeNumberException(String message) {
		super(message);
	}
}
