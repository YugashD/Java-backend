package com.demo;

interface Tests3{
	void m1();
}
public class LambdaExpression2 {
	void m2() {
		System.out.println("Normal method");
	}
	public static void main(String[] args) {
		Tests3 t = () -> {
			System.out.println("Lambda Expression");
		};
		LambdaExpression2 l = new LambdaExpression2();
		l.m2();
		t.m1();
	}
}
