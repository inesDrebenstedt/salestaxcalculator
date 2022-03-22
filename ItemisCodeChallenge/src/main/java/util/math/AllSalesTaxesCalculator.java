package main.java.util.math;

import main.java.bo.ShoppingBasket;

public class AllSalesTaxesCalculator {
	
	public static Double calculateAllSalesTaxes(ShoppingBasket basket) {
		Double allSalesTaxesOfBasket = 0.0;
		
		allSalesTaxesOfBasket += MathTools.roundToNearestTwentieth(BasicSalesTaxCalculator.calculateSalesTaxesOfBasket(basket));

		allSalesTaxesOfBasket += MathTools.roundToNearestTwentieth(ImportTaxCalculator.calculateImportTaxesOfBasket(basket));
		
		return MathTools.roundToNearestTwentieth(allSalesTaxesOfBasket);
	}

}
