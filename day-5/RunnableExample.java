package com.abc;

public class RunnableExample implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method" + i);
		}
	}

	public static void main(String[] args) {
		RunnableExample xx = new RunnableExample();
		Thread tt = new Thread(xx);
		tt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method" + i);
		}
	}
}