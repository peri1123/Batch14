package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {
    public static void main(String[] args) {

    Employee e1=new Employee("Oscar", "Chicago", 23 );
    Employee e2=new Employee("Alex", "Indiana", 35);
    Employee e3=new Employee("Matt", "Madison", 18);
    Employee e4=new Employee("Ben", "Washington DC", 45);


        System.out.println(e1.id);
        HashMap<Integer,Employee> employeeMap = new HashMap();

        employeeMap.put(e1.id, e1);
        employeeMap.put(e2.id, e2);
        employeeMap.put(e3.id, e3);
        employeeMap.put(e4.id, e4);


        System.out.println( employeeMap.get(e1.id));

        e1.printNames(employeeMap);

        System.out.println(Employee.youngEmployeeCityFinder(employeeMap));






    }
}
