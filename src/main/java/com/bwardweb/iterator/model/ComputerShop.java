package com.bwardweb.iterator.model;

import java.util.List;

public class ComputerShop implements Shop{

	private List<StockItem> items;
	
	public ComputerShop(List<StockItem> items){
		this.items = items;
	}
	
	@Override
	public Iterator createIterator() {
		return new ComputerShopIterator(items);
	}

}
