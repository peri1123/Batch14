package IfStatement;

import java.util.Scanner;

public class NestedIFTaskaboutJava {
    public static void main(String[] args) {
//java-selenium-API-SQL --> Congrats!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Do you know JAVA?");
        String java = scanner.nextLine();
        if (java.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium or Cypress?");
            String selenium = scanner.nextLine();
            if (selenium.equalsIgnoreCase("selenuim") || selenium.equalsIgnoreCase("Cypress")) {
                System.out.println("We are very pleased to hear about it..");
                System.out.println("Do you know API testing?");
                String API = scanner.nextLine();
                if (API.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL?");
                    String sql = scanner.nextLine();
                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("CONGRATS! You are HIRED!!");
                    } else {
                        System.out.println("We need someone who knows SQL");
                    }
                } else {
                    System.out.println("We need someone who knows API");
                }
            } else {
                System.out.println("We need someone who knows Selenium");
            }
        } else {
            System.out.println("We need someone who knows Coding Language");
        }
        System.out.println("that was nice to meet with you");











        /*Java--
        Selenium-->
                API-->
                SQL -->
                --Hired----
        System.out.println("Do you know Java?");
        Scanner input = new Scanner(System.in);
        String java = input.nextLine();
       if (java.equalsIgnoreCase("yes")){
           System.out.println("Good, do you know selenuim?");
           String selenuim=input.nextLine();
           if(selenuim.equalsIgnoreCase("yes")){
               System.out.println("Awesome, do you know API?");
               String api= input.nextLine();
               if (api.equalsIgnoreCase("yes")){
                   System.out.println("Happy to hear that, do you know SQL?");
                   String sql= input.nextLine();
                   if (sql.equalsIgnoreCase("yes")){
                       System.out.println("Congratulations!");
                   }
               }else{
                   System.out.println("Sorry, we ned api");

               }

           }else{
               System.out.println("Sorry we are looking for someone who knos Selenuim");
           }



       }else{
           System.out.println("Sorry we need someone who knows java");

       }

        System.out.println("It was nice to meet you!");

         */

    }

}