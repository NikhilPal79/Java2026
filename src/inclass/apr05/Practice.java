package inclass.apr05;

import java.util.*;

public class Practice {
    static void main(String[] args) {

        /// remove the duplicate from this array
        int[] arr = {10,34,53,23,53,32,34,53,232,53,54323,43,34};

        List<Integer> list = Arrays.asList(10,34,53,23,53,32,34,53,232,53,54323,43,34);
        System.out.println("original array as a list " + list);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println("removed duplicates       " + set);

        ///  find the duplicate in a set


        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();


        for (int integer : arr) {
            if (!seen.add(integer)) {
                duplicate.add(integer);
            }
        }
        System.out.println("duplicate elements " + duplicate);


    }
}
