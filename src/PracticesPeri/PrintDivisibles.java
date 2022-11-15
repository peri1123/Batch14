package PracticesPeri;

import java.util.Scanner;

public class PrintDivisibles {
    public static void main(String[] args) {

            /*Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a starting number");
            int startingNumber = scanner.nextInt();
            System.out.println("Enter an ending number");
            int endingNumber = scanner.nextInt();
            // Please don't change anything on the lines above.

            for (int number = 0; number < endingNumber; number++) {
            if (number%3==0 && number%5==0){
                System.out.println(number+",");
            }

            }

             */
        System.out.println("Please enter an integer number");
        int num = new Scanner(System.in).nextInt();
        int number=0;

        while(number<10){
            number++;
            System.out.println(num  + "*" + number +  "=" +  num * number);
        }






    }


    }
