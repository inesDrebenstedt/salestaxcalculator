package main.java.service;

import java.util.LinkedList;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

public class ShoppingBasketService {
	
	 public static boolean isExemptFromSalesTax = true;
	 public static boolean isImported = true;

	public static LinkedList<Item> addToBasket(LinkedList<Item> list, Item item) {
		list.add(item);
		return list;
	}
	
	public static LinkedList<Item> emptyBasket(ShoppingBasket basket) {
		basket.getBasketContent().clear();
		return basket.getBasketContent();
	}
	
	public static ShoppingBasket prepareShoppingBasket1() {
		 ShoppingBasket basket1 = new ShoppingBasket("basket1");
		 boolean isExemptFromSalesTax = true;
		 boolean isImported = true;
		
		  Item book = new Item("book", 12.49, isExemptFromSalesTax, !isImported);
		  Item musicCD = new Item("music CD", 14.99, !isExemptFromSalesTax, !isImported);
		  Item chocolateBar = new Item("chocolate bar", 0.85, isExemptFromSalesTax, !isImported);
		  ShoppingBasketService.addToBasket(basket1.getBasketContent(), book);
		  ShoppingBasketService.addToBasket(basket1.getBasketContent(), musicCD);
		  ShoppingBasketService.addToBasket(basket1.getBasketContent(), chocolateBar);
		  
		  return basket1;
	}
	
	public static ShoppingBasket prepareShoppingBasket2() {
		 ShoppingBasket basket2 = new ShoppingBasket("basket2");
		
		  Item importedBoxChocolate = new Item("imported box of chocolates", 10.00, isExemptFromSalesTax, isImported);
		  Item importedPerfumeBottle = new Item("imported bottle of perfume", 47.50, !isExemptFromSalesTax, isImported);
		  ShoppingBasketService.addToBasket(basket2.getBasketContent(), importedBoxChocolate);
		  ShoppingBasketService.addToBasket(basket2.getBasketContent(), importedPerfumeBottle);
		  
		  return basket2;
	}
	
	public static ShoppingBasket prepareShoppingBasket3() {
		 ShoppingBasket basket3 = new ShoppingBasket("basket3");
		
		  Item importedPerfumeBottle = new Item("imported bottle of perfume", 27.99, !isExemptFromSalesTax, isImported);
		  Item perfumeBottle = new Item("imported bottle of perfume", 18.99, !isExemptFromSalesTax, !isImported);
		  Item aspirine = new Item("packet of headache pills", 9.75, isExemptFromSalesTax, !isImported);
		  Item importedBoxChocolate = new Item("imported box of chocolates", 11.25, isExemptFromSalesTax, isImported);

		  ShoppingBasketService.addToBasket(basket3.getBasketContent(), importedPerfumeBottle);
		  ShoppingBasketService.addToBasket(basket3.getBasketContent(), perfumeBottle);
		  ShoppingBasketService.addToBasket(basket3.getBasketContent(), aspirine);
		  ShoppingBasketService.addToBasket(basket3.getBasketContent(), importedBoxChocolate);
		  
		  return basket3;
	}
}
