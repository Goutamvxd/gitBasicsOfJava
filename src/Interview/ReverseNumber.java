package Interview;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=5672;
        int reverse=0;
        while(number !=0){
            int remiander=number%10;
            reverse=reverse*10+remiander;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
