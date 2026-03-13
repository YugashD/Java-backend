package com.demo;

interface Tests4 {
	int m1(int x);
}

public class LambdaSingleParameter {
	public static void main(String[] args) {
		Tests4 i = x -> x * x;
		System.out.println("the square of 5 is " + i.m1(5));
	}
}