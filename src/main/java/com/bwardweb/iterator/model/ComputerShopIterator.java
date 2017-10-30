package com.bwardweb.iterator.model;

import java.util.List;

public class ComputerShopIterator implements Iterator{
	
	private int position;
	private List<StockItem> items;
	
	public ComputerShopIterator(List<StockItem> items){
		this.items = items;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.size()){
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return items.get(position++);
	}

}
