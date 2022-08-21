package Aug_fifteen.runnable;

public class EduRunnableDemo {
    public static void main(String[] args) {
        System.out.println("From main() :" + Thread.currentThread().getName());

        System.out.println("Creating Runnable Instance...");
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("From run (): "+ Thread.currentThread().getName());
            }
        };
        System.out.println("creating threa instance...");
        Thread thread=new Thread(runnable);
        System.out.println("Launching a thread....");
        thread.start();
    }
}
