package tddassessment;

public class StringCalculator {

	public static void main(String[] args) {
		// TODO: Need to write a logic here.
	}

	public Integer add(String string) {
		int sum = 0;
		
		if(!(string.isBlank() && string.isEmpty()))
			sum = Integer.parseInt(string);
		
		return sum;
	}

}
