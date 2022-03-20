package main.java.util;

import main.java.bo.ShoppingBasket;

public class BasketTotalCalculator {
	
	public static Double calculateTotalSumOfBasket(ShoppingBasket basket) {
		Double total = 0.0;
		
		total += BasketTotalWithoutTaxesCalculator.calculateBasketTotalWithoutTaxes(basket);
		total += SalesTaxCalculator.calculateSalesTaxesOfBasket(basket);
		total += ImportTaxCalculator.calculateImportTaxesOfBasket(basket);
		
		System.out.println("calculateTotalSumOfBasket: " + GeneralMathUtil.round(total, 2));
		return GeneralMathUtil.round(total, 2);
		
	}

}
