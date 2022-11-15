package PracticesPeri.Loop;

import java.util.Scanner;

public class DivisorsLoop {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Please enter number");
        int number1=input.nextInt();
        int number2=1;
        while (number2<number1){

            if (number1%number2==0){
                System.out.println(number2);
            }
            number2++;

        }
    }
}
