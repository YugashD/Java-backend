package com.demo;

abstract class Animal
{
  abstract	void eat();
}
public class AnonymousClass {
	  Animal cc = new Animal() {
		void eat() {
	     System.out.println("Animal ear grass");		
		}
	};
	public static void main(String[] args) {
		AnonymousClass  t = new AnonymousClass();
		t.cc.eat();
	}
	
}

