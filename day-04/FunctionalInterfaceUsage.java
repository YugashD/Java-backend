package com.demo;

@FunctionalInterface
interface MyInterface {
	void m1();
}

public class FunctionalInterfaceUsage {
	public static void main(String[] args) {
		MyInterface obj = () -> {
			System.out.println("Hello I'm a functional interface");
		};
		obj.m1();
	}
}