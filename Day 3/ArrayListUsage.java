package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsage {
	public static void main(String[] args) {
		ArrayList arrlist = new ArrayList();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add("A");
		arrlist.add("B");
		System.out.println(arrlist);
		System.out.println(arrlist.get(2));
		arrlist.remove(2);
		System.out.println(arrlist);
		arrlist.remove("A");
		System.out.println(arrlist);
		arrlist.set(1, 5);
		System.out.println(arrlist);
		
		Iterator it= arrlist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
