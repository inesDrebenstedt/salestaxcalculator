package main.java.util;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

public class BasicSalesTaxCalculator {
	
	public static Double calculateSalesTaxesOfBasket(ShoppingBasket basket) {
		Double sumOfSalesTaxes = 0.0;
		
		for(Item item : basket.getBasketContent()) 
		{
			Double tempTax = calculateBasicSalesTaxOfItem(item);
			sumOfSalesTaxes += tempTax;
		}
		
		return GeneralMathAndStringUtil.roundTo2ndDecimal(sumOfSalesTaxes);
	}
	
	public static Double calculateBasicSalesTaxOfItem(Item item) {
		Double salesTax = 0.0;
		
		if(!item.isExemptFromBasicSalesTax()) {
			salesTax = (item.getPrice() / 100) * 10;
		}
		return GeneralMathAndStringUtil.roundTo2ndDecimal(salesTax);
	}
	
}
