package inclass.apr08.Comparator;

import java.util.Comparator;

public class BalanceComparator implements Comparator<Bank> {
    @Override
    public int compare(Bank b1, Bank b2) {
        return b2.balance.compareTo(b1.balance);
    }
}
