package Tasks;

import java.util.Scanner;

public class Task7ProjectDay4 {
    public static void main(String[] args) {
        System.out.println("Please enter 1st number");
        Scanner scanner=new Scanner(System.in);
        int FirstNum= scanner.nextInt();
        System.out.println("Please enter 2nd number");
        int SecondNum= scanner.nextInt();
        System.out.println("Please enter 3rd number");
        int ThirdNum= scanner.nextInt();

        for (int i=1; i<=4; i++ ){
            if ((FirstNum-i)%10==0){
                FirstNum=FirstNum-i;
            } if ((SecondNum-i)%10==0) {
                SecondNum=SecondNum-i;
            } if ((ThirdNum-i)%10==0) {
                ThirdNum=ThirdNum-i;

            }
        }
        for (int i=1; i<=5; i++ ){
            if ((FirstNum+i)%10==0){
                FirstNum=FirstNum+i;
            }if ((SecondNum+i)%10==0) {
                SecondNum=SecondNum+i;
            } if ((ThirdNum+i)%10==0) {
                ThirdNum=ThirdNum+i;

            }

        }
        System.out.println("The sum of numbers is >>"+ (FirstNum+SecondNum+ThirdNum));








    }
}
