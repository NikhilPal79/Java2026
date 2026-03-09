package inclass.apr08.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Mobile> {

    @Override
    public int compare(Mobile m1, Mobile m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

