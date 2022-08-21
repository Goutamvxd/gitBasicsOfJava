package Aug_thirteen.inheritance.aggregation;

public class Circle {
    Operation op;
    double pi=3.14;

    double are(int radius){
        op=new Operation();
        int rsquare=op.square(radius);
        return pi*rsquare;
    }

    public static void main(String[] args) {
        Circle c=new Circle();
        double result=c.are(5);
        System.out.println(result);
    }
}
