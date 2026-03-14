package inclass.Thread.Extend;

public class Roger extends Thread {
    public void run()
    {
        System.out.println("run method using extend way ");

        for (int i = 0; i < 10; i++) {
            System.out.println(" value of i : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
