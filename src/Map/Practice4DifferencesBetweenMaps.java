package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice4DifferencesBetweenMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map1=new HashMap<>();
        LinkedHashMap<String, Integer> map2=new LinkedHashMap<>();
        TreeMap<String, Integer> map3=new TreeMap<>();
        map1.put("IL", 2);
        map1.put("OH", 5);
        map1.put("WI", 6);
        map1.put("IN", 1);
        map2.put(null,55);
        System.out.println("NO order HASHMAP"+map1);
        map1.put("FL", null);
        map1.put("WA", null);
        System.out.println("Map1>>>" +map1);
        System.out.println("LinkedHashMap");


        map2.put("IL", 2);
        map2.put("OH", 5);
        map2.put("WI", 6);
        map2.put("IN", 1);
        //map2.put(null,55);
        System.out.println("Insertion order  map2 means LinkedHashMap>>>>" + map2);
        map2.put("FL", null);
        map2.put("WA", null);
        System.out.println("MAP2"+map2);

        System.out.println("TreeMap");

        map3.put("IL", 2);
        map3.put("OH", 5);
        map3.put("WI", 6);
        map3.put("IN", 1);
       // map3.put(null,55);
       System.out.println("Ascending order map3>>>>" + map3);
       map3.put("FL", null);
        map3.put("WA", null);
        System.out.println("Map3>>>" +map3);
    }
}
