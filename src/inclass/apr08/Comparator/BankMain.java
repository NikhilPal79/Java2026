package inclass.apr08.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankMain {
    static void main(String[] args) {


        List<Bank> banks = new ArrayList<>();
        banks.add(new Bank(105,"scotia", 50000.00));
        banks.add(new Bank(102,"rbc", 40000.00));
        banks.add(new Bank(101,"td", 10000.00));
        banks.add(new Bank(103,"cibc", 20000.00));
        banks.add(new Bank(104,"bmo", 30000.00));
        System.out.println("before sorting on basis of name: " + banks);
        Collections.sort(banks);
        System.out.println("after sorting on basis of name : " + banks);
        System.out.println("before sorting on basis of balance : " + banks);
        Collections.sort(banks, new BalanceComparator());
        System.out.println("after sorting on basis of balance : " + banks);
    }
}
