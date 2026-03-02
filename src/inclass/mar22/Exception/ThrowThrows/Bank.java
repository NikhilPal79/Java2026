package inclass.mar22.Exception.ThrowThrows;

import java.util.Scanner;

public class Bank {
    int balance;
    int deposit;
    int withdraw;

    Scanner sc = new Scanner(System.in);

    public void balance() {
        System.out.println("Enter your balance");
        balance = sc.nextInt();
    }

    public void deposit() {
        System.out.println("Enter your deposit");
        deposit = sc.nextInt();
        balance = balance + deposit;
        System.out.println("Your current balance is "+ balance );
    }

    public void withdraw() throws InvalidBalanceException {
        System.out.println("Enter your withdraw");
        withdraw = sc.nextInt();
        if ( withdraw > balance ) {
            throw new InvalidBalanceException("Insufficient funds");
        }else {
            balance = balance - withdraw;
            System.out.println("Your current balance is "+ balance );
        }
    }
}
