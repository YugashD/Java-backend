package com.abc;

public class NestedMethod {

	void m1() {
		this.m2();
		System.out.println("I am methos 1");
	}

	void m2() {
		System.out.println("I am method 2");
	}

	public static void main(String[] args) {
		NestedMethod gg = new NestedMethod();
		gg.m1();
	}
}