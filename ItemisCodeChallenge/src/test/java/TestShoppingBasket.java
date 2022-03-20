package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;
import main.java.service.ShoppingBasketService;
import main.java.util.BasketTotalCalculator;
import main.java.util.BasketTotalWithoutTaxesCalculator;
import main.java.util.ImportTaxCalculator;
import main.java.util.SalesTaxCalculator;

public class TestShoppingBasket {
	
	//private ShoppingBasketService basketFiller = new ShoppingBasketService();
	private static ShoppingBasket basket1 = new ShoppingBasket("basket1");
	private static boolean isExemptFromSalesTax = true;
	private static boolean isImported = true;
	

	public void prepareShoppingBasket1() {
		  Item book = new Item("book", 12.49, isExemptFromSalesTax, !isImported);
		  Item musicCD = new Item("music CD", 14.99, !isExemptFromSalesTax, !isImported);
		  Item chocolateBar = new Item("chocolate bar", 0.85, isExemptFromSalesTax, !isImported);
		  ShoppingBasketService.addToBasket(basket1.getBasketContent(), book);
		  ShoppingBasketService.addToBasket(basket1.getBasketContent(), musicCD);
		  ShoppingBasketService.addToBasket(basket1.getBasketContent(), chocolateBar);
	}

	  @Test
	  @DisplayName("#1")
	  public void testNewBasketIsEmpty() {
		  assertTrue(basket1.getBasketContent().size() == 0);
	  }

	  @Test
	  @DisplayName("#2")
	  public void testBasketWithOneBook() {

		  Item book = new Item("book", 12.49, isExemptFromSalesTax, !isImported);
		  ShoppingBasketService.addToBasket(basket1.getBasketContent(), book);
		  assertTrue(basket1.getBasketContent().get(0).getCategory().contentEquals("book"));
		  ShoppingBasketService.emptyBasket(basket1);
	  }
	  
	  @Test
	  @DisplayName("#3")
	  public void testBasketWithOneItem() {
		  Item book = new Item("book", 12.49, isExemptFromSalesTax, !isImported);
		  ShoppingBasketService.addToBasket(basket1.getBasketContent(), book);
		  assertTrue(basket1.getBasketContent().size() == 1);
		  ShoppingBasketService.emptyBasket(basket1);
	  }
	  
	  @Test
	  @DisplayName("#4")
	  public void testBasketWithInput1() {
		  prepareShoppingBasket1();
		  
		  System.out.println(basket1.getBasketContent().size());
		  assertTrue(basket1.getBasketContent().size() == 3);
		  ShoppingBasketService.emptyBasket(basket1);
		  
	  }
	  
	  @Test
	  @DisplayName("#5")
	  public void testCalculateSalesTaxesOfBasket1() {
		  prepareShoppingBasket1();
		  
		  Double salesTaxOfBasket1 = 
				  SalesTaxCalculator.calculateSalesTaxesOfBasket(basket1);
		  assertEquals(1.50, salesTaxOfBasket1, 0.001);
		  ShoppingBasketService.emptyBasket(basket1);
	  }
	  
	  @Test
	  @DisplayName("#6")
	  public void testCalculateImportTaxesOfBasket1() {
		  prepareShoppingBasket1();
		  
		  Double importTaxOfBasket1 = 
				  ImportTaxCalculator.calculateImportTaxesOfBasket(basket1);
		  assertEquals(0.0, importTaxOfBasket1, 0.0001);
		  ShoppingBasketService.emptyBasket(basket1);
	  }
	  
	  @Test
	  @DisplayName("#7")
	  public void testCalculateTotalBasket1WithoutTaxes() {
		  prepareShoppingBasket1();
		  
		  Double totalOfBasket1WithoutTaxes = 
				  BasketTotalWithoutTaxesCalculator.calculateBasketTotalWithoutTaxes(basket1);
		  assertEquals(28.33, totalOfBasket1WithoutTaxes, 0.001);
		  
		  ShoppingBasketService.emptyBasket(basket1);
	  }
	  
	  @Test
	  @DisplayName("#8")
	  public void testCalculateTotalBasket1WithTaxes() {
		  prepareShoppingBasket1();
		  
		  Double totalOfBasket1WithTaxes = 
				  BasketTotalCalculator.calculateTotalSumOfBasket(basket1);
		  assertEquals(29.83, totalOfBasket1WithTaxes, 0.001);
		  
		  ShoppingBasketService.emptyBasket(basket1);
	  }

}
