package inclass.apr29.Steams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 45, 1, 2, 4, 446, 113, 14, 61, 11, 215, 5, 12, 25, 45, 54);
        System.out.println(list);
        /*Stream<Integer> listStream = list.stream();
        Predicate<Integer> isEven = x -> x % 2 == 0;*/
        list.stream().filter(x -> x % 2 == 0).filter(x -> x % 3 == 0).forEach(System.out::println);;
        List<Integer> collected = list.stream().filter(x -> x % 2 == 0).filter(x -> x % 3 == 0).collect(Collectors.toList());
        System.out.println(collected);


    }
}
