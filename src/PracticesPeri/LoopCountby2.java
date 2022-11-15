package PracticesPeri;

import java.util.Scanner;

public class LoopCountby2 {
    public static void main(String[] args) {
        /*starting from number 10
        count by 2 and print numbers as 10, 12, 14, 16, 18, 20
                */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Print a number");
        int number1=scanner.nextInt();
        while (number1<=20){
            System.out.println("Number is " + number1);


        }
    }
}
