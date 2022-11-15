package IfStatement;

import java.util.Scanner;

public class NestedIFStatement {

    public static void main(String[] args) {
        /*if()--else if--else
        Scanner in = new Scanner(System.in);
        System.out.println("Do you have passport?");
        String passportanswer = in.nextLine();
        if (passportanswer.equalsIgnoreCase("yes")) {
            System.out.println("Do you have visa?");
            String visaanswer = in.nextLine();
            if (visaanswer.equalsIgnoreCase("yes")){
                System.out.println("Do you have insurance?");
               String insuranceAnswer= in.nextLine();
               if (insuranceAnswer.equalsIgnoreCase("yes")){
                   System.out.println("Congrats! Safe Flight!");
               }
            }else{
                System.out.println("Sorry, you need visa");
            }
        }else {
            System.out.println("Sorry, you need passport");
        }

         */



                int limitIn = 70, limitOther = 55;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your car's speed");
                int carSpeed = scanner.nextInt();
                System.out.println("Please enter name of State? IN/Other");
                scanner.nextLine();
                String state = scanner.nextLine();
                if (carSpeed > 0) {
                    if (carSpeed > limitIn + (limitIn * 0.10) && state.equalsIgnoreCase("IN")) {
                        System.out.println("150$ and 5 points");
                    } else if (carSpeed > limitIn && carSpeed <= limitIn + (limitIn * 0.10) && state.equalsIgnoreCase("IN")) {
                        System.out.println("YELLOW WARNING");
                    } else if (state.equalsIgnoreCase("IN")){
                        System.out.println("You are driving safe!");
                    }
                    if (carSpeed > limitOther + (limitOther * 0.10) && !state.equalsIgnoreCase("IN")) {
                        System.out.println("100 and 10 points");
                    } else if (carSpeed > limitOther && carSpeed <= limitOther + (limitOther * 0.10) && !state.equalsIgnoreCase("IN")) {
                        System.out.println("CITATION");
                    } else if(!state.equalsIgnoreCase("IN")) {
                        System.out.println("You are driving safe! ****");
                    }
                } else {
                    System.out.println("Car is not even moving");
                }
            }
        }


