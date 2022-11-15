package Loops;

import java.util.Scanner;

public class WhilePractice6Watermelon {
    public static void main(String[] args) {
        /*
        Ask user to give a String Value
        -print out every single from given string
        "watermelon" --> w-a-t-...


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word");
        String answer=scanner.nextLine();
       //watermelon -->str.charAt(0); -->w
        //             -->str.charAt(1); -->a
        //              -->str.charAt(1); -->a

        int index=0;
        while(index<answer.length()){
            System.out.print( answer.charAt(index) + "-");
            index++;
        }
        */



       Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=scanner.nextLine();
        int index=0;
        while (index<word.length()){
            System.out.print( word.charAt(index) + "-" );
            index++;

        }

    }
}
