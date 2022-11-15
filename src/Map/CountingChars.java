package Map;

import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {

        String s="I am happyyyyy";
        s=s.replace(" ","");
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
           if(map.containsKey(s.charAt(i))){
              int number= map.get(s.charAt(i));
              map.put(s.charAt(i),number+1);
           }else{
               map.put(s.charAt(i), 1);
           }
        }System.out.println(map);








    }
}
