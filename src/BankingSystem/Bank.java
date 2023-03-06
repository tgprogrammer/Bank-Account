package BankingSystem;

import java.util.Scanner;

public class Bank {
    private int accountNo;
    private String accountName;
    private double balance;
    private double interestRate;

    Scanner scanner = new Scanner(System.in);

    public Bank() {

    }

    public Bank(int accountNo, String accountName, double balance, double interestRate) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {

        return String.format("Account no: %d\nAccount Name: %s\nCurrent Balance: %.2f\nInterest Rate: %.2f",accountNo ,accountName, balance, interestRate );
    }


}
