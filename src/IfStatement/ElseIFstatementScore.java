package IfStatement;

import java.util.Scanner;

public class ElseIFstatementScore {
    public static void main(String[] args) {
        /*
        90-100--> Grade A
        80-89--> Grade B
        70-79 --> C
        60-69--> D
        0-59--> Repeating
        Scanner scanner=new Scanner (System.in);
        System.out.println("What is your scare from the test?");

        int score= scanner.nextInt();

        if(score>=90 && score<=100){
            System.out.println("Your letter grade is A");
        } else if (score>=80 && score<90) {
            System.out.println("Your letter grade is B");
        } else if (score<=79 &&score>=70) {
            System.out.println("Your letter grade is C");

        } else if (score>=60 &&score<=69) {
            System.out.println("Your letter grade is D");
        } else{//200 falls to else and else shows failing
            //else if (score>=0 && score<=59){
            System.out.println("Failing");

        }

         */
        /*90-100--> Grade A
        80-89--> Grade B
        70-79 --> C
        60-69--> D
        0-59--> Repeating

         */
        Scanner input=new Scanner(System.in);
        System.out.println("What is your score test?");
        int score= input.nextInt();
        if (score>=90 && score<=100 ){
            System.out.println("You grade is A");
        } else if (score>80 && score<90) {
            System.out.println("Your grade is B");
        } else if (score>=70 && score<80) {
            System.out.println("Your grade is C");
        } else if (score>=60 && score<69) {
            System.out.println("Your grade is D");
        } else if (score>=0 && score<=59){
            System.out.println("Failing");
        }else {
            System.out.println("Please try again");

        }


    }

    }

