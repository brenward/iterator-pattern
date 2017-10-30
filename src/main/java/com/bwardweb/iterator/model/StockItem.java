package com.bwardweb.iterator.model;

public class StockItem {
	String name;
	float price;
	
	public StockItem(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	public String toString(){
		return "Item name: " + name + ", Price: " + price;
	}
}
