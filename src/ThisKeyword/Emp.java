package ThisKeyword;

public class Emp {
    int empid;
    String ename;
    float esalary;
    Emp(int id,String n,float es){
        empid=id;
        ename=n;
        esalary=es;
    }
void  print(){
    System.out.println(empid+" "+ename+" "+esalary);
}
}
