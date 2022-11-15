package RecapWithAhmet;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    /*
    Possible Interview Question:
    1- What is the difference between Array and List?//ArrayList and Array
    Array:                                                ArrayList:
    -fixed sized                                         -has dynamic size
    -has multidimetional form                             -it doesn't
    -store both primitive and object                     -only objects
    -Arrays (itself)don't have methods                   -it does have methods ()add,replace
    -syntax different(creation String[] name={"ahmet"}); -syntax is different(ArrayList<String> list new ArrayList)
                           String[] name1=new String[1]   -ArrayList<String> list1= Arrays.asList("Ahmet");
                                                          list1.add("Ahmet")

     2-What is the difference between ArrayList and LinkedList?
     tbh I do not use LinkedList in my project but as much as I know there is an execution time difference.
     ->The reaching out the elements inside of the list is more efficient and faster in ArrayList.
     ->When you do any manipulation (changing, replacing...) at this moment LinkedList will be faster.

     {1,2,4,5,6,7,} big shifting
     list.add(2)=3
     // it will affect to the

     NOTE:Common points for arraylist and linkedList:
     -->Both of them are indexing


     */
    public static void main(String[] args) {
        ArrayList number2=new ArrayList<>();
        number2.add(1);
        number2.add(4);
        System.out.println(number2);
        for (Object num:number2
             ) {
            System.out.println(num);

        }
        ArrayList names=new ArrayList<>();
        names.add("owl");
        names.add("Peri");
        names.add("Suzi");
        System.out.println(names);

        for (Object str:names
             ) {
            System.out.println();

        }





    }

}
