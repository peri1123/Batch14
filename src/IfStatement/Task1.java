package IfStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask user to give first letter of the day
        when letter is m--> "It should be Monday"
                    t--> "It should be Tuesday or Thursday"
         */
        Scanner input=new Scanner(System.in);
        System.out.println("First letter of the day");
        String firstLetter=input.nextLine();

        if(firstLetter.equalsIgnoreCase("m")){
            System.out.println("It should be Monday");
        }


            if(firstLetter.equalsIgnoreCase("T")){
            System.out.println("It should be Thursday or Tuesday");}


        ///////++++++++++++++++++
        System.out.println("First letter of the day");
        char letter=input.nextLine().charAt(0);
        if (letter=='w' || letter== 'W') {
            System.out.println("It should be Weds");

        }




    }
}
