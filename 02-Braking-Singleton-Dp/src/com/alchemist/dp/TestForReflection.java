package com.alchemist.dp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestForReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		Singleton s2 = declaredConstructor.newInstance();
		System.out.println(s2.hashCode());
	}
}
