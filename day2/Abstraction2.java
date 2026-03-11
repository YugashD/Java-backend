package com.abc;
abstract class Abc2
{
	abstract void add();
	abstract void div();
}
abstract class Abcd2 extends Abc2
{
	void add()
	{
		System.out.println("addtion logic");
	}
}
public class Abstraction2 extends Abcd2 {
	void div()
	{
		System.out.println("Division logic");
	}
	public static void main(String[] args) {
		Abstraction2 gg = new Abstraction2();
		gg.add();
		gg.div();
		}
}
