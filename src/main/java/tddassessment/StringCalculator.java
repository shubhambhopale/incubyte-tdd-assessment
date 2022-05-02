package tddassessment;

public class StringCalculator {

	public static void main(String[] args) {
		// TODO: Need to write a logic here.
		
		//StringCalculator calculator = new StringCalculator();		
		//System.out.println(calculator.add("14\n2\n7,\n"));
	}

	public Integer add(String numbers) {
		int sum = 0;
		
		if(!(numbers.isBlank() && numbers.isEmpty())) {
			String[] numArray = numbers.split("[,\n]+");
			
			for(String value : numArray)
				sum += Integer.parseInt(value);
		}
		
		return sum;
	}

}
