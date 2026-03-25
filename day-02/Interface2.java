package com.abc;

interface it2 {
	abstract void add();
	abstract void div();
}

abstract class Abc3 implements it2 {
	public void add() {
		System.out.println("addition logic");
	}
}

public class Interface2 extends Abc3 {
	public void div() {
		System.out.println("divison logic");
	}

	public static void main(String[] args) {
		Interface2 gg = new Interface2();
		gg.add();
		gg.div();
	}
}