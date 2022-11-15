package Tasks;

import java.util.Scanner;

public class LoopMultipicationTable {
    public static void main(String[] args) {
        /*User is asked to enter an integer number using scanner.
        Print multiplication table of given number.
        Please make sure your output exactly look like given example below.
                EXAMPLE:

        Input number: 5  // User gives this input number.
        Output :
        5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15
        5 * 4 = 20
        5 * 5 = 25
        5 * 6 = 30
        5 * 7 = 35
        5 * 8 = 40
        5 * 9 = 45
        5 * 10 = 50
         */

        System.out.println("Please enter an integer number");
        int num = new Scanner(System.in).nextInt();

        for(int i=0; i<=10; i++){
            System.out.println(num+ "*" +i + "=" + i*num);
        }


        /*int number=0;
        while(number<10){
            number++;
            System.out.println(num  + " * " + number +  " = " +  num * number);
        }

         */

    }
}
