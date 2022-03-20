package main.java.util;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

public class ImportTaxCalculator {
	
	public static Double calculateImportTaxesOfBasket(ShoppingBasket basket) {
		Double sumOfImportTaxes = 0.0;
		
		for(Item item : basket.getBasketContent()) 
		{
			Double tempTax = GeneralMathUtil.round(calculateImportTaxOfItem(item), 2);
			sumOfImportTaxes += tempTax;
		}
		
		System.out.println("calculateImportTaxesOfBasket: " + sumOfImportTaxes);
		return sumOfImportTaxes;
	}
	
	public static Double calculateImportTaxOfItem(Item item) {
		Double priceWithImportTax = 0.0;
		
		if(item.isImported()) {
			priceWithImportTax = (item.getPrice() / 100) * 5;
		}
		System.out.println("calculateImportTaxOfItem: " + priceWithImportTax);
		return priceWithImportTax;
	}
}
