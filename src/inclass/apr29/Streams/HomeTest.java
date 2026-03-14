package inclass.apr29.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class HomeTest {
    static void main(String[] args) {


        List<Integer> list = Arrays.asList(12, 45, 78, 89, 56, 23, 13, 46, 79, 19, 73, 46, 82, 95, 75, 35, 15, 51, 71, 93, 83, 18, 56);


        Stream<String> stringStream = list.stream()
                .filter(n -> n % 2 == 0)
                .filter(p -> p % 2 != 0)
                .map(n -> String.valueOf(n * n));;

        System.out.println(stringStream);
    }
}
