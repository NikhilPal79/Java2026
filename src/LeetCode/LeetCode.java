package LeetCode;

public class LeetCode {
    static void main(String[] args) {


        int[] numbers = {-1,2,-3,3};

        int left = 0;
        int right = numbers.length-1;
        int k = -1;

        while (left < right) {
            int sum =  numbers[left] + numbers[right];

            if (sum == 0) {
                k = Math.max(left, numbers[right]);
                left++;
                right--;
            } else if (sum< 0) {
                left++;
            }else {
                right--;
            }
        }
        System.out.println(" output : " + k );
    }
}
