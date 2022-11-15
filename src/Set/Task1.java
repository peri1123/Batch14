package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    /*
     Character arrayP[]={'a','b','r','b', 'a','d'};
     create a method that will take given Character array as parameter
     -this method will store elements to a set collection
     -this method should return the with all unique elements

     */
    public static Set convertSet(Character [] array){
        Set <Character> set=new LinkedHashSet<>();
        for (Character ch:array) {
            set.add(ch);
            System.out.println(set);

        }
        return set;
    }

    public static void main(String[] args) {
        Character arrayP[]={'a','b','r','b', 'a','d'};
        System.out.println(convertSet(arrayP));
    }

}
