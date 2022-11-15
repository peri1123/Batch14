package Tasks;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number 1");
        int number1 = s.nextInt();
        System.out.println("Enter the number 2");
        int number2 = s.nextInt();
 int gcd=1;
 int lcm =1;
        // number1 and number2 are given above. Please find LCM for these two numbers.
for (int i=1; i<=number1 && i<=number2; i++) {
    if (number1 % i == 0 && number2 % i == 0)
 gcd=i;
    lcm= (number1*number2)/gcd;


}//int lcm= (number1*number2)/gcd;24
        System.out.println(lcm);
    //System.out.println(lcm);




    }
}
