package Relationships;
public class RunApp {

    public static void main(String[] args) {
//        below is containment -> a student has to have a bank account for "new student" to be created

//        aggregation is when a student having a bank account is optional
        Student mys = new Student("Ada", "lovelace", 56);
        BankAccount b = new BankAccount(100,"Metro Bank");
        mys.addAccount(b);

//        mys.setBankAccount(b);
        System.out.println(mys.countAccounts());
    }
}