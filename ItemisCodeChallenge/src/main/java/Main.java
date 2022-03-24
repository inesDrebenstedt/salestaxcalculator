package main.java;

import main.java.service.ShoppingBasketForPrintingPreparer;
import main.java.util.string.StringTools;

public class Main {

	public static void main(String[] args) {	
		
		System.out.println("### INPUT:");
		StringTools.printInput1();
		StringTools.printInput2();
		StringTools.printInput3();
		
		System.out.println("### OUTPUT");
		System.out.println(ShoppingBasketForPrintingPreparer.prepareBasket1Output());
		System.out.println(ShoppingBasketForPrintingPreparer.prepareBasket2Output());
		System.out.println(ShoppingBasketForPrintingPreparer.prepareBasket3Output());
				
	}
}
