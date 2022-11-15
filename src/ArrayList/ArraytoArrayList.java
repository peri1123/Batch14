package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {
    public static void main(String[] args) {
        String [] fruits= {"apple", "cherry", "orange", "dragon fruit"};
        Arrays.asList(fruits);
        List<String> fruitlist= Arrays.asList(fruits);
        System.out.println(fruitlist);


        // you can not add or remove element from the list that you converted from  ARRAY
        //fruitlist.add("Watermelon");//UnsupportedOperationException
        System.out.println(fruitlist);

       // fruitlist.remove("apple");//UnsupportedOperationException
        System.out.println(fruitlist);

        fruitlist.set(0,"KIWI");
        System.out.println(fruitlist);//before>>> [apple, cherry, orange, dragon fruit]  after >>>>[KIWI, cherry, orange, dragon fruit]
    }
}
