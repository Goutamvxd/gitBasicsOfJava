package multithreading;

public class TestMultiThr1 {
    public static void main(String[] args) {
        int n=8;
        for (int i=0;i<n; i++){
            MultiThr1 obj=new MultiThr1();
            obj.start();
        }
    }
}
