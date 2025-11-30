package com.alchemist.dp;

public abstract class CoffeeDecorator implements Coffee{
	Coffee coffee;  
	
	CoffeeDecorator(Coffee coffee){
		this.coffee = coffee;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription();
	}
	
	@Override
	public double getCost() {
		return coffee.getCost();
	}

}
