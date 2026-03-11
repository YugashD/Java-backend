package com.abc;

//Class 1 checked exception with class to class

class BankService1 {
 static void withdrawMoney(int balance, int amount) throws Exception {
     checkBalance(balance, amount);
     System.out.println("Withdrawal successful");
 }
 static void checkBalance(int balance, int amount) throws Exception {
     if (amount > balance) {
         throw new Exception("Insufficient Balance");
     }
     System.out.println("Balance is sufficient");
 }
}
//Class 2
public class ThrowsExample2 {
 public static void main(String[] args) {
     try {
         BankService1.withdrawMoney(2000, 500);
     }
     catch (Exception e) {
         System.out.println("Transaction Failed: " + e.getMessage());
     }
 }
}
