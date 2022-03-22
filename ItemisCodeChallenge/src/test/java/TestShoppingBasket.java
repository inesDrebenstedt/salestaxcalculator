package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;
import main.java.service.ShoppingBasketService;
import main.java.util.math.AllSalesTaxesCalculator;
import main.java.util.math.BasicSalesTaxCalculator;
import main.java.util.math.BasketTotalCalculator;
import main.java.util.math.BasketTotalWithoutTaxesCalculator;
import main.java.util.math.ImportTaxCalculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestShoppingBasket {

	private static ShoppingBasket basket0 = new ShoppingBasket("basket1");
	private static ShoppingBasket basket1 = ShoppingBasketService.prepareShoppingBasket1();
	private static ShoppingBasket basket2 = ShoppingBasketService.prepareShoppingBasket2();
	private static ShoppingBasket basket3 = ShoppingBasketService.prepareShoppingBasket3();
	private static boolean isExemptFromSalesTax = true;
	private static boolean isImported = true;
	

	@Test
	@Order(1)
	@DisplayName("#1")
	public void testNewBasketIsEmpty() {
		assertTrue(basket0.getBasketContent().size() == 0);
	}

	@Test
	@Order(2)
	@DisplayName("#2")
	public void testBasketWithOneBook() {

		Item book = new Item("book", 12.49, isExemptFromSalesTax, !isImported);
		ShoppingBasketService.addToBasket(basket0.getBasketContent(), book);
		assertTrue(basket0.getBasketContent().get(0).getCategory().contentEquals("book"));
		ShoppingBasketService.emptyBasket(basket0);
	}

	@Test
	@Order(3)
	@DisplayName("#3")
	public void testBasketWithOneItem() {
		Item book = new Item("book", 12.49, isExemptFromSalesTax, !isImported);
		ShoppingBasketService.addToBasket(basket0.getBasketContent(), book);
		assertTrue(basket0.getBasketContent().size() == 1);

	}

	@Test
	@Order(4)
	@DisplayName("#4")
	public void testBasketWithInput1() {

		assertTrue(basket1.getBasketContent().size() == 3);

	}

	@Test
	@Order(5)
	@DisplayName("#5")
	public void testCalculateSalesTaxesOfBasket1() {

		Double salesTaxOfBasket1 = BasicSalesTaxCalculator.calculateSalesTaxesOfBasket(basket1);
		assertEquals(1.50, salesTaxOfBasket1, 0.001);
	}

	@Test
	@Order(6)
	@DisplayName("#6")
	public void testCalculateImportTaxesOfBasket1() {

		Double importTaxOfBasket1 = ImportTaxCalculator.calculateImportTaxesOfBasket(basket1);
		assertEquals(0.0, importTaxOfBasket1, 0.0001);
	}

	@Test
	@Order(7)
	@DisplayName("#7")
	public void testCalculateTotalBasket1WithoutTaxes() {

		Double totalOfBasket1WithoutTaxes = BasketTotalWithoutTaxesCalculator.calculateBasketTotalWithoutTaxes(basket1);
		assertEquals(28.33, totalOfBasket1WithoutTaxes, 0.001);

	}

	@Test
	@Order(8)
	@DisplayName("#8")
	public void testCalculateTotalBasket1WithTaxes() {

		Double totalOfBasket1WithTaxes = BasketTotalCalculator.calculateTotalSumOfBasket(basket1);
		assertEquals(29.83, totalOfBasket1WithTaxes, 0.001);

	}

	@Test
	@Order(9)
	@DisplayName("#9")
	public void testBasket2Calculations() {

		Double totalOfBasket2WithoutTaxes = BasketTotalWithoutTaxesCalculator.calculateBasketTotalWithoutTaxes(basket2);
		assertEquals(57.50, totalOfBasket2WithoutTaxes, 0.001);

		Double basket2SalesTaxes = BasicSalesTaxCalculator.calculateSalesTaxesOfBasket(basket2);
		assertEquals(4.75, basket2SalesTaxes, 0.001);

		Double basket2ImportTaxes = ImportTaxCalculator.calculateImportTaxesOfBasket(basket2);
		assertEquals(2.90, basket2ImportTaxes, 0.001);

		Double basket2AllSalesTaxes = AllSalesTaxesCalculator.calculateAllSalesTaxes(basket2);
		assertEquals(7.65, basket2AllSalesTaxes, 0.001);

		Double basket2Total = BasketTotalCalculator.calculateTotalSumOfBasket(basket2);
		assertEquals(65.15, basket2Total, 0.001);

	}

	@Test
	@Order(9)
	@DisplayName("#10")
	public void testBasket3Calculations() {

		Double totalOfBasket3WithoutTaxes = BasketTotalWithoutTaxesCalculator.calculateBasketTotalWithoutTaxes(basket3);
		assertEquals(67.98, totalOfBasket3WithoutTaxes, 0.001);

		Double basket3SalesTaxes = BasicSalesTaxCalculator.calculateSalesTaxesOfBasket(basket3);
		assertEquals(4.70, basket3SalesTaxes, 0.001);

		Double basket3ImportTaxes = ImportTaxCalculator.calculateImportTaxesOfBasket(basket3);
		assertEquals(2.00, basket3ImportTaxes, 0.001);

		Double basket3AllSalesTaxes = AllSalesTaxesCalculator.calculateAllSalesTaxes(basket3);
		assertEquals(6.70, basket3AllSalesTaxes, 0.001);

		Double basket3Total = BasketTotalCalculator.calculateTotalSumOfBasket(basket3);
		assertEquals(74.68, basket3Total, 0.001);

	}
	
	@After
	public void tearDown() {
		basket0 = null;
		basket1 = null;
		basket2 = null;
		basket3 = null;
	}

}
