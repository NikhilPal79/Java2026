package inclass.Thread.Operation;

public class ThreadOp extends Thread {
    @Override
    public void run() {
        System.out.println(" this is user defined thread ");
    }


    static void main(String[] args) {

        System.out.println(" program started ");

        int x = 2 + 15;
        System.out.println(" sum is : " + x );

        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println(" current thread name is : " + name);

        thread.setName("MyThread");
        System.out.println(" changed thread name is : " + thread.getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long id = thread.getId();
        System.out.println(" thread id : " + id);

        ThreadOp threadOp = new ThreadOp();
        threadOp.start();


        System.out.println(" program ended ");
    }
}
