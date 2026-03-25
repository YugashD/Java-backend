package com.abcd;

public class ATM1 {
	public int balance;
	public ATM1(int balance) {
		this.balance=balance;
	}
	public int withdraw(int amount) {
		if(amount>balance)
			return balance;
		balance-=amount;
		return balance;
	}
}
