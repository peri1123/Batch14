package Loops;

import java.util.Scanner;

public class WhilePractice4Divisors {
    public static void main(String[] args) {
        /*
        ask user give an integer number
        find and print out divisors of the given number
        -->6 divisors of --> 1,2,3,6
        ->10 divisors of --> 1,2,5,10
         */

        Scanner input=new Scanner(System.in);
        System.out.println("please enter an positive integer value");
        int number= input.nextInt();
        int num=1;

        while (num <= number) {
            if (number%num==0){
                System.out.println(num);
            }
            num++;
    }


    }

}