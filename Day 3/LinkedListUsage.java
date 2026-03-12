package com.collections;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUsage {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("A");
		list.add("B");
		list.add(2);
		list.add(null);
		
		
		
		ListIterator it=list.listIterator();
		System.out.println("Forward Direction");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("Backward Direction");
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
		}
		
	}
}
