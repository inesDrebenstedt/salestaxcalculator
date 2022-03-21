package main.java.util;

import main.java.bo.ShoppingBasket;

public class AllSalesTaxesCalculator {
	
	public static Double calculateAllSalesTaxes(ShoppingBasket basket) {
		Double allSalesTaxesOfBasket = 0.0;
		
		allSalesTaxesOfBasket += GeneralMathAndStringUtil.roundToNearestTwentieth(BasicSalesTaxCalculator.calculateSalesTaxesOfBasket(basket));

		allSalesTaxesOfBasket += GeneralMathAndStringUtil.roundToNearestTwentieth(ImportTaxCalculator.calculateImportTaxesOfBasket(basket));
		
		return GeneralMathAndStringUtil.roundToNearestTwentieth(allSalesTaxesOfBasket);
	}

}
