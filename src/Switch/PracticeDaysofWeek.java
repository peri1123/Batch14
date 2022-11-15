package Switch;

import java.util.Scanner;

public class PracticeDaysofWeek {
    public static void main(String[] args) {
        /*
        get a number from user between 1 and 5 show day of a week for related #
        -switch--
        1--> it is monday
        2-->tuesday
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number between 1-5");
        int numbersday=input.nextInt();
        switch (numbersday){
            case 1:
                System.out.println("This is Monday");
                break;
            case 2:
                System.out.println("2-Tuesday");
                break;
            case 3:
                System.out.println("3-Weds");
                break;
            case 4:
                System.out.println("4-Thursday");
                break;
            case 5:
                System.out.println("5-Friday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}

