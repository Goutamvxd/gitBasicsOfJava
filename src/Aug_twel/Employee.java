package Aug_twel;

public class Employee {
    int id;
    String name;
    static String orgName="Wipro";
    static void change(){
        orgName="LTI";
    }

    public Employee(int i, String n) {
        id = i;
        name = n;
    }

void display(){
    System.out.println(id + " " + name + " " +orgName);
}
}
