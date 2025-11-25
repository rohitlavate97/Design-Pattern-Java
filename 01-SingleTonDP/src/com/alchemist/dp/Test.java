package com.alchemist.dp;

public class Test {
	public static void main(String[] args) {
		NonSingleton ns1 = new NonSingleton();
		NonSingleton ns2 = new NonSingleton();
		System.out.println(ns1.hashCode());
		System.out.println(ns2.hashCode());
		
		SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
