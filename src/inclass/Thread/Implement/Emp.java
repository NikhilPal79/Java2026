package inclass.Thread.Implement;

import java.lang.Runnable;

public class Emp implements Runnable {
    @Override
    public void run() {
        System.out.println("show method using implement Runnable way ");

        for (int i = 1; i < 10; i++) {
            System.out.println("value of i : " + i );
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
