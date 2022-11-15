package PracticesPeri;

import java.util.Scanner;

public class LoopMultipication {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number");
        int number= input.nextInt();
        int number2=1;
        while (number2<=10){
            System.out.println(number + "*" + number2 + "=" + number*number2);
            number2++;
        }

    }
}
