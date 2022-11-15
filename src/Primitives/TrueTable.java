package Primitives;

public class TrueTable {
    public static void main(String[] args) {
        /*
        &&
        T-T=>T
        T-F=>F
        F-T=>F
        F-F=>F

       ||
       T-T=>T
       T-F=>T
       F-F=>F
       F-F=>F

         */

        int chairLeg=4, tableLeg=4;
        boolean dinner= chairLeg==4&&tableLeg==4;
        System.out.println(dinner);

        //represent  the situation for visa and ticket;
        boolean visa=true, ticket=true;
        boolean travel=visa&&ticket;
        System.out.println("can i travel: " +travel);

        int moneylimit=1000;
        int mymoney=5000;

        boolean condition=visa && ticket && (mymoney>=moneylimit);
        System.out.println(condition);




    }
}
