package inclass.mar04;

public class MultiArray {
    static void main(String[] args) {


        int [][] rank = new int[3][3];

        System.out.println(rank[0][0] = 10);
        System.out.println(rank[0][1] = 20);
        System.out.println(rank[0][2] = 30);
        System.out.println(rank[1][0] = 40);
        System.out.println(rank[1][1] = 50);
        System.out.println(rank[1][2] = 60);
        System.out.println(rank[2][0] = 70);
        System.out.println(rank[2][1] = 80);
        System.out.println(rank[2][2] = 90);
        System.out.println();


        int [][] rollNo = new int[2][3];

        rollNo[0][0] = 1;
        rollNo[0][1] = 2;
        rollNo[0][2] = 3;
        rollNo[1][0] = 4;
        rollNo[1][1] = 5;
        rollNo[1][2] = 6;


        ///[for every integer array element in given array {print that element}]
        for ( int [] element : rollNo ){
            for (int number : element){
                System.out.println(number);
            }
        }
        System.out.println();


        int [][] id = new int[3][2];

        id  [0][0] = 100;
        id [0][1] = 200;
        id [1][0] = 300;
        id [1][1] = 400;
        id [2][0] = 500;
        id [2][1] = 600;

        for ( int [] element : id){
            for(int number2 : element){
                System.out.println(number2);
            }
        }





    }
}
