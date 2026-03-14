package inclass.apr29.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Char {
    static void main(String[] args) {

        List<String> list = Arrays.asList("nik", "mik", "pic", "palak", "salak", "malik", "nikhil", "mayank", "manpret", "sawan","samriti");
        System.out.println(list);

        List<String> collected = list.stream()
                .filter(name -> name.length() == 3)
                .distinct()
                .collect(Collectors.toList());

        List<String> collected1 = list.stream()
                .filter(name -> name.length() == 5)
                .distinct()
                .collect(Collectors.toList());

        List<String> collected2 = list.stream()
                .filter(name -> name.length() == 6 )
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collected);
        System.out.println(collected1);
        System.out.println(collected2);
    }
}
