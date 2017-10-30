package com.bwardweb.iterator.model;

public class ApplianceShop implements Shop{
	
	private StockItem[] items;
	
	
	public ApplianceShop(StockItem[] items){
		this.items = items;		
	}

	@Override
	public Iterator createIterator() {
		return new ApplianceShopIterator(items);
	}

}
