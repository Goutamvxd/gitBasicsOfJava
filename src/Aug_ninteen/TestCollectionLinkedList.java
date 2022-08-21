package Aug_ninteen;

import java.util.Iterator;
import java.util.LinkedList;

public class TestCollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String >();
        al.add("Ravi");
        al.add("vijay");
        al.add("Ravi");
        al.add("vijay");
        Iterator<String> itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
