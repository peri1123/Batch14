package IfStatement;

import java.util.Scanner;

public class IfStatementTaskSpeedLimit {
    public static void main(String[] args) {

       /*

       getting ticket for speed violation
        in state of IN, speed limit on HighWays is 70
        in other states, speed limit on Highways is 55
                -if driver exceeds speed limit for up to 10% of the limit in each state, we will give WARNING in that state
       of IN warning means --> print --> "YELLOW WARNING"

        other state warnings mean --> print --> "CITATION"
                -if driver exceeds speed limit more than 10% of the limit in each state, we will give TICKET in that state
        of IN ticket means --> print --> "150$ and 5 points"
        other state warnings mean --> print --> "100"
                -if speed is more than 0 to speed limit, --> print --> "You are driving safe!"
        */

        int speedIN=70, speedOther=55;
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your speed?");
        int speed=scanner.nextInt();
        System.out.println("What state are you in?");
        String state= scanner.nextLine();
        scanner.nextLine();

        if (speed>0){
            if (speed>speedIN + (speedIN*0.10) && state.equalsIgnoreCase("IN") ){
                System.out.println("150$ and 5 points");
            } else if (speed>speedIN && speed<=speedIN  + (speedIN*0.10) && state.equalsIgnoreCase("IN")) {
                System.out.println("YELLOW WARNING");
            }else{
                System.out.println("You are driving safe!");
            }
            if (speed>speedOther + (speedOther*0.10) && state.equalsIgnoreCase("Other") ){
                System.out.println("100$ and 10 points");
            } else if (speed<speedOther && state.equalsIgnoreCase("OTHER")) {
                System.out.println("YOU ARE GETTING CITATION");
            }else if (!state.equalsIgnoreCase("IN")){
                System.out.println("You are driving safe!");
            }

        }else{
            System.out.println("You car is not even moving");
        }







    }
}

