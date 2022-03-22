package main.java.util.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import main.java.util.string.StringTools;

public class MathTools {

	/*
	 * Rounds double value to 2nd decimal after "." 1.234 -> 1.23
	 * 
	 * @param price of item as double value
	 */
	public static double roundTo2ndDecimal(double value) {
		Double result = 0.0;
		value = Math.round(value * 100);
		result = value / 100;
		return result;
	}

	/*
	 * Rounds to nearest 0.05. Rounds up, when rounding number >= 5 else rounds down
	 * when rounding number < 5 1.234 -> 1.23, 1.235 -> 1.24
	 * 
	 * @param Price of item als double value.
	 */
	public static double roundToNearestTwentieth(double value) {

		if (!isRoundup(value)) {
			value = Math.floor(value * 20.0) / 20.0;
			return roundTo2ndDecimal(value);
		} else {
			value = Math.ceil(value * 20.0) / 20.0;
			return roundTo2ndDecimal(value);
		}
	}

	/*
	 * Returns Double value of number represented as String.
	 * 
	 * @param Single digit number represented as String.
	 */
	public static Double stringToDouble(String s) {
		Double result = 0.0;
		result = Double.valueOf(s);
		return result;
	}

	/*
	 * Returns true if rounding number is >= 5.
	 * 
	 * @param Single digit Double value.
	 */
	public static boolean isRoundup(Double d) {
		String valString = StringTools.get2ndDecimalAsString(d);
		Double stringToDouble = stringToDouble(valString);
		int roundingLimit = 5;

		boolean result = true;
		if (stringToDouble < roundingLimit) {
			return false;
		}

		return result;
	}
	
	public static String setFormat(Double d) {
		  NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
		  DecimalFormat df = (DecimalFormat) nf;
		 df.setMinimumFractionDigits(2);
		 return df.format(d);
	}

}
