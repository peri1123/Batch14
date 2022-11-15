package Loops;

import java.util.Scanner;

public class WhilePractice7Sum {
    public static void main(String[] args) {


    /*
    get two integer numbers from user
    -make sure user giving second number greater than the first one

    find and show sum/total of the numbers between those two numbers

    ex: 10  15--> 10+11+12+13+14+15="sum is 75"
     */

        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the 1 st number");
        int answer1=scanner.nextInt();
        System.out.println("Enter the 2nd number which is the greater than your first number");
        int answer2=scanner.nextInt();
        int total=0;//
        while (answer1<=answer2){//10<=15

            System.out.println(answer1 + "+");
            total += answer1;//0=0+10;
            answer1++;//11
            System.out.println("Total is:" +total);
        }
*/
      /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number1= scanner.nextInt();
        System.out.println("Enter greater than first number");
        int number2= scanner.nextInt();
        int total=0;
        while (number1<=number2){
            System.out.println(number1);
            total+=number1;
            number1++;
            System.out.println("The total is"+ total);
        }

       */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int answer1= scanner.nextInt();
        System.out.println("Please enter a second number which is the greater than first one");
        int answer2= scanner.nextInt();
        int total=0;

        while (answer1<=answer2){
            System.out.println(answer1);
            total+=answer1;
            answer1++;
            System.out.println("My total is :" + total);
        }




    }
    }


