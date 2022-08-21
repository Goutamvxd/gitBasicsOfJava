package Interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDriver {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<Employee>();
        employeeList.add(new Employee("Arun",21,10000));
        employeeList.add(new Employee("Balaji",25,30000));
        employeeList.add(new Employee("Chandan",27,23000));
        employeeList.add(new Employee("Deepak",24,54000));
        employeeList.add(new Employee("Eshwar",26,56000));
        System.out.println("==============original salary===================");
        System.out.println(employeeList);

       List<Employee>incrementedSalary= employeeList.stream().map(e->{
            if(e.getAge()>25){
                e.setSalary(e.getSalary()*1.10);
            }
            return e;
        }).collect(Collectors.toList());
        System.out.println("========Incremented salary==========");
        System.out.println(incrementedSalary);


    }
}
