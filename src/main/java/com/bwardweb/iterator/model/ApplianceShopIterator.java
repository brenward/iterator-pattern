package com.bwardweb.iterator.model;

public class ApplianceShopIterator implements Iterator{
	StockItem[] items;
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
		if(hasNext()){
			return items[position++];
		}
		return null;
	}

}
