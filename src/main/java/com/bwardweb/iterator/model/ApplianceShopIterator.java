package com.bwardweb.iterator.model;

public class ApplianceShopIterator implements Iterator{
	private StockItem[] items;
	private int position;
	
	public ApplianceShopIterator(StockItem[] items){
		this.items = items;
		position = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null){
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return items[position++];
	}

}
