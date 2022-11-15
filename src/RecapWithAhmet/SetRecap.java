package RecapWithAhmet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetRecap {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-How can you make the element unique with collection?(American Style)
    1-What is set? What is the purpose of using it?(Indian Style)
    *In my project, I was using set to make the elements unique to prevent duplications which causes some problems
    later on
    ->It is a way to store the unique elements only.

    2-Can you tell me the types of Collections?
    -List-->ArrayList and LinkedList
    Set->HashSet, LinkedHashSet, TreeSet
    -->Queue-->We did not use this type in this project, so I am not familiar with  it
    --I am quick learner, I can learn really fast.


    3-Can you explain teh difference between SET AND LIST?
    Set:                                               LIST:
    -Only unique elements                        -It can store duplicate elements
    -It does not have indexing                   -It has indexing
    (when you need to access the elements  you need to use the loop)
    -Syntax is different (Set set=newHashSet())   -Syntax is different (List list=newArrayList)


    NOTE: Collections  are the way of storing the objects with a different functions.
    It means it is a kind of storage and has functionality(methods) to manipulate date.
    -->We have three types of collections -->List(we use 99% using arrayList), Set and Queue.

    4-What is the difference between Set Types?
    -->HashSet()-->It stores the element without any orders(random);
    -->LinkedHashSet()-->It stores the element with insertion order (how you put it in the code order)
    -->TreeSet()-->It Stores the element ascending

    NOTE:Whenever you need to reach out the elements from the list, you can simply use get();
    Whenever you need to reach out the elements from set, you need to iterate(loop) then if you need a specific one

     */

    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        for (Object num:list
             ) {
            if (num.equals(2)){
                System.out.println("getting 2");
            }

        }


        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        for(Integer num:set){
            if(num.equals(2)){
                System.out.println(num);
            }

        }



    }
}
