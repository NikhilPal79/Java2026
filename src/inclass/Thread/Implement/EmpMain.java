package inclass.Thread.Implement;

public class EmpMain {
    static void main(String[] args) {


        Emp emp = new Emp();

        Thread thread = new Thread(emp);
        thread.start();

    }
}
