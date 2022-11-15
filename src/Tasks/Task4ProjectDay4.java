package Tasks;

import java.util.Scanner;

public class Task4ProjectDay4 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=number; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
