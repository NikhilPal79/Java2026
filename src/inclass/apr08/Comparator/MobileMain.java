package inclass.apr08.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileMain {
    static void main(String[] args) {

        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile(105,"iphone 15", "apple"));
        mobiles.add(new Mobile(102,"galaxy s", "samsung"));
        mobiles.add(new Mobile(103,"moto g", "motorolla"));
        mobiles.add(new Mobile(101,"google pixel", "google"));
        mobiles.add(new Mobile(104,"express music", "nokia"));
        System.out.println("before sorting : " + mobiles);
        Collections.sort(mobiles, new MobileComparator());
        System.out.println("after sorting : " + mobiles);
        System.out.println(" on the basis of name ");
        System.out.println("before sorting : " + mobiles);
        Collections.sort(mobiles, new NameComparator());
        System.out.println("after sorting : " + mobiles);
    }
}
