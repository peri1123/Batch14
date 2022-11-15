package IfStatement;

import java.util.Scanner;

public class NestedIF2TaskChicago {
    public static void main(String[] args) {
        /* Ask user for their city name
        -Chicago
         Ask for scool name
          -techtorial--> you are lucky - you have efe bow
          if school is not techtorial-->tell them visit us

          -if the city name is not chicago
          tell user to come to chicago and ask for techtorial

         */
        System.out.println("What is your city name?");
        Scanner input=new Scanner(System.in);
        String city=input.nextLine();
        if (city.equalsIgnoreCase("chicago")){
            System.out.println("What is your school name?");
            String schoolname=input.nextLine();
            if (schoolname.equalsIgnoreCase("Techtorial")) {
                System.out.println("You are lucky");
            }else{
                System.out.println("Visit Techtorial");
            }
        } else {
            System.out.println("Visit Chicago and us");
        }













        /*if (city.equalsIgnoreCase("chicago")){
            System.out.println("What is your school name?");
            String school= input.nextLine();
            if (school.equalsIgnoreCase("techtorial")){
                System.out.println("You are lucky");
            }else{
                System.out.println("Visit techotorial");
            }else {
                System.out.println("Visit Chicago and us");

         */


            }

        }









