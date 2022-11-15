package PracticesPeri;

import java.util.Scanner;

public class Loopsnumber1to10 {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int n1= scanner.nextInt();
        while (n1<=10){
            System.out.println("Number" + n1);
            n1++;
        }

         */

        /*for (int i=1; i<=10; i++){
            System.out.println("Numbers"+i);
        }

        int result=0;
        for (int x=1 ; x<=10; x++ ){
            result=result+x;
            System.out.println(result);
        }

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a positive  and print out * table");
        int n1= scanner.nextInt();
        int n2=1;
        while (n2<=10){
            System.out.println(n1+ "*" + n2 + "="+ n1*n2);
            n2++;
        }

}
}
