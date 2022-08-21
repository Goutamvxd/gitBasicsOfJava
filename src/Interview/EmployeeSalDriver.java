package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalDriver {
    public static void main(String[] args) {
        List<EmployeeSal> employeeSals=new ArrayList<EmployeeSal>();
        employeeSals.add(new EmployeeSal("abc",24,860000));
        employeeSals.add(new EmployeeSal("def",25,960000));
        employeeSals.add(new EmployeeSal("ghi",23,660000));
        employeeSals.add(new EmployeeSal("jkl",26,760000));
        employeeSals.add(new EmployeeSal("mno",22,560000));

        employeeSals.stream().filter(e -> e.getSalary()>760000).forEach(System.out::println);


    }
}
