package inclass.feb22;

import org.w3c.dom.ls.LSOutput;

public class Bank {

    double accountBalance;
    double accountNumber;

    public Bank(double accountBalance, double accountNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance(double balance) {
        return accountBalance;
    }

    public double deposit(double amount) {
        accountBalance = accountBalance + amount;
        return accountBalance;
    }

    public double withdraw(double amount) {
        if (accountBalance < amount) {
            System.out.println("INSUFFICIENT BALANCE");
            return accountBalance;
        } else {
            accountBalance = accountBalance - amount;
            System.out.println("WITHDRAW SUCCESSFULLY");
            ;
            return accountBalance;
        }

    }
}
