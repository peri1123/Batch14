package Loops;

import java.util.Scanner;

public class LoopNotes14 {
    public static void main(String[] args) {
        System.out.println("my name is Peri");
        System.out.println("my name is Peri");
        System.out.println("my name is Peri");
        System.out.println("my name is Peri");
        //but loop can do it for us

        int count=0; //loop will run again again until it will see false

    while(count<=10){
        System.out.println(count+ "My name is Peri");
        count++;

    }
        System.out.println("Do you know Java?");
        String yes= "yes";
        Scanner input=new Scanner(System.in);
        String answer= input.nextLine();

        while (! answer.equalsIgnoreCase("yes")){
            System.out.println(yes+ "you know java");
            answer= input.nextLine();

        }


    }
}
