package main.java.service;

import java.util.LinkedList;

import main.java.bo.Item;
import main.java.bo.ShoppingBasket;

public class ShoppingBasketService {

	public static LinkedList<Item> addToBasket(LinkedList<Item> list, Item item) {
		list.add(item);
		return list;
	}
	
	public static LinkedList<Item> emptyBasket(ShoppingBasket basket) {
		basket.getBasketContent().clear();
		return basket.getBasketContent();
	}
}
