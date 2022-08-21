package Interview;


import java.util.Arrays;
import java.util.List;

//you have a list of number print the number which is starts from 1
public class NumOneFil {
    public static void main(String[] args) {
       List<Integer> number= Arrays.asList(10,20,30,12,14);
       number.stream().map(s->s+" ").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
