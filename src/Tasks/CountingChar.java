package Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountingChar {
    public static void main(String[] args) {
        String string = " I know everything ";
        Map<Character, Integer> mapCounter2 = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                continue;
            }
            if (!mapCounter2.containsKey(string.charAt(i))) {
                mapCounter2.put(string.charAt(i), 1);
            } else {
                mapCounter2.put(string.charAt(i), mapCounter2.get(string.charAt(i)) + 1);
            }

        }
        System.out.println(mapCounter2);





        String str1="I know everythingggggg";
        char[] c=str1.toCharArray();
        Map<Character, Integer> counter=new HashMap<>();


        for (int i=0; i<c.length; i++){
            if(counter.containsKey(c[i])){
                counter.put(c[i],counter.get(c[i])+1);
            }else{
                counter.put(c[i], 1);
            }
            System.out.println(counter);
        }
    }




}
