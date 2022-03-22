package main.java.util.string;


public class StringTools {
	

	/*
	 * Returns 2nd decimal after "." als String value. 12.34 returns "4"
	 * 
	 * @param Double value with two decimals after "."
	 */
	public static String get2ndDecimalAsString(double doubleWithTwoDecimals) {// TODO nullsafety &
																				// Illegalargumentexception
		String valueAsString = String.valueOf(doubleWithTwoDecimals);
		int indexOfLastDecimal = valueAsString.length();
		String secondDecimalAsString = valueAsString.substring(indexOfLastDecimal - 1, indexOfLastDecimal);
		return secondDecimalAsString;
	}
	
	
	public static void printInput1() {
		String input1Description = "### Input 1:\r\n"
				+ "> 1 book at 12.49\r\n"
				+ "> 1 music CD at 14.99\r\n"
				+ "> 1 chocolate bar at 0.85";
		System.out.println(input1Description);
	}
	
	public static void printInput2() {
		String input2Description = "### Input 2:\r\n"
				+ "> 1 imported box of chocolates at 10.00\r\n"
				+ "> 1 imported bottle of perfume at 47.50";
		System.out.println(input2Description);
	}
	
	public static void printInput3() {
		String input3Description = "### Input 3:\r\n"
				+ "> 1 imported bottle of perfume at 27.99\r\n"
				+ "> 1 bottle of perfume at 18.99\r\n"
				+ "> 1 packet of headache pills at 9.75\r\n"
				+ "> 1 box of imported chocolates at 11.25";
		System.out.println(input3Description);
	}

}
