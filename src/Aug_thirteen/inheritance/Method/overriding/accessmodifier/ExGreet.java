package Aug_thirteen.inheritance.Method.overriding.accessmodifier;

public class ExGreet extends Greet{

    //it shows compile time because msg() was taken as protected in Greet class

    /* void msg(){
        System.out.println("Hello java");
    }*/

    public static void main(String[] args) {
        ExGreet eg=new ExGreet();
        eg.msg();
    }
}
