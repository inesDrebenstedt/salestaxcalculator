package main.java.util;

import main.java.bo.ShoppingBasket;

public class BasketTotalCalculator {
	
	public static Double calculateTotalSumOfBasket(ShoppingBasket basket) {
		Double result = 0.0;
		
		result += BasketTotalWithoutTaxesCalculator.calculateBasketTotalWithoutTaxes(basket);
		
		result += AllSalesTaxesCalculator.calculateAllSalesTaxes(basket);
		
		return result;	
	}

}
