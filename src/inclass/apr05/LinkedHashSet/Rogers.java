package inclass.apr05.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Rogers {
    static void main(String[] args) {

        Set<Integer> integerSet = new HashSet();
        integerSet.add(20721);
        integerSet.add(56413);
        integerSet.add(70172);
        integerSet.add(90972);
        integerSet.add(81272);
        integerSet.add(65272);
        integerSet.add(65272);
        System.out.println("random order in    HASHSET " + integerSet);

        Set<Integer> integerSet2 = new TreeSet();
        integerSet2.add(20721);
        integerSet2.add(56413);
        integerSet2.add(70172);
        integerSet2.add(90972);
        integerSet2.add(81272);
        integerSet2.add(65272);
        System.out.println("NATURAL ORDER IN TREE SET  " + integerSet2);

        Set<Integer> set = new LinkedHashSet();
        set.add(20721);
        set.add(56413);
        set.add(70172);
        set.add(90972);
        set.add(81272);
        set.add(65272);
        System.out.println("INSERTION ORDER  IN LINKED " + set);
        System.out.println();

        System.out.println(set.toArray());
        set.toArray(new Integer[35845]);
        System.out.println(set);
        boolean contains = set.contains(20721);
        System.out.println(contains);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.remove(65272));
        System.out.println(set);
        set.spliterator().characteristics();
        System.out.println(set);
        System.out.println(" find the maximum integer");



    }
}
