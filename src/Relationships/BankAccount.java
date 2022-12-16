package Relationships;

import java.util.ArrayList;

public class BankAccount {
    private String bank;
    private double balance;


    public BankAccount(){
        bank="";
        balance = 0.0;
    }

    public BankAccount(double b, String bank)
    {
        this.bank = bank;
        balance = b;

    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString()
    {
//        return the name of the bank and not just the address
        return "Bank name is: "+bank;
    }

}
