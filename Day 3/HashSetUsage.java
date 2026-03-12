package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUsage {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();

		System.out.println("1.Initial size of HashSet before adding elements: "	+ set.size());
		System.out.println("2.HashSet is empty before adding values: "	+ set.isEmpty());
		System.out.println("3.Contents of HashSet before adding values: " + set);
		
		set.add("C");
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("D");
		set.add("F");

		System.out.println("4.Size of HashSet after adding elements: " + set.size());
		System.out.println("5.HashSet is empty after adding values: " + set.isEmpty());

		System.out.println("6.Contents of HashSet after adding values: " + set);

		boolean b1 = set.contains("E");
		System.out.println("7.Value E is present: " + b1);

		boolean b2 = set.contains("R");
		System.out.println("8.Value R is present: " + b2);

		set.remove("B");

		System.out.println("9.Size of HashSet after deletion: " + set.size());
		System.out.println("10.Contents of HashSet after deletion: " + set);
		
		Iterator it=set.iterator();
		System.out.println("Forward direction:");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}

		set.clear();
		System.out.println("11.Size of HashSet after clearing: " + set.size());
		System.out.println("12.Contents of HashSet after clearing: " + set);

	}
}
