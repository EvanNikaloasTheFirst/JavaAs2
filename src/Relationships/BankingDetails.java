package Relationships;

public class BankingDetails {
    private String bank;
    private double balance;

    private int AccountNumber;


    public BankingDetails(){
        AccountNumber = 0;
        bank="";
        balance = 0.0;
    }

    public BankingDetails(double b, String bank, int AccountNumber)
    {
        this.bank = bank;
        balance = b;
        this.AccountNumber = AccountNumber;

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

    public void setAccountNumber(int accountNumber){
        this.AccountNumber = AccountNumber;
    }
    public int getAccountNumber(int accountNumber){
        return AccountNumber;
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