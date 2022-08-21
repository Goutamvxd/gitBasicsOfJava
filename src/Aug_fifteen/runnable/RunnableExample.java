package Aug_fifteen.runnable;

public class RunnableExample implements  Runnable{
    public void run(){
        System.out.println("Hello from a Runnable");
    }

    public static void main(String[] args) {
        (new Thread(new RunnableExample())).start();
    }
}
