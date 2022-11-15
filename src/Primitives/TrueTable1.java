package Primitives;

public class TrueTable1 {
    public static void main(String[] args) {
        /*
        you want to start a master programm
        OR
        language score--> 80 or more
        gpa --->3.6 or more
         */

        boolean language=true, gpa=true;
        boolean masterprogram=language;
        System.out.println("will I start:"+masterprogram);

        double mygpa=4, language1=80, gpa1=3.6, myscore=60;
       boolean program= mygpa>=gpa1 || myscore>=language1;
        System.out.println(program);

        /*
        to be able to pass a class
        average of your three test scores should be greater or egual to the 60%
        and your average attendance should be 90% or more
         */

        int test1=100, test2=60, test3=90, myattendance=100, requredscore=60, reiredattendance=90;
        boolean pass= (test1+test2+test3)/3>=requredscore && reiredattendance>= reiredattendance;
        System.out.println("Passing the class? -->" + pass);//supposed to be true





    }
}
