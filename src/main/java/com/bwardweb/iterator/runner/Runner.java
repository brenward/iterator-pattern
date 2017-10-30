package com.bwardweb.iterator.runner;

import com.bwardweb.iterator.model.ApplianceShop;
import com.bwardweb.iterator.model.Brochure;
import com.bwardweb.iterator.model.StockItem;

public class Runner {

	public static void main(String[] args) {
		StockItem[] items = new StockItem[5];
		items[0] = new StockItem("Dish Washer",189.99f);
		items[1] = new StockItem("Washing Machine",289.99f);
		items[2] = new StockItem("Telly",389.99f);
		items[3] = new StockItem("Coffee Machine",59.99f);
		items[4] = new StockItem("Microwave",100.00f);
		
		ApplianceShop appliances = new ApplianceShop(items);
		
		Brochure brochure = new Brochure(appliances);
		brochure.printBrochure();

	}

}
