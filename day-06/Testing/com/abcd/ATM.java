package com.abcd;

public class ATM {
	public int balance;
	public ATM(int balance) {
		this.balance=balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
}
