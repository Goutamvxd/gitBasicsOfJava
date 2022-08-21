package Aug_thirteen.inheritance;

public class ProgrammerEmp extends Employee {
    int bonus=10000;

    public static void main(String[] args) {
        ProgrammerEmp p=new ProgrammerEmp();
        System.out.println("----------------SALARY-DETAILS-------------------");
        System.out.println("Programmer salary is : "+ p.salary);
        System.out.println("Bonus of Programmer is : "+ p.bonus);
        double a= p.salary+ p.bonus;
        System.out.println("Total Salary including Bonus : "+ a);

    }
}
