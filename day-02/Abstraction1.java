package com.abc;
abstract class Abcd
{
	void add()
	{
		System.out.println("additon");
	}
	abstract void div();
}
public class Abstraction1 extends Abcd {
	void div()
	{
		System.out.println("division logic");
	}
	public static void main(String[] args) {
		Abstraction1 gg = new Abstraction1();
		gg.add();
		gg.div();
		}
}

