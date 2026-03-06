package inclass.Practice.Assignment.Array;

import java.util.Arrays;

public class ArrayMain {
    static void main(String[] args) {


        int number[] = {10,30,43,54,23,543,43,32};

        String string = Arrays.toString(number);
        System.out.println(" converted array into string : " + string);

        for (int i = number.length -1 ; i >= 0; i--) {
            System.out.println(number[i]);
        }


        System.out.println();
        System.out.println(" other method of converting array into string and getting reverse array ");

        StringBuilder sb = new StringBuilder();
        for (int i = number.length -1 ;  i >=0; i--){
            sb.append(number[i]).append(" ");
        }
        String string1 = sb.toString().trim();
        System.out.println(" reverse string " + string1);

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
        System.out.println();


        int max1 = number[0];
        int max2 = number[0];
        for (int i = 1; i < number.length  ; i++) {
            if (number [i] > max1) {
                max2 = max1;
                max1 = number[i];
            }  else if (number[i] > max2 && number[i] != max1) {
                max2 = number[i];
            }
        }
        System.out.println(" second maximum of array "+ max2);
        System.out.println();

        int mini1= number[0];
        int mini2= number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < mini1) {
                mini2 = mini1;
                mini2  = number[i];
            } else if (number[i] < mini2 && number[i] != mini1) {
                mini2 = number[i];
            }
        }
        System.out.println(" second minimum of array " + mini2);
        System.out.println();

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println(" sum of array " + sum);
        System.out.println();

        int sum1 = 0;
        for (int i = 0; i < number.length ; i++) {
            sum1 = sum1+ number[i];
        }
        System.out.println(" sum of array " + sum1);
        System.out.println(" avg of array " + sum1/number.length);
        System.out.println();

        Arrays.sort(number);
        System.out.println(" sorted array " + Arrays.toString(number));


    }
}
