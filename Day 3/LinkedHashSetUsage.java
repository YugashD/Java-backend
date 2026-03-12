package com.collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetUsage {
	
	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();

		System.out.println("1.Initial size of LinkedHashSet before adding elements: "	+ set.size());
		System.out.println("2.LinkedHashSet is empty before adding values: "	+ set.isEmpty());
		System.out.println("3.Contents of LinkedHashSet before adding values: " + set);
		

		set.add("C");
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("D");
		set.add("F");


		System.out.println("4.Size of LinkedHashSet after adding elements: " + set.size());
		System.out.println("5.LinkedHashSet is empty after adding values: " + set.isEmpty());

		System.out.println("6.Contents of LinkedHashSet after adding values: " + set);

		boolean b1 = set.contains("E");
		System.out.println("7.Value E is present: " + b1);

		boolean b2 = set.contains("R");
		System.out.println("8.Value R is present: " + b2);

		set.remove("B");

		System.out.println("9.Size of LinkedHashSet after deletion: " + set.size());
		System.out.println("10.Contents of LinkedHashSet after deletion: " + set);
		
		Iterator it=set.iterator();
		System.out.println("Forward direction:");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}

		set.clear();
		System.out.println("11.Size of LinkedHashSet after clearing: " + set.size());
		System.out.println("12.Contents of LinkedHashSet after clearing: " + set);

	}
}
