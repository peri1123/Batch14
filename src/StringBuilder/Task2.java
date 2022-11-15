package StringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    /*
    create a method
    pass parameter as StringBuilder Array
    the method will replace middle char Strings $ if the strings object have odd length
    return list of Objects for those elements(revised)
    {"monday", "Tuesday","Friday"}
     */

//    public static List<StringBuilder> replaceMidChar(StringBuilder[] listBuilders ){
//        List<StringBuilder> list=new ArrayList<>();
//
//        for(StringBuilder builder:listBuilders){
//            if(builder.length()%2!=0 ){
//                list.add(builder.replace((builder.length()-1)/2, (builder.length()-1)/2+1,  "$"));
//            }
//
//        }
//
//
//        return list;
//    }
//
//    public static void main(String[] args) {
//        StringBuilder[]brands =new StringBuilder[3];
//        StringBuilder b1=new StringBuilder("Monday");
//        StringBuilder b2=new StringBuilder("Tuesday");
//        StringBuilder b3=new StringBuilder("Friday");
//        brands[0]=b1;
//        brands[1]=b2;
//        brands[2]=b3;
//
//        System.out.println(replaceMidChar(brands));
//
//
//    }

    /*
       create a method
       pass parameter as StringBuilder Array
       the method will replace middle char Strings $ if the strings object have odd length
       return list of Objects for those elements(revised)
       {"monday", "Tuesday","Friday"}
        */
    public static List<StringBuilder> replacer(StringBuilder[] array) {
        List<StringBuilder> list = new ArrayList<>();
        for (StringBuilder b1 : array) {
            if (b1.length() % 2 == 0) {


            }
        }
        return list;
    }
}


