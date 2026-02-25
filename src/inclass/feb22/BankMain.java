package inclass.feb22;

public class BankMain {
    static void main(String[] args) {

        Bank bank = new Bank(1500,519498);
        System.out.println("CURRENT BALANCE : " + bank.getCurrentBalance(1500));
        System.out.println("BALANCE AFTER DEPOSIT : " + bank.deposit(3000));
        System.out.println("BALANCE AFTER WITHDRAW : " + bank.withdraw(1000));

    }
}
