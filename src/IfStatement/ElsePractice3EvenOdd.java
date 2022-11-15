package IfStatement;

import java.util.Scanner;

public class ElsePractice3EvenOdd {
    public static void main(String[] args) {
        /*
        ask user to give an integer value
        - find out if given number is "odd" number or even number
        even number --> any number divisable by 2

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please put value");
        int number=input.nextInt();

        if(number % 2==0)//ostatok doljen byt raven k 0
            System.out.println("Your number is Even " + number);
        //if you are putting multiple codes when there is no {} else will not work, since it will not know where to belong
        else// if there is {} we can put multi codes and else will work
            System.out.println(("Your number is an ODD" +number));






    }

}
