package Aug_sevenTen.java8;

public class MethodReference {

    public static void saySomething(){
        System.out.println("hello this is static method");
    }
    public static void main(String[] args) {

        Sayable sayable=MethodReference::saySomething;
        sayable.say();

    }
}
