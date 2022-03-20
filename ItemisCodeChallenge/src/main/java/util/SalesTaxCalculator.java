package main.java.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

public class SalesTaxCalculator {
	
	public static Double calculateSalesTaxesOfBasket(ShoppingBasket basket) {
		Double sumOfSalesTaxes = 0.0;
		
		for(Item item : basket.getBasketContent()) 
		{
			Double tempTax = round(calculateSalesTaxOfItem(item), 2);
			sumOfSalesTaxes += tempTax;
		}
		
		System.out.println("calculateSalesTaxesOfBasket: " + sumOfSalesTaxes);
		return sumOfSalesTaxes;
	}
	
	public static Double calculateSalesTaxOfItem(Item item) {
		Double priceWithSalesTax = 0.0;
		
		if(!item.isExemptFromSalesTax()) {
			priceWithSalesTax = (item.getPrice() / 100) * 10;
		}
		System.out.println("calculateSalesTaxOfItem: " + priceWithSalesTax);
		return priceWithSalesTax;
	}
	
	
	/*
	 * Stolen from stackoverflow
	 */
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	

}
