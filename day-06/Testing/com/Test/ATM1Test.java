package com.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.abcd.ATM1;

class ATM1Test {
	@Test
	public void TestWithdraw() {
		ATM1 test = new ATM1(4000);
		int remainingBalance = test.withdraw(2000);
		assertEquals(2000, remainingBalance);
	}
	
	@Test
	public void testWithdrawMoreThanBalance() {
		ATM1 atm = new ATM1(5000);
		int remainingBalance = atm.withdraw(6000);
		assertEquals(5000, remainingBalance);
	}
}
