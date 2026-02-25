package inclass.mar01.Array;

import java.util.Arrays;

public class Test {
    static void main(String[] args) {
        ///  first way to write array
        int[] rollNo = {10,20,30,40,50,60,70,80,90,10};

        System.out.println(rollNo[0]);
        System.out.println(rollNo[1]);
        System.out.println(rollNo[2]);
        System.out.println(rollNo[3]);
        System.out.println(rollNo[4]);

        ///  second way to write array
        System.out.println();
        int[] rank = new int[5];
        rank[0] = 1;
        rank[1] = 2;
        rank[2] = 3;
        rank[3] = 4;
        rank[4] = 4;

        System.out.println(rank[0]);
        System.out.println(rank[1]);
        System.out.println(rank[2]);
        System.out.println(rank[3]);
        System.out.println(rank[4]);





    }
}
