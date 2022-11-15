package Tasks;

import OOP.Phone;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BrandCounterMap {
    public static void main(String[] args) {
//        String str2="I love java";
//        String whiteSpace=str2.replaceAll(" ","");
//        char[] ch=whiteSpace.toCharArray();
//        Map <Character,Integer> mapCounter=new HashMap<>();
//        for(char c:ch){
//            if(!mapCounter.containsKey(c)){
//                mapCounter.put(c,1);
//            }else {
//                mapCounter.put(c,mapCounter.get(c)+1);
//            }
//        }System.out.println(mapCounter);


//        String string=" Heaven must be beautiful ";
//        Map<Character,Integer> mapCounter2=new TreeMap<>();
//        for (int i=0; i<string.length(); i++){
//            if(string.charAt(i)==' '){
//                continue;
//            }
//            if(!mapCounter2.containsKey(string.charAt(i))){
//                mapCounter2.put(string.charAt(i),1);
//            }else {
//                mapCounter2.put(string.charAt(i), mapCounter2.get(string.charAt(i))+1);
//            }
//
//        }System.out.println(mapCounter2);


//        String str = "Hello World";
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < str.length()-1; i++) {
//            if (str.charAt(i) == ' ') {
//                continue;
//            }
//            if (!map.containsKey(str)) {
//                map.put(str.charAt(i), 1);
//            } else {
//                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//            }
//            System.out.println(map);
//
//
//        }
//
//        String str1="I am Happy";
//        Map<Character,Integer> mapCounter=new LinkedHashMap<>();
//
//        for(int i=0; i<=str1.length()-1; i++) {
//            if(str1.charAt(i)==' '){
//                continue;
//            }
//
//            if(!mapCounter.containsKey(str1.charAt(i))){
//               mapCounter.put(str1.charAt(i), 1);
//            }else {
//                mapCounter.put(str1.charAt(i), mapCounter.get(str1.charAt(i))+1);
//            }
//        }
//        System.out.println(mapCounter);
//        System.out.println(mapCounter.hashCode());
//
////
//        String[] array={"b","a", "a", "c", "i", "i", "m"};
//        Map<String, Integer> map=new TreeMap<>();
//        for (int i=0; i<array.length; i++ ){
//            if(!map.containsKey(array[i])){
//                map.put(array[i], 1);
//            }else {
//                map.put(array[i], map.get(array[i])+1);
//            }
//            System.out.println(map);
//        }


        int a=5;
        for(int i=0; i<a; i++ ){
           for (int j=0; j<a; j++){
               System.out.print("*");
           }
            System.out.println();
        }

    }
    }


