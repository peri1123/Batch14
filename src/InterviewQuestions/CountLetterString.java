package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountLetterString {
    public static void main(String[]args){
//        String str="I love Java";
//        str=str.replace(" ","");
//        char[] c=str.toCharArray();
//        Map <Character,Integer>map = new HashMap<>();
//        for (char ch:c) {
//            if(!map.containsKey(ch)){
//                map.put(ch,1);
//            }else {
//                map.put(ch,map.get(ch)+1);
//            }
//        }//System.out.println(map);


        String str1="llloklllieashh";
        Map <Character, Integer> map2=new TreeMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if(!map2.containsKey(str1.charAt(i))){
                map2.put(str1.charAt(i), 1);
            }else{
                map2.put(str1.charAt(i), map2.get(str1.charAt(i))+1);
            }
        } System.out.println(map2);

    }




}
