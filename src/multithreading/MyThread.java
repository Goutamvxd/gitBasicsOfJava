package multithreading;
//yield method demo

public class MyThread {
    public void run(){
        for (int i=0;i<5;i++){
            Thread.yield();
            System.out.println("Thread started: " + Thread.currentThread().getName());
        }

        System.out.println("Thread ended: " + Thread.currentThread().getName());
    }
}
