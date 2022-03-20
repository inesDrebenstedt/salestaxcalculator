package test.java;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import main.java.bo.ShoppingBasket;
import main.java.service.ShoppingBasketService;

public class TestShoppingBasket {
	
	private ShoppingBasketService basketFiller = new ShoppingBasketService();
	private ShoppingBasket basket1 = new ShoppingBasket("basket1");
	

	  @Test
	  @DisplayName("#1")
	  public void testNewBasketIsEmpty() {
		  assertTrue(basket1.getBasketContent().size() == 0);
	  }
	  
	  @Test
	  @DisplayName("#2")
	  public void testBasketWithOneBook() {
		  assertTrue(basket1.getBasketContent().get(0).getCategory().contentEquals("book"));
	  }
	  
	  @Test
	  @DisplayName("#3")
	  public void testBasketWithOneItem() {
		  assertTrue(basket1.getBasketContent().size() == 1);
	  }
	  
	  
	  
	  
		/*
	    System.out.println("Insert Input 1");
	    basketFiller.addToBasket(basket1, book);
	    basketFiller.addToBasket(basket1, musicCD);
	    basketFiller.addToBasket(basket1, chocolateBar);
	  
	  */

}
