package inclass.Assignment.Array;

import java.util.Arrays;

public class TwoDimen {
    static void main(String[] args) {


        /// add two 3x3 arrays
        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};

        int sum [] []= new int [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum [i] [j] = array1[i][j] + array2[i][j];
                System.out.println(sum [i][j]);
            }
            System.out.println();
        }

        /// create a char array characters A , B , C , D

        char [] ab = {'A','B','C','D','E','F','G','H'};





    }
}
