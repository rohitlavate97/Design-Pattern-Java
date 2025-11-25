package com.alchemist.dp;

public class TestForCloning {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.hashCode());
		
        Singleton s2 = (Singleton)s1.clone();
		System.out.println(s2.hashCode());
		
		System.out.println(Runtime.getRuntime().getClass().getName());
	}
	
}
