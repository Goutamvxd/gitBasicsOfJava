package Aug_ninteen.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<String > al=new ArrayList<String >();
        al.add("mango");
        al.add("apple");
        al.add("banana");
        al.add("grapes");
        Collections.sort(al);
        for (String fruits:al)
            System.out.println(fruits);
        System.out.println("sorting numbers");


        List<Integer> bl=new ArrayList<Integer>();
        bl.add(21);
        bl.add(11);
        bl.add(51);
        bl.add(1);
        Collections.sort(bl);
        for (Integer number:bl)
            System.out.println(number);
    }
}
