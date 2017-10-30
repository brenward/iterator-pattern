package com.bwardweb.iterator.runner;

import java.util.ArrayList;
import java.util.List;

import com.bwardweb.iterator.model.ApplianceShop;
import com.bwardweb.iterator.model.Brochure;
import com.bwardweb.iterator.model.ComputerShop;
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
		
		List<StockItem> computers = new ArrayList<StockItem>();
		computers.add(new StockItem("i7",1000.00f));
		computers.add(new StockItem("i3",400.00f));
		computers.add(new StockItem("i5",650.00f));
		computers.add(new StockItem("ryzen",850.00f));
		computers.add(new StockItem("phenom II",450.00f));
		computers.add(new StockItem("macbook",4000.00f));
		computers.add(new StockItem("surface",1500.00f));
		computers.add(new StockItem("celeron",100.00f));
		
		ComputerShop computerShop = new ComputerShop(computers);
		
		Brochure brochure = new Brochure(appliances, computerShop);
		brochure.printBrochure();

	}

}
