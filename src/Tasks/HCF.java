package Tasks;

import java.util.Scanner;

public class HCF {
    public static int main(String[] args) {
        /*
Write a java program to find HCF (Highest Common Factor) of two numbers.

Test Data :
Input 1: 24
Input 2: 28
Expected Output : 4  -> Because HCF of 24 and 28 is 4
Input 1: 75
Input 2: 45
Expected Output : 15  -> Because HCF of 75 and 45 is 15



NOTE : Highest Common Factor means biggest common divident of two number.

         */

       Scanner s = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number1 = s.nextInt();
        System.out.println("Enter the number 2");
        int number2 = s.nextInt();
        int i = 0;

        // number1 and number2 are given above. Please find the HCF of these two numbers.
        for (int i1 = 1; i1 < number1 || i < number2; i1++) {
            if (number1 % i1 == 0 && number2 % i1 == 0) {
                i = i1;
            }
        }
        System.out.println((i));

        System.out.println("Enter the number of term");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // n is given above.
        int sum = 0, j = 1;
        for (int i1 = 0; i1 <= n; i1++) {
            sum += j;
            j = (j * 10) + 1;
        }
        return sum;


    }
}





