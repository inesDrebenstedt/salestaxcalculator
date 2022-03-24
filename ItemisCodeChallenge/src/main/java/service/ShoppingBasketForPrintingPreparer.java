package main.java.service;

import java.util.LinkedList;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;
import main.java.util.math.AllSalesTaxesCalculator;
import main.java.util.math.BasketTotalCalculator;
import main.java.util.math.EndPriceOfItemCalculator;
import main.java.util.math.MathTools;

public class ShoppingBasketForPrintingPreparer {
	
	private static ShoppingBasket basket1 = ShoppingBasketService.prepareShoppingBasket1();
	private static ShoppingBasket basket2 = ShoppingBasketService.prepareShoppingBasket2();
	private static ShoppingBasket basket3 = ShoppingBasketService.prepareShoppingBasket3();
	private static EndPriceOfItemCalculator itemEndpricer = new EndPriceOfItemCalculator();
	
	
	public static String prepareBasket1Output() {
		String outStr1 = "Output 1:\r\n"
				+ "> 1 book: " + MathTools.setFormat(endPriceForItemInBasket(basket1).get(0))  +"\r\n"
				+ "> 1 music CD: " + MathTools.setFormat(endPriceForItemInBasket(basket1).get(1)) +"\r\n"
				+ "> 1 chocolate bar: "+ MathTools.setFormat(endPriceForItemInBasket(basket1).get(2)) +"\r\n"
				+ "> Sales Taxes: "+ MathTools.setFormat(AllSalesTaxesCalculator.calculateAllSalesTaxesOfBasket(basket1)) +"\r\n"
				+ "> Total: " + MathTools.setFormat(BasketTotalCalculator.calculateTotalSumOfBasket(basket1));
		
		return outStr1;
	}
	
	public static String prepareBasket2Output() {
		String outStr2 = "Output 2:\r\n"
				+ "> 1 imported box of chocolates: "+ MathTools.setFormat(endPriceForItemInBasket(basket2).get(0)) +"\r\n"
				+ "> 1 imported bottle of perfume: "+  MathTools.setFormat(endPriceForItemInBasket(basket2).get(1)) +" \r\n"
				+ "> Sales Taxes: "+  MathTools.setFormat(AllSalesTaxesCalculator.calculateAllSalesTaxesOfBasket(basket2)) +"\r\n"
				+ "> Total: " + MathTools.setFormat(BasketTotalCalculator.calculateTotalSumOfBasket(basket2));
		
		return outStr2;
	}
	
	public static String prepareBasket3Output() {
		String outStr3 = "Output 3:\r\n"
				+ "> 1 imported bottle of perfume: "+ MathTools.setFormat(endPriceForItemInBasket(basket3).get(0)) +" \r\n"
				+ "> 1 bottle of perfume: "+ MathTools.setFormat(endPriceForItemInBasket(basket3).get(1)) +" \r\n"
				+ "> 1 packet of headache pills: "+ MathTools.setFormat(endPriceForItemInBasket(basket3).get(2)) +"\r\n"
				+ "> 1 imported box of chocolates: "+ MathTools.setFormat(endPriceForItemInBasket(basket3).get(3)) +" \r\n"
				+ "> Sales Taxes: "+  MathTools.setFormat(AllSalesTaxesCalculator.calculateAllSalesTaxesOfBasket(basket3)) +"\r\n"
				+ "> Total: " + MathTools.setFormat(BasketTotalCalculator.calculateTotalSumOfBasket(basket3));
		
		return outStr3;
	}
	
	private static LinkedList<Double> endPriceForItemInBasket(ShoppingBasket basket){
		LinkedList<Double> itemEndPrices = new LinkedList<Double>();
		Double endPriceOfOneItem = 0.0;
		
		for(Item item : basket.getBasketContent()) {
			endPriceOfOneItem = itemEndpricer.calculateEndPriceOfItem(item);
			itemEndPrices.add(endPriceOfOneItem);
		}	
		return itemEndPrices;
	}

}
