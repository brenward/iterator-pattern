package com.bwardweb.iterator.model;

public class Brochure {
	
	private ApplianceShop appliances;
	private ComputerShop computerShop;
	
	public Brochure(ApplianceShop appliances, ComputerShop computerShop){
		this.appliances = appliances;
		this.computerShop = computerShop;
	}
	
	public void printBrochure(){
		printBrochure(appliances.createIterator());
		printBrochure(computerShop.createIterator());
	}
	
	private void printBrochure(Iterator iterator){
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}
}
