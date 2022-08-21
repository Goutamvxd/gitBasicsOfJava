package Aug_ninteen.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1=new Student(101,"sonoo",23);
        Student s2=new Student(102,"ravi",21);
        Student s3=new Student(103,"hanumant",25);
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Iterator itr=al.iterator();
        while (itr.hasNext()){
            Student st=(Student) itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);

        //System.out.println(al);  it provides hashvalue
        }

    }
}
