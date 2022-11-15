package PracticesPeri.Loop;

import java.util.Scanner;

public class DoWhileLoopPractice2 {
    public static void main(String[] args) {
        //by using DO-WHILE loop solve following question
        //ask user to provide 2 int number and find the sum of numbers in the given range
        //input 5and 10--> 6+7+8+9=30
        //print the sum
        System.out.println("Please enter a number");
        Scanner scanner=new Scanner(System.in);
        int answer1= scanner.nextInt();
        int answer2= scanner.nextInt();
        int num=0;
        //0-5=> 1+2+3+4+=10
        do {
            answer1++;
            num+=answer1;//whatever number we include will not +
            System.out.println("sum after loop" + num);
        }while (answer1<answer2-1);

    }
}
