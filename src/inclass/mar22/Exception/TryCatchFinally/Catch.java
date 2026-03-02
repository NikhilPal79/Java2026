package inclass.mar22.Exception.TryCatchFinally;

public class Catch {
    static void main(String[] args) {

        try {
            int x =10;
            int y = 0;

            System.out.println(x/y);

        }catch (ArithmeticException e){
            e.getStackTrace();
            System.out.println("ArithmeticException");
        }
        finally {
            System.out.println("code in end line");
        }

    }
}
