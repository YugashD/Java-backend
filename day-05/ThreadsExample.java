package com.abc;

public class ThreadsExample extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method "+i);
		}
	}
	public static void main(String[] args) {
		ThreadsExample tt = new ThreadsExample();
		tt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main method "+i);
		}
	}
}
