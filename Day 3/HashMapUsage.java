package com.collections;

import java.util.HashMap;

public class HashMapUsage {
	public static void main(String[] args) {
		// Create a TreeMap
		HashMap map = new HashMap();

		map.put(new Integer(103), new Double(22.33));
		map.put(new Integer(105), "EEE");
		map.put(new Integer(102), "BBB");
		map.put(new Integer(101), "AAA");
		map.put(new Integer(104), "DDD");
		System.out.println(map);

	}

}
