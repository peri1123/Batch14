package PracticesPeri.Loop;

import java.util.Scanner;

public class LoopMultipication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Create a multipication table");
        int number1=input.nextInt();
                int number2=1;
                while (number2<=number1) {
                    System.out.println(number1+ "*" + number2+"=" +number1*number2);
                    number2++;
                }
    }
}
