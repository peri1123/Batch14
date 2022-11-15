package Set;

import java.util.*;

public class Practice2TreeSetMethods {
    public static void main(String[] args) {
        /*
        HashSet -- no order, yes for null
        LinkedHashSet-- insertion order, yes for null
        TreeSet -ascending order, no for null
         */
        HashSet hashSet= new HashSet();
        LinkedHashSet <String> linkedHashSet=new LinkedHashSet<>();
        TreeSet<String> treeSet= new TreeSet<>();
        hashSet.add("David");        linkedHashSet.add("David");          treeSet.add("David");
        hashSet.add("Alex");         linkedHashSet.add("Alex");           treeSet.add("Alex");
        hashSet.add("Nuradil");      linkedHashSet.add("Nuradil");        treeSet.add("Nuradil");
        hashSet.add("Aizat");        linkedHashSet.add("Aizat");          treeSet.add("Aizat");
        System.out.println(hashSet); System.out.println(linkedHashSet);   System.out.println(treeSet);
        //[Nuradil, Aizat, Alex, DAvid]   [David, Alex, Nuradil, Aizat]   [Aizat,Alex, David, Nuradil]


        System.out.println("TreeSet methods");
        //first();
        String name1=treeSet.first();
        System.out.println(name1);//Aizat

        //last();
        System.out.println(treeSet.last());//Nuradil

        //pollFirst();
        treeSet.pollFirst();
        System.out.println(treeSet);//[Alex, David, Nuradil] Aizat is gone

        //pollLast();
        String str2=treeSet.pollLast();
        System.out.println(treeSet);//
        System.out.println(str2);

        System.out.println(treeSet.descendingSet());

        NavigableSet<String> reverseedSet =treeSet.descendingSet();
        System.out.println(reverseedSet);
        //1,2,3,4,5>>> 5,4,3,2,1


        treeSet.add(null);
        System.out.println(treeSet);






    }
}
