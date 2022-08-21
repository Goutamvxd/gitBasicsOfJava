package Aug_thirteen.method.overloading;

public class OverloadingCalculator3 {
    void sum(int a,long b){
        System.out.println("a method invoked");
    }
    void sum(long a,int b){
        System.out.println("b method invoked");
    }

    public static void main(String[] args) {
        OverloadingCalculator3 obj=new OverloadingCalculator3();

    //below code provides compiletime error, beacuse no matching type argument in the method
        //obj.sum(20,20);
    }
}
