package com.bwardweb.iterator.model;

public class Brochure {
	
	ApplianceShop appliances;
	
	public Brochure(ApplianceShop appliances){
		this.appliances = appliances;
	}
	
	public void printBrochure(){
		printBrochure(appliances.createIterator());
	}
	
	private void printBrochure(Iterator iterator){
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}
}
