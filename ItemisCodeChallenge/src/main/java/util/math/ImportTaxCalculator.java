package main.java.util.math;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

public class ImportTaxCalculator {

	public static Double calculateImportTaxesOfBasket(ShoppingBasket basket) {
		Double sumOfImportTaxes = 0.0;

		if (basket.getBasketContent().size() != 0 && basket != null) {
			for (Item item : basket.getBasketContent()) {
				Double tempTax = calculateImportTaxOfItem(item);
				sumOfImportTaxes += tempTax;
			}
		}
		return MathTools.roundToNearestTwentieth(sumOfImportTaxes);
	}

	public static Double calculateImportTaxOfItem(Item item) {
		Double priceWithImportTax = 0.0;

		if (item.isImported()) {
			priceWithImportTax = (item.getPrice() / 100) * 5;
		}
		return MathTools.roundTo2ndDecimal(priceWithImportTax);
	}
}
