package inclass.mar04;

public class ForEachWith2DArray {
    static void main(String[] args) {

        int [][] rank = new int[3][3];

        rank[0][0] = 10;
        rank[0][1] = 20;
        rank[0][2] = 30;
        rank[1][0] = 40;
        rank[1][1] = 50;
        rank[1][2] = 60;
        rank[2][0] = 70;
        rank[2][1] = 80;
        rank[2][2] = 90;

        ///  using for each loop
        /// [for every integer array element in given array {print that element}]

        ///  we can

        for (int[] x : rank ){
            for ( int number : x ){

                System.out.println( number);


            }
        }



    }
}
