package Loops;

import java.util.Scanner;

public class DoWhileStarTree {
    public static void main(String[] args) {
        /*
        ask user to give you an int number
        create a star tree for the given
        input-->5
        *
        **
        ***
        ****
        *****
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int answer1= scanner.nextInt();
        String str="*";

        do {
            System.out.println(str );
            str+="*";//concation and reassigning
            //str+=str;//there is 2 ** and you will just attach to other and become
            answer1--;

        }while(answer1>0);



    }

}
