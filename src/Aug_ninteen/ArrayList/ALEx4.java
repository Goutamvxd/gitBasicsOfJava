package Aug_ninteen.ArrayList;

import java.util.ArrayList;

public class ALEx4 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String >();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("grapes");
        System.out.println("returning element: "+list.get(1));
        list.set(1,"Dates");
        for (String fruit:list)
            System.out.println(fruit);
    }
}
