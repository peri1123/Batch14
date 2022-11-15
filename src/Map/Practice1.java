package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice1 {
    public static void main(String[] args) {
        HashMap <String,String> map = new HashMap<>();

        Map<String,String> map1 = new HashMap<>();

        map.put("Name","Bektur");
        map.put("LastName","Nuranov");
        map.put("City","Chicago");

        System.out.println(map);

        // get ();
        System.out.println(map.get("Name"));

//        String valueForName=map.get("Name");
//        System.out.println(valueForName);

        //same key different value
        map.put("Name","David");
        System.out.println(map);


        //different key, same value, values can be duplicated
        map.put("Has Pet", "David");
        System.out.println(map);//{Has Pet=David, LastName=Nuranov, City=Chicago, Name=David}

//        //ONLY 1 key NULL is allowed
//        map.put(null, "Something");
//        System.out.println(map);
//
//        //null value ---> multiple null values are accepted!
//        map.put("state",null);
//        System.out.println(map);
//
//        map.put("phone",null);
//        System.out.println(map);
        LinkedHashMap<String,String> map4=new LinkedHashMap<>();

        System.out.println("+++++++++");

        map4.put(null, "ball");
        System.out.println("Owl"+map4);

        map4.put("Owl","Null");
        System.out.println(map4);

        map4.put(null, "globe");
        System.out.println("The correct"+map4);

        map4.put("pen", "null");

        map4.put(null,"hwll0");
        map4.put(null,"skdhc");
        System.out.println(map4);


        map4.put("key","jshhj");
        map4.put("null","kjk");
        map4.put("null","khkj");
        System.out.println(map4);




    }

}

