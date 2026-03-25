package com.demo;

interface Left {
	default void m1() {
		System.out.println("Left default method");
	}
}
interface Right {
	default void m1() {
		System.out.println("Right default method");
	}
}
public class DefaultMethod2 implements Left, Right {
	public void m1() {
		Left.super.m1();
	}
	public static void main(String[] args) {
		DefaultMethod2 t = new DefaultMethod2();
		t.m1();
	}
}
