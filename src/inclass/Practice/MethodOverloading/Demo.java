package inclass.Practice.MethodOverloading;

public class Demo {
    int a;
    int b;
    int c;

    public void sum( int a, int b){
        int sum = a + b;
        System.out.println(" sum of a and b " + sum);

    }

    public void sum(int a, int b, int c ){
        int sum = a + b + c;
        System.out.println(" sum of a , b and c  " + sum);
    }


}
