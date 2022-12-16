package Relationships;

import java.util.ArrayList;

public class Student {
        private String firstname;
        private String surname;
        private int age;

// Student
        private BankAccount account;
//        can only store bankaccount objects
        private ArrayList<BankAccount> accountList;

        public String getFirstname(){
            return  firstname;
    }

    public Student()
    {
        firstname = "";
        surname = "";
        age = 1;
        accountList = new ArrayList<BankAccount>();
    }

    public Student (String firstname, String s, int age){
            this.firstname = firstname;
            surname = s;
            this.age = age;
            accountList = new ArrayList<BankAccount>();


    }

    public void addAccount(BankAccount b)
    {
        accountList.add(b);
    }

    public  BankAccount getAccount(int i){
            return accountList.get(i);
    }

    public int countAccounts()
    {
        return accountList.size();
    }

    public void setBankAccount(BankAccount b){
            account = b;
    }
    public BankAccount getAccount()
    {
        return account;
    }


    public void setFirstname(String Firstname) {
        this.firstname = firstname;
    }

    public String getSurname(){
            return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public int getAge(){
        return age;
    }

    public void getAge(int age) {
        this.age = age;
    }

}
