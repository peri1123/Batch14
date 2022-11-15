package Loops;

import java.util.Scanner;

public class WhilePractice3CountBy2 {
    public static void main(String[] args) {
        //your age is 23 now
        //print out --> "my age is.."
        // till your age gets to age of 29
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        int age2=29;
        while(age<=age2){
            System.out.println("My age is " + age);
            age++;
        }

       /*
       starting from number 10
       count by 2 and print numbers as 10, 12, 14, 16, 18, 20
        */

        Scanner name=new Scanner(System.in);
        System.out.println("Enter a number");
        int answer= name.nextInt();
        int number=20;
        while (answer<=20) {
            System.out.println(answer);
            answer++;
            answer++;
        }

    }
}
