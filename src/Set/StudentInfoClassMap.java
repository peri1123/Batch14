package Set;

import java.util.*;

public class StudentInfoClassMap {
    public static void main(String[] args) {
        /*
        -StudentInfo Class
        -Create a map for each student
        -Create a list to store all student maps
        -If gender of Student is Female,generate an email for her using her lastName>>> star@gmail.com print it out
         */

        HashMap<String, String> student1 = new HashMap<>();
        HashMap<String, String> student2 = new HashMap<>();
        HashMap<String, String> student3 = new HashMap<>();
        HashMap<String, String> student4 = new HashMap<>();

        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");

        student2.put("FirstName", "Jermiah");
        student2.put("LastName", "Michelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "High Park");

        student3.put("FirstName", "Micheal");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        List<HashMap<String, String>> listOfStudent = new ArrayList<>();

        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        System.out.println(listOfStudent);

        for (HashMap<String, String> student : listOfStudent) {
            if (student.get("Gender").equalsIgnoreCase("F")) {
                System.out.println(student.get("LastName").concat("_f@gmail.com"));
            }
        }

        //entrySet() -->
        student4.entrySet();
        Set<Map.Entry<String, String>> pairs = student4.entrySet();
        System.out.println(pairs);

        /*
        create a method  which will take list of map this method will check if the age of student is less than 30
        it will store and return city of those students in a set

         */


    }

    public static List<String> cityFinder(List<HashMap<String, String>> list) {

        List<String> cities = new ArrayList<>();
        for (Map<String, String> studentMap : list) {


            if (Integer.parseInt(studentMap.get("Age")) < 30) {

                cities.add(studentMap.get("City"));


            }
        }
        return cities;


    }
}
