package tddassessment;

public class StringCalculator {

	public static void main(String[] args) {
		// TODO: Need to write a logic here.
		
		//StringCalculator calculator = new StringCalculator();		
		//System.out.println(calculator.add("14;2\n7,//;"));
	}

	public Integer add(String numbers) {
		int sum = 0;
		
		StringBuilder delimeterString = new StringBuilder(",\\n");
		
		if(numbers.contains("//")) {
			delimeterString.append(numbers.charAt(numbers.indexOf("//")+2));
		}
		
		if(!(numbers.isBlank() && numbers.isEmpty())) {
			String[] numArray = numbers.split("["+ delimeterString +"]+");
			
			for(String value : numArray) {
				if(value.matches("[0-9]+"))
					sum += Integer.parseInt(value);
			}
		}
		
		return sum;
	}

}
