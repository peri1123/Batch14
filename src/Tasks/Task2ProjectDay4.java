package Tasks;

import java.util.Scanner;

public class Task2ProjectDay4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a min number");
        int minN= scanner.nextInt();
        System.out.println("Please enter a max number");
        int max=scanner.nextInt();
        int result=0;

        for (int i=minN; i<=max;i++){
            if (i%3==0 && i%11==0) {
                result+=i;
            }
            System.out.println("The div "+result);
        }System.out.println("The div "+result);


        }
    }

