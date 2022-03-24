package main.java.util.math;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

public class AllSalesTaxesCalculator {
	
	public static Double calculateAllSalesTaxesOfBasket(ShoppingBasket basket) {
		Double allSalesTaxesOfBasket = 0.0;
		
		allSalesTaxesOfBasket += MathTools.roundToNearestTwentieth(BasicSalesTaxCalculator.calculateSalesTaxesOfBasket(basket));
		allSalesTaxesOfBasket += MathTools.roundToNearestTwentieth(ImportTaxCalculator.calculateImportTaxesOfBasket(basket));
		
		return MathTools.roundToNearestTwentieth(allSalesTaxesOfBasket);
	}
	
	public static Double calculateAllSalesTaxesOfItem(Item item) {
		Double allSalesTaxesOfItem = 0.0;
		
		allSalesTaxesOfItem += MathTools.roundToNearestTwentieth(BasicSalesTaxCalculator.calculateBasicSalesTaxOfItem(item));
		allSalesTaxesOfItem += MathTools.roundToNearestTwentieth(ImportTaxCalculator.calculateImportTaxOfItem(item));
		
		return MathTools.roundToNearestTwentieth(allSalesTaxesOfItem);
	}
	

}
