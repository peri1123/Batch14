package IfStatement;

import java.util.Scanner;

public class ElsePractice2 {

    public static void main(String[] args) {
        /*
        when your payment is 100 or more you get 20% discount
        otherwise you get only 5% discount

        ask user how much she spent
        calculate final payment after discount and show it

         */

        Scanner how$=new Scanner(System.in);
        System.out.println("Please enter how much you spent");
       double spending= how$.nextDouble();
        if(spending>= 100) {
            // spending*0.80
            System.out.println("You final payment after 20%" + (spending -(spending * 0.20)));
        }else{
            System.out.println("Your final payment after 5% discount is: " + (spending-(spending*0.05)));

    }

}}

