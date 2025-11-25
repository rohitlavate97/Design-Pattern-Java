package com.alchemist.dp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestForSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Serialization
		String filePath = "C:\\data\\Projects\\Design Pattern\\serializableDoc.txt";
		Singleton s = Singleton.getInstance();
		
		FileOutputStream f = new FileOutputStream(filePath);
		ObjectOutputStream obj = new ObjectOutputStream(f);
		obj.writeObject(s);
		//Deserialization
		FileInputStream fi = new FileInputStream(filePath);
		ObjectInputStream in = new ObjectInputStream(fi);
		Singleton s1 = (Singleton)in.readObject();
		System.out.println(s1.name);              //karthik
		System.out.println(s1.hashCode());        //2058534881
		
		System.out.println(s.hashCode());         //1267032364
	}
}
