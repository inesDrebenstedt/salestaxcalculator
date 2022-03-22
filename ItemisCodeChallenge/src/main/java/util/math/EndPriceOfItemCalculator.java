package main.java.util.math;

import main.java.bo.Item;

public class EndPriceOfItemCalculator {

	public Double calculateEndPriceOfItem(Item item) {
		Double endPriceOfItem = 0.0;
		
		endPriceOfItem += item.getPrice() + BasicSalesTaxCalculator.calculateBasicSalesTaxOfItem(item);
		endPriceOfItem += ImportTaxCalculator.calculateImportTaxOfItem(item);
		
		return MathTools.roundTo2ndDecimal(endPriceOfItem);
	}
}
