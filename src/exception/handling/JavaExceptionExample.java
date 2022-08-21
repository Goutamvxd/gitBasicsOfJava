package exception.handling;

public class JavaExceptionExample {
    public static void main(String[] args) {
        try{
            int data=100/0;
            //int a=50/0;   divde any number by zero

            //String s=null;
            //sout(s.length());
            //NullPointerException

            //String s="abc";
            //int i=Integer.parseInt(s);
            //NumberFormatException


            //int a[]=new int[5];
            //a[10]=50;
            //ArrayIndexOutOfBoundException
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}
