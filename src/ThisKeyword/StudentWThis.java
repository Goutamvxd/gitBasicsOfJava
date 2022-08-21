package ThisKeyword;

public class StudentWThis {
    int rollno;
    String name;
    float fees;
    StudentWThis(int rollno,String name,float fees){
        this.rollno=rollno;
        this.name=name;
        this.fees=fees;
    }
void display(){
    System.out.println(rollno +" "+ name +" "+ fees);
}
}
