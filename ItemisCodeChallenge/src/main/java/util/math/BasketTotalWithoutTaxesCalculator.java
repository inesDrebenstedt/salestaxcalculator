package main.java.util.math;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

/*
 * Returns total price of whole basket without taxes.
 * @param Shoppingbasket object.
 */
public class BasketTotalWithoutTaxesCalculator {
	
	public static Double calculateBasketTotalWithoutTaxes(ShoppingBasket basket) {
		Double totalWithoutTaxes = 0.0;
		
		for(Item item : basket.getBasketContent()) {
			totalWithoutTaxes += item.getPrice();
		}
		return MathTools.roundTo2ndDecimal(totalWithoutTaxes);
	}

}
