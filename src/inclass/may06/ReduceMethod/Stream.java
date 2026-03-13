package inclass.may06.ReduceMethod;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    static void main(String[] args) {

        ArrayList<Double> integerArrayList = new ArrayList<>(List.of(12.0, 45.2, 7.5 ,2.5,5.5,4.5,2.5,3.5,4.5,7.5));


         Double reduced = integerArrayList.stream().sorted()
                .reduce(1.0, (a, b) -> a/b );
        System.out.println(reduced);


    }
}
