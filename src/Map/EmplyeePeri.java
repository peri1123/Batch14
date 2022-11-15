package Map;

import java.util.*;

public class EmplyeePeri {
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

  String name,city;
  int age, id;

  public EmplyeePeri(String name, String city, int age) {
    this.name = name;
    this.city = city;
    this.age = age;
    this.id=idGenerator();
  }

  public static Integer idGenerator(){
    Random random =new Random();
    return random.nextInt();
  }

  @Override
  public String toString() {
    return "EmplyeePeri{" +
            "name='" + name + '\'' +
            ", city='" + city + '\'' +
            ", age=" + age +
            '}';
  }

  public static void employeeName(Map<Integer, EmplyeePeri> mapName){
    for (EmplyeePeri names: mapName.values()
         ) {
      System.out.println(names.name);

    }




  }
}





