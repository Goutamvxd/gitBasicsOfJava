package Aug_thirteen.method.overloading;

public class OverloadingCalcu {
    void sum(int a, long b){
        System.out.println(a+b);
    }
void sum(int a,int b,int c){
    System.out.println(a+b+c);
}

    public static void main(String[] args) {
        OverloadingCalcu c1=new OverloadingCalcu();
        c1.sum(20,20);
        c1.sum(20,20,20);
    }
}
