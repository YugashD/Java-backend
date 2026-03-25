package com.demo;

interface Left1 {
	default void m1() {
		System.out.println("Left default method");
	}
}

interface Right1 {
	default void m1() {
		System.out.println("Right default method");
	}
}

public class DefaultOverride implements Left1, Right1 {
	public void m1() {
//		Right.super.m1();
		System.out.println("Override method");
	}

	public static void main(String[] args) {
		DefaultOverride t = new DefaultOverride();
		t.m1();
	}
}
