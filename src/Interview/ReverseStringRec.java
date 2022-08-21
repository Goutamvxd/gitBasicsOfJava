package Interview;

public class ReverseStringRec {
    public static void main(String[] args) {
        String input="Google";
        ReverseStringRec rc=new ReverseStringRec();
     rc.reverseString(input);
    }
void reverseString(String str){
        if((str==null)||(str.length()<=1)){
            System.out.println(str);
    }else {
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }
}
}
