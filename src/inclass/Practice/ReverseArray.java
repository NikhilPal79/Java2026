package inclass.Practice;

public class ReverseArray {
    static void main(String[] args) {

        ///  reverse array
        int[] rank = {78,3,31,496,613,9464,6461,946,1633};

        for(int i = rank.length - 1 ; i >=0 ; i--){
            System.out.println(rank[i]);
        }
        System.out.println();

        ///  finding the maximuma and minimum

        int max = rank[0];
        for(int i = 0;i < rank.length ; i++){
            if( rank[i] > max){
                max = rank[i];

            }
        }
        System.out.println(max);
        ;


        ///  finding the minimum

        int mini = rank[0];

        for(int i = 0; i < rank.length;i ++){
            if( rank[i] < mini){
                mini = rank[i];
            }
        }
        System.out.println(mini);

        ///  type second to declare array
        System.out.println();

        int[] rollNo = new int[5];

        rollNo[0] = 1;
        rollNo[1] = 2;
        rollNo[2] = 3;
        rollNo[3] = 4;
        rollNo[4] = 5;

        System.out.println(rollNo[0]);
        System.out.println(rollNo[1]);
        System.out.println(rollNo[2]);
        System.out.println(rollNo[3]);
        System.out.println(rollNo[4]);


    }
}
