package Map;

import java.util.HashMap;
import java.util.Map;

public class TaskStringArrayCountLetter {


//     public static HashMap <String,Integer> arrayCounter(String[] array) {
//         HashMap<String, Integer> map = new HashMap<>();
//         for (String str : array) {
//             if (map.containsKey(str)) {
//                 map.put(str, map.get(str) + 1);
//             } else {
//                 map.put(str, 1);
//             }
//
//         } return map;
//     }

    public static void main(String[] args) {

        String [] arr={"blue", "red", "green", "blue", "yellow", "orange", "mavi"};
//        Map<String, Integer> map=new HashMap<>();
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if(!map.containsKey(arr[i])){
//                map.put(arr[i],1);
//        }else {
//                map.put(arr[i], map.get(arr[i])+1);
//            }
//            System.out.println(map);
//
//        }

        System.out.println(    mapCounter(arr));

    }

    public static Map<String, Integer> mapCounter(String [] arr){
        Map<String, Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else {
                map.put(arr[i], map.get(arr[i])+1);
            }
           // System.out.println(map);

        }
return map;
    }


   }












