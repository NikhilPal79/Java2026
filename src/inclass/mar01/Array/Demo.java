package inclass.mar01.Array;

import java.io.OptionalDataException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        ///  how to use scanner with array

        int [] rollNo = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the element by user ");

        OptionalDataException arr;
        for (int i = 0; i < rollNo.length; i++) {
            rollNo[i] = sc.nextInt();

        }

        System.out.println(" printing the element of array ");
        for (int i = 0; i < rollNo.length; i++) {
            System.out.println(rollNo[i]);
        }

    }
}
