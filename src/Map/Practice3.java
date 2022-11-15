package Map;

import java.util.*;


public class Practice3 {
    public static void main(String[] args) {
        HashMap<Integer,String> studentInfo= new HashMap<>();
        studentInfo.put(501,"Adilet");
        studentInfo.put(583, "Alex;");
        studentInfo.put(609,"Mary");
        studentInfo.put(895,"Aizat");
        studentInfo.put(111,"Asel");

        //replace();
        studentInfo.replace(501, "Kuba");
        System.out.println(studentInfo);

       studentInfo.replace(501, "Kuba", "good for you");
        System.out.println(studentInfo);

        //containsKey()
        boolean b1=studentInfo.containsKey("501");//false

        System.out.println(b1);

        boolean b2=studentInfo.containsKey(501);//true
        System.out.println(b2);

        System.out.println(studentInfo.containsKey(Integer.parseInt("501")));//true

        //containsValue(); if it is not matching false, if it is match true
        System.out.println( studentInfo.containsValue("good for you"));//true
        System.out.println(studentInfo.containsValue( "abc"));//false

        //values()-- returns all values as Collection
        System.out.println( studentInfo.values());

        Collection valuesFromTheStudentMap =studentInfo.values();

        // print values one at a time from above collection

        for (Object value: valuesFromTheStudentMap) {
            System.out.println(value.toString().toUpperCase());

        }

        printValues(studentInfo);


        //size();
        System.out.println(studentInfo.size());

        //isEmpty();
        System.out.println(studentInfo.isEmpty());

        //clear();
       // studentInfo.clear();
      //  System.out.println(studentInfo.isEmpty());
        values(studentInfo);

        System.out.println("+++++++++++++++++");

        //entrySet() it will return all the keys and values
        System.out.println(studentInfo.entrySet());
        Set <Map.Entry<Integer, String>> pairs =studentInfo.entrySet();
        for (Map.Entry<Integer, String> pair:pairs){
            System.out.println(pair);
        }


    }

    //create a method that will take a HashMap as a parameter, it will print  all values one by one, by using values method call

    public static void printValues (HashMap<Integer, String> map){//

        for (String value: map.values()) {
            System.out.println(value.toUpperCase().concat("from the method coming"));
        }

        }
    public static void values(HashMap <Integer, String> map){
        for (String name: map.values()){
            System.out.println("from method calling " +name);

        }


    }


    }

