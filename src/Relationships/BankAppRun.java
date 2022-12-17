package Relationships;

import java.util.Scanner;

public class BankAppRun {
    public static void main(String[] args) {


        BankingDetails b = new BankingDetails(0, "Metro Bank", 123456);

        boolean runBank = true;
        System.out.println("Welcome to your Banking App");
        while (runBank) {
//            startBankApp();
            String[] tools = {"Balance", "Withdraw", "Deposit", "Exit"};
            Scanner input = new Scanner(System.in);
            int response;
            for (int i = 0; i < tools.length; i++) {
                System.out.println("Select " + i + " to " + tools[i]);
            }
            response = input.nextInt();
// This section displays the users current balance
            if (response == 0) {
                b.getBalance();
                System.out.println("Your current balance is " + b.getBalance());
            }
//            This section allows the user to withdraw money from the account if it is above 0
            if (response == 1) {
                int withdraw;
                System.out.println("Enter the amount to withdraw...");

                withdraw = input.nextInt();

                if (b.getBalance() - withdraw < 0) {
                    System.out.println("You have invalid funds, withdraw another amount...");
                    withdraw = input.nextInt();
                } else {
                    b.setBalance(b.getBalance() - withdraw);
                }
            }
// This allows you to deposit money into the bank account
            if (response == 2) {
                int deposit;
                System.out.println("Enter the amount to deposit...");
                deposit = input.nextInt();
                b.setBalance(b.getBalance() + deposit);
            }
// This exits the program
            if (response == 3) {
                System.out.println("Thanks for y=using this Banking system");
                runBank =  false;

            }
        }
    }
}
