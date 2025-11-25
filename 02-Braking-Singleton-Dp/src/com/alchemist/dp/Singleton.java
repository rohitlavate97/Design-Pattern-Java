package com.alchemist.dp;

import java.io.Serializable;

public class Singleton implements Serializable{
	static Singleton instance = null;
	
	String name = "karthik";
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	/*
	 * Object readResolve(){ return instance; }
	 */
}
