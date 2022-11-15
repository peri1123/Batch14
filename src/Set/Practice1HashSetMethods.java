package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice1HashSetMethods {
    public static void main(String[] args) {
        HashSet set1= new HashSet();
        HashSet<String> set2= new HashSet();
        HashSet<String> set3=new HashSet<>();//HashSet is class

        Set set4=new HashSet();//Set is interface
        Set<String> set5=new HashSet<>();

        set2.add("baseball");//
        set2.add("soccer");
        set2.add("tennis");
        set2.add("table tennis");

        System.out.println(set2);//[soccer, baseball, table tennis, tennis] it comes randomly since HashSet does not keep order

        boolean b1 =set2.contains("tennis");// it will prove you have an element, but it will not allow you use it

        System.out.println("The way to get an element");
        for(String sport:set2){
            // System.out.println(sport);
            if (sport.equals("tennis")){
                System.out.println("you need a racket");
                System.out.println(sport.toUpperCase());

            }
        }

      set2.add("baseball");
        set2.add("baseball");
        System.out.println("Acts like it is adding, but in reality it is not adding "+set2);//[soccer, baseball, table tennis, tennis]

        set2.add("baseball");
        set2.add("baseBALL");
        System.out.println("adding basBALL since it is not the same"+set2);//[soccer, baseball, table tennis, baseBALL, tennis]

        //size() returns size
        System.out.println(set2.size());//5

        //remove()
        set2.remove("baseBALL");
        System.out.println(set2);//[soccer, baseball, table tennis, tennis]


        // remove the sport if it has word 'ball' inside
        System.out.println("before"+ set2);

        //this is not supportable we need to use removeIf();
//        for(String sport: set2){
//            if(sport.contains("ball")){
//            set2.remove(sport);
//            break;
//
//            }
//        }System.out.println("what the heck"+ set2);



        Iterator<String> itereator = set2.iterator();
        System.out.println(set2);
        while (itereator.hasNext()) {// in the codition we are saying while iterator has an element next to it please keep printing
            System.out.println("Getting values with the help Iterator Object>>>" + itereator.next());

            }
        }

    }




