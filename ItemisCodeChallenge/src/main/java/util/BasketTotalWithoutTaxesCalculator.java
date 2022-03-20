package main.java.util;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

public class BasketTotalWithoutTaxesCalculator {
	
	public static Double calculateBasketTotalWithoutTaxes(ShoppingBasket basket) {
		Double totalWithoutTaxes = 0.0;
		
		for(Item item : basket.getBasketContent()) {
			totalWithoutTaxes += item.getPrice();
		}
		System.out.println("calculateBasketTotalWithoutTaxes: " + GeneralMathUtil.round(totalWithoutTaxes, 2));
		return GeneralMathUtil.round(totalWithoutTaxes, 2);
	}

}
