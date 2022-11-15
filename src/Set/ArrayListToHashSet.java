package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListToHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(57);
        list.add(23);
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(6);

        System.out.println(list);//[5, 6, 57, 23, 10, 5, 6]

        HashSet<Integer> set=new HashSet<>(list);
        System.out.println(set); //if you want to get rid of duplicates use set

        set.add(66);
        System.out.println(set);//[66, 5, 6, 23, 57, 10]

        // write a java code to show/ find/figure out duplicate elements in the arrayList by using the set

        //store repeating elements in to another list
        ArrayList duplicates=new ArrayList<>();
        HashSet <Integer> set2=new HashSet<>();

        for(Integer num:list){
            if(!set2.add(num)){
                duplicates.add(num);
                System.out.println("Duplicates which is set is not adding>>"+num);
            }else {
                System.out.println("numbers in set"+num);
            }

        }

        System.out.println(duplicates);






    }
}
