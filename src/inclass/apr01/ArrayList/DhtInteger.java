package inclass.apr01.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class DhtInteger {
    static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(5072);
        list.add(null);
        list.add(5072);
        list.add(6846);
        list.add(7544);
        list.add(2122);
        list.add(5846);
        list.add(5655);
        System.out.println(list);
        System.out.println("it will create a array of 0 first , when the first element is insert than the array of 10 will be created ");
        System.out.println(" called lazy initialization, saved memory");
        Object[] array = list.toArray();

        for (Object o : array) {
            System.out.println(o);
        }


        List list2 = new ArrayList();
        list2.add(5072);
        list2.add(5072);
        list2.add(null);
        list2.add(5844);
        list2.add(7544);
        list2.add(8646);
        System.out.println(list2);
        System.out.println(" both provide null and duplicate but internal implementation is different ");
    }
}
