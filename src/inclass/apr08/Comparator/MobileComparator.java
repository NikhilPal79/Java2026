package inclass.apr08.Comparator;

import java.util.Comparator;

public class MobileComparator implements Comparator<Mobile> {
    @Override
    public int compare(Mobile m1, Mobile m2) {
        return m1.getBrand().compareTo(m2.getBrand());
    }

}
