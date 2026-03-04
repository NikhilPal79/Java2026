package inclass.Assignment.Array;

import java.util.Arrays;

public class ArrayMain {
    static void main(String[] args) {


        int number[] = {10,30,43,54,23,543,43,32};

        String string = Arrays.toString(number);
        System.out.println(" converted array into string : " + string);

        for (int i = number.length -1 ; i >= 0; i--) {
            System.out.println(number[i]);
        }


        System.out.println(" other method of converting array into string and getting reverse array ");

        StringBuilder sb = new StringBuilder(string);

        for (int i = number.length -1 ;  i >=0; i--){

        }

        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if ( number [i] > max) {
                max = number[i];
            }
        }
        System.out.println(" maximum of array " + max);
        System.out.println();


        int min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println(" minimum of array " + min);
    }
}
