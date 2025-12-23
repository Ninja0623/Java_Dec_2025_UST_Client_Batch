package com;

import java.util.ArrayList;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(50);
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("Raj");
	names.add("Raju");
	names.add("John");
	
	ArrayList<Object> data  = new ArrayList<Object>();	// can be Integer, String, Character 
	data.add(10);
	data.add("Raju");
	data.add(10.20);
	
	}

}
