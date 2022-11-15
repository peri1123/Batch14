package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list= new ArrayList<>();
        ArrayList <Integer> list2= new ArrayList();
        ArrayList<String>list3 = new ArrayList<String>();
        System.out.println(list2);
        list2.add(10);//0
        System.out.println(list2);//value is 10
        list2.add(20);
        list2.add(2);
        list2.add(23);
        list2.add(7);
        System.out.println(list2);//[10, 20, 2, 23, 7]

        list2.add(0, 99);
        System.out.println(list2);//[99, 10, 20, 2, 23, 7] changed  on the index 0 to 99 which means adding to the size




    }
}
