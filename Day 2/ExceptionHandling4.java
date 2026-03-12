package com.abc;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println(10 / 0);
			int[] a = { 10, 20, 30 };
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);

		} catch (Exception e) {
			System.out.println("exception reasied"+e);
		}
		System.out.println("Hello last statment");
	}
}
