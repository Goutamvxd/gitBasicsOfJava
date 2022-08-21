package Aug_thirteen.inheritance.aggregation;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
void display(){
    System.out.println(id+" "+name);
    System.out.println(address.city +" "+ address.state +" "+ address.country);
}

    public static void main(String[] args) {
        Address address1=new Address("Bdr","KA","India");
        Address address2=new Address("Nasik","MH","India");

        Emp e1=new Emp(111,"varun",address1);
        Emp e2=new Emp(121,"arun",address2);

        System.out.println("====Employee-Details======");
        e1.display();
        System.out.println("------------------------------");
        e2.display();
    }
}
