package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesExamples {

	public static void main(String[] args) {
	//HashSet hs = new HashSet();			// unorder 
	//LinkedHashSet hs = new LinkedHashSet();	// order 
	TreeSet hs = new TreeSet();				// asc order 
	System.out.println("size "+hs.size());
	hs.add(10.10);
	hs.add(10.10);
	hs.add(50.20);
	hs.add(20.50);
	//hs.add(20.50);
	//hs.add("John");
	System.out.println("size "+hs.size());
	System.out.println(hs);  // display data as string format 
	//hs.remove("John");		// remove using value 
	System.out.println(hs);
	System.out.println("search "+hs.contains(10.10));
	System.out.println("search "+hs.contains(100.10));
	}

}
