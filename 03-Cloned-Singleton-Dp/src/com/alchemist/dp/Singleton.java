package com.alchemist.dp;

public class Singleton implements Cloneable {
	static Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	
	  @Override 
	  protected Object clone() { //method present in object class, so if we directly call in test class it is protected //actually it returns super.clone(); 
	         return instance;   //return same object
	  }
	 
}
