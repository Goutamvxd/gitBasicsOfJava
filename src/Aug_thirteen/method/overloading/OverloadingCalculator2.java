package Aug_thirteen.method.overloading;

public class OverloadingCalculator2 {
    void sum(int a,int b){
        System.out.println("int arg method invoked");
    }
void sum(long a, long b){
    System.out.println("long arg method invoked");
}

    public static void main(String[] args) {
        OverloadingCalculator2 obj=new OverloadingCalculator2();
        obj.sum(20,20);
    }
}
