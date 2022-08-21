package Interview;

public class ReverseStringRecursion {
    public static void main(String[] args) {

        ReverseStringRecursion rv=new ReverseStringRecursion();
        String word="Goutam";
        System.out.println(rv.reverseString(word));
    }
public String reverseString(String str){
        if(str.isEmpty()){
            System.out.println("String is Empty");
            return str;
        }else {
            return reverseString(str.substring(1))+str.charAt(0);
        }
    }

}

