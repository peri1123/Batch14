package Loops;

import java.util.Scanner;

public class WhilePractice5Multipication {
    public static void main(String[] args) {
        /*
        Ask user to give a positive integer number for the given number
        create a multipication table
        userEntry 3
         */
        Scanner in=new Scanner(System.in);
        System.out.println("Please enetr an positive integer value");
        int number= in.nextInt();
        int number2=1;
        while (number2<=10){

                System.out.println(number + "*" + number2+ "="+ number*number2);
        number2++;

    }
}}

