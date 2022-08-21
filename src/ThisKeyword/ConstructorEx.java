package ThisKeyword;

public class ConstructorEx {
    int rollno;
    String name,course;
    float fees;
    ConstructorEx(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
ConstructorEx(int rollno,String name,String course,float fees){
        this(rollno,name,course);
        this.fees=fees;
}
void printinfo(){
    System.out.println(rollno+" "+name+" "+fees);
}
}
