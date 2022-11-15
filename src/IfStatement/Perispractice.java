package IfStatement;

import PracticeNotes.ScannerDay9;

import java.util.Scanner;

public class Perispractice {
    public static void main(String[] args) {

        int apples = 15, bananas = 12, fruits = 30;
        if (apples >= bananas) {
            System.out.println("Are bananas less than apples?");
            System.out.println("B;lfjgrjkdgzfkdsfb");
        }
        System.out.println("Hello World");

        String name = "purple";
        if (name.equals("purple")) {
            System.out.println(name);


        }
        System.out.println("If with string");

        String language="Java";
        if (!language.equals("Java")){
            System.out.println("Java is Best Programming language");
        }



        System.out.println("Task1");
        /*ask user to give first letter of the day
        when letter is m--> "It should be Monday"
        t--> "It should be Tuesday or Thursday"*/

        String monday="Monday";
        System.out.println("Please enter first letter of the day");
        Scanner day=new Scanner(System.in);
        String result=day.nextLine();

        if(result.equalsIgnoreCase("m")){
            System.out.println("It should be Monday");

        }

        System.out.println("Please enter first letter of the day");
        Scanner scanner1=new Scanner (System.in);
        String firstletter=scanner1.nextLine();
        if(firstletter.equalsIgnoreCase("m")){
            System.out.println("It is not supposed to show Monday only");
        }
        Scanner tuesday=new Scanner(System.in);
        System.out.println("Please enter first letter of the day");
        String tuesdayormonday=tuesday.nextLine();

        if(tuesdayormonday.equals("T")){
            System.out.println("If it is not Monday, it should be Tuesday");

            System.out.println("If you put W");
            char weds=tuesday.nextLine().charAt(0);
                    if(weds=='W' || weds=='w' ){
                        System.out.println("It should show Wednesday");
                    }

        }



    }
}