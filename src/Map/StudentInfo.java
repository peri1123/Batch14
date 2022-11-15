package Map;

import java.util.*;

public class StudentInfo {
     /*
        -StudentInfo Class
        -Create a map for each student
        -Create a list to store all student maps
        -If gender of Student is Female,generate an email for her using her lastName>>> _star@gmail.com print it out
         */
     public static void main(String[] args) {


         Map<String, String> student1 = new LinkedHashMap<>();
         Map<String, String> student2 = new LinkedHashMap<>();
         Map<String, String> student3 = new LinkedHashMap<>();
         Map<String, String> student4 = new LinkedHashMap<>();

         student1.put("First Name", "Jeremiah");
         student1.put("Last Name", "Michelson");
         student1.put("Age","15");
         student1.put("Gender", "f");
         student1.put("City", "High Park");

         student2.put("First Name", "Mike");
         student2.put("Last Name", "White");
         student2.put("Age","35");
         student2.put("Gender", "M");
         student2.put("City", "Winnetka");

         student3.put("First Name", "Sara");
         student3.put("Last Name", "Star");
         student3.put("Age","29");
         student3.put("Gender", "f");
         student3.put("City", "Chicago");

         student4.put("First Name", "David");
         student4.put("Last Name", "We");
         student4.put("Age","25");
         student4.put("Gender", "M");
         student4.put("City", "SF");

         List <Map<String, String>>list=new ArrayList<>();
         list.add(student1);
         list.add(student2);
         list.add(student3);
         list.add(student4);
         System.out.println(list);

         for (Map<String, String> students:list
              ) {
             if(students.get("Gender").equalsIgnoreCase("f")){
                 System.out.println(students.get("Last Name").concat("_star@gmail.com"));
             }
         }

         Set<Map.Entry<String, String>> newS= student1.entrySet();
        // System.out.println(student1.entrySet());

         cityOfyoung(list);
         System.out.println(  cityOfyoung(list));
     }

     public static List<String>cityOfyoung( List <Map<String, String>>list) {

         List<String> newList=new ArrayList<>();
         for (Map students:list) {

                     if( Integer.parseInt((String) students.get("Age"))<30){
                         newList.add((String) students.get("City"));

         }


     }
         return newList;
     }}





