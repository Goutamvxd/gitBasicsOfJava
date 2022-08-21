package multithreading;

class Mycount extends Thread{
    private int threadNo;
//constructor
    public Mycount(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        countMe();
    }

    //method
    public void countMe(){
        for (int i=1;i<=9;i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The value of thread is:"+ i +"and the thread number is"+threadNo);
        }
    }
}

public class App {

    public static void main(String[] args) {

        Mycount count1=new Mycount(1);
        Mycount count2=new Mycount(2);
        long startTime=System.currentTimeMillis();
        count1.run();
        System.out.println("==================================");
        count2.run();
        long endTime=System.currentTimeMillis();
        System.out.println("Total time required to process:"+(endTime-startTime));
    }
}
