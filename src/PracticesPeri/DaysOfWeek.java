package PracticesPeri;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String []args){
        /*Use scanner to get a number between 1 and 7
        1-> print "Monday"
        2-> print Tuesday
        3-> print "Wednesday

         */

        System.out.println("Please enter a number between 1 and 7");
        Scanner in=new Scanner(System.in);
         int number= in.nextInt();
         if(number==1) {
             System.out.println("#1 is Monday");
         }
         if (number==2){
             System.out.println("#2 is Tuesday");
         }
        if (number==3){
            System.out.println("#3 is Weds");
        }
        if(number==4) {
            System.out.println("#4 is Thursday");
        }
        if (number==2){
            System.out.println("#5 is Friday");
        }
        if (number==3){
            System.out.println("#6 is Saturday");
        }
        if (number==7){
            System.out.println("#7 is Sunday");
        }
        if (number<1 || number>7){
            System.out.println("Invalid");
        }


    }
}
