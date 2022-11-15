package Scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        /*
David wants to deposit his money into his bank account
-he already got $200 in his account
-he got three different paychecks ($480, $600 and $350)
-he can only deposit one paycheck at a time
-after he got his money in the account
- he bought a phone for $599 and headphone for $299
- calculate his final money in his account
open a new class under scanner package and name it as "MoneyTransaction"
*/

        Scanner scanner=new Scanner (System.in);
        System.out.println("Show how much you have in your account");
        double balance=200;

        System.out.println("Show how me your first paycheck amount");
        double firstcheck=scanner.nextDouble();// it is taking the number from the double which is user putting
        balance+=firstcheck;

        System.out.println("Please enter your second paycheck amount");
        balance= balance+ scanner.nextDouble();

        System.out.println("Please enter your third paycheck amount");
        balance=balance+ scanner.nextDouble();
        System.out.println("Please enter phone price");
        balance=balance- scanner.nextDouble();
        System.out.println("Please enter headphone price");
        balance=balance=scanner.nextDouble();
        System.out.println("This is your final balance"+balance);


    }
}
