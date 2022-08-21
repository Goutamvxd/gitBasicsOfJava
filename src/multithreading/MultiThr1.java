package multithreading;

public class MultiThr1 extends Thread{
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " is runnung");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
