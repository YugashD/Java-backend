package com.demo;

interface Tests5 {
	void m1(int a, int b);
}
public class LambdaDoubleParameter {
	public static void main(String[] args) {
	Tests5 i = (a,b)->System.out.println("Addition of a and b is : "+(a+b));
	i.m1(2, 3);
	}
}
