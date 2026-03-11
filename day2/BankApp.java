package com.abc;

class MinimumBalanceException extends Exception {

    MinimumBalanceException(String message) {
        super(message);
    }

}
class BankService {

    static void withdrawMoney(int balance, int withdrawAmount) 
    		throws MinimumBalanceException {

        int remainingBalance = balance - withdrawAmount;

        if (remainingBalance < 1000) {
            throw new MinimumBalanceException("Minimum balance of 1000 must be maintained");
        }

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + remainingBalance);
    }

}

public class BankApp {
    public static void main(String[] args) {
        try {
            BankService.withdrawMoney(5000, 4500);
        } catch (MinimumBalanceException e) {

            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}