package inclass.mar01.Array;

public class MaxMin {
    public static void main(String[] args) {

        int[] rank = {15,65,46,79,461,613,48};

        System.out.println(" printing the maximum array");

        int max = rank[0];
        for (int i = 0; i < rank.length; i++) {
            if(rank[i] > max){
                max = rank[i];
            }
        }
        System.out.println(max);



        System.out.println(" printing the minimum array");

        int min = rank[0];
        for(int i = 0;i < rank.length; i++){

            if (rank[i] < min){
                min = rank[i];
            }
        }
        System.out.println(min);
    }
}
