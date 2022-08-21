package Aug_ninteen.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ALEx2 {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<String >();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("grapes");
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
