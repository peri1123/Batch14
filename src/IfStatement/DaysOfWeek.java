package IfStatement;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        /*
        Use scanner to get a number between 1 and 7
        1-> print "Monday"
        2-> print Tuesday
        3-> print "Wednesday
        .....


         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number between 1 to 7");
         int number=input.nextInt();
         if (number==1) {// don't put ;, it will act as not if statement
             System.out.println("Monday");
         }

             if (number==2){
                 System.out.println("Tuesady");
             }

             if (number==3){
                 System.out.println("Wednesday");

             }
             if (number==4){
                 System.out.println("Thursday");

             }
             if (number==5) {
                 System.out.println("Friday");
             }
             if (number==6){
                 System.out.println("Saturday");

             }

        if (number==7){
            System.out.println("Sunday");

        }
        //if it is out of 1 to 7 // you are either on my on side or left side
        if (number<1 || number>7){
            System.out.println("Invalid entry");
        }





         }
    }



