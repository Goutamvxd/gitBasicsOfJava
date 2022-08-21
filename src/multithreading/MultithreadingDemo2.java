package multithreading;

public class MultithreadingDemo2 implements Runnable{
    public void run(){
        System.out.println("My thread is running state: Runnable way");
    }

    public static void main(String[] args) {
        MultithreadingDemo2 obj=new MultithreadingDemo2();
        Thread tobj=new Thread(obj);
        tobj.start();
    }
}
