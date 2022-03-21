package main.java.util;


public class GeneralMathAndStringUtil {

	public static double roundTo2ndDecimal(double value) {
		Double result = 0.0;
		value = Math.round(value * 100);
		result = value / 100;
		System.out.println("roundTo2ndDecimal: " + result);
		return result;
	}

	/*
	 * Lesson learned: don't steal from stackoverflow.
	 */
	public static double roundToNearestTwentieth(double value) {

		if(!isRoundup(value)) {
		value = Math.floor(value * 20.0) / 20.0;
		return roundTo2ndDecimal(value);
		} else {
			value = Math.ceil(value * 20.0) / 20.0;
			return roundTo2ndDecimal(value);
		}	 
	}
	
	public static String get2ndDecimalAsString(double doubleWithTwoDecimals) {
		String valueAsString = String.valueOf(doubleWithTwoDecimals);
		int indexOfLastDecimal = valueAsString.length() ;
		String secondDecimalAsString = valueAsString.substring(indexOfLastDecimal-1, indexOfLastDecimal);
		return secondDecimalAsString;
	}
	
	public static Double stringToDouble(String s) {
		Double result = 0.0;	
		result = Double.valueOf(s);	
		return result;
	}
	
	public static boolean isRoundup(Double d) {
		String valString = get2ndDecimalAsString(d);
		Double stringToDouble = stringToDouble(valString);
		
		boolean result = true;
		if (stringToDouble < 5) {
			return false;
		}
		
		return result;
	}

}
