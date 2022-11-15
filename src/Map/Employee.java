package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Employee {
    /*
    ====TASK:===========
-create an employee class with instance variables of name, city, age, id
-create one constructor to initialize instance variables
-create a method to generate random  employee id and use this id for employee
-create employeeTest class
-create 4 employee object and store them in a map
-while storing employees in the map, use their ids as key for the map
-create a method to print only employee names from map
Collapse
     */
    String name, city;
    int age, id;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = idGenerator();

    }

    public static int idGenerator(){
        Random random=new Random();
       return random.nextInt();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public  void printNames(Map<Integer, Employee> map){
        for (Employee employee:map.values()){
            System.out.println(employee.name);
        }
    }

    //create a method to
    // find out employees who are younger  than age of 25 and print their city name as a list
    public static List<String> youngEmployeeCityFinder(Map<Integer, Employee> map) {
        List<String> cities = new ArrayList<>();
        for (Employee youngEmployee : map.values()) {
            if (youngEmployee.age < 25) {
                cities.add(youngEmployee.city);
            }
        }


        return cities;
    }

}
