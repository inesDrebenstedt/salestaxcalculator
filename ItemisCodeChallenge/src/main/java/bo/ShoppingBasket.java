package main.java.bo;

import java.util.LinkedList;

public class ShoppingBasket {
	
	private String name;
	private LinkedList<Item> basketContent;
	
	public ShoppingBasket(String name) {
		this.name = name;
		this.basketContent = new LinkedList<Item>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Item> getBasketContent() {
		return basketContent;
	}

	public void setBasketContent(LinkedList<Item> basketContent) {
		this.basketContent = basketContent;
	}

	@Override
	public String toString() {
		return "Name: '" + this.name;
	}
	
	

}
