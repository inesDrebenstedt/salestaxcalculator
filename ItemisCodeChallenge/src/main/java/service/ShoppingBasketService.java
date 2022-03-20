package main.java.service;

import java.util.LinkedList;

import main.java.bo.Item;

public class ShoppingBasketService {

	public static LinkedList<Item> addToBasket(LinkedList<Item> list, Item item) {
		list.add(item);
		return list;
	}
}
