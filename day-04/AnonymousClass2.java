package com.demo;

interface Tests 
{
  public abstract	void m1();
}
class OuterClass
{
	void m2()
	{
		System.out.println("Method of outerclass");
	}
	Tests   t = new Tests() {
		public void m1() {
              System.out.println("Method inside innerclass");			
		}
	};
}

public class AnonymousClass2 {
  
	 public static void main(String[] args) {
		 OuterClass cc = new OuterClass();
		 cc.m2();
		 cc.t.m1();
	}
	
}

