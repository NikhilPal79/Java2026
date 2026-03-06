package inclass.mar29.Collection;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {
    static void main(String[] args) {


        System.out.println(" raw list, string is adding in the place of integers[ no type safety ] ");
        List list = new ArrayList(5072 );
        list.add(7544);
        list.add(6566);
        list.add(6846);
        list.add("nikhil");
        System.out.println(list);
        System.out.println();

        System.out.println(" printing out the type-safety list ");

        List<Integer> list1 = new ArrayList<>();
        list1.add(7544);
        list1.add(6566);
        list1.add(6846);
        /*list1.add("nikhil");*/ /// giving me the compile time error

        System.out.println(list1);
    }
}
