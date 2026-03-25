package com.abc;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Number: "+i);
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class IsAliveUsage {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		System.out.println("Before starting thread, isAlive: "+t1.isAlive());
		t1.start();
		System.out.println("After starting thread, isAlive: "+t1.isAlive());
		try {
			t1.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After stopping thread, isAlive: "+t1.isAlive());
	}

}
