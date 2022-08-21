package Aug_ninteen;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String >();
        list.add("ravi");
        list.add("vijay");
        list.add("ravi");
        list.add("ajay");
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
