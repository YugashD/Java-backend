package com.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.abcd.ATM;

class ATMTest {
	@Test
	public void TestWithdraw() {
		ATM test = new ATM(4000);
		int remainingBalance = test.withdraw(2000);
		assertEquals(2000, remainingBalance);
	}
	
	@Test
	public void testWithdrawMoreThanBalance() {
		ATM atm = new ATM(5000);
		int remainingBalance = atm.withdraw(6000);
		assertEquals(000, remainingBalance);
	}
}
