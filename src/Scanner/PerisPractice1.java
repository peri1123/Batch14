package Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PerisPractice1 {
   public static void main(String[]args){
   /*Scanner inputname=new Scanner (System.in);
   String atym= inputname.nextLine();
       System.out.println("My name is " + atym);

       int age= inputname.nextInt();
       System.out.println("and I am" + age);

     String myfam= inputname.nextLine();
       System.out.println( myfam);
      // String myfam=inputname.nextLine();

      */


       System.out.println("*******BMI********");

      /*Scanner scanner=new Scanner(System.in);


       System.out.println("Please enter you weight ");
       double weight= scanner.nextDouble();


       System.out.println("Please enter your height " );
       double height= scanner.nextDouble();

       System.out.println("Your BMI is " + weight / (height*height));
       */



       System.out.println("Money Transaction David");
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
       Scanner money=new Scanner(System.in);

      /* System.out.println("Show how much you have in account");
       int inaccount= money.nextInt();
       System.out.println(inaccount);

       System.out.println("Show how much money you put with your 1st check");
       int paycheck1= money.nextInt();
       System.out.println(paycheck1);

       System.out.println("Show how much money you put with your 2nd check");
       int paycheck2= money.nextInt();
       System.out.println(paycheck2);

       System.out.println("Show how much money you put with your 3rd check");
       int paycheck3= money.nextInt();
       System.out.println(paycheck3);

       System.out.println("Phone cost "+" headphone" );
       int phonecost= money.nextInt();
       int headphone= money.nextInt();
       System.out.println(phonecost+headphone);

       System.out.println("This is your final balance"+ (inaccount+paycheck1+paycheck2+paycheck3-phonecost-headphone));
       */


      /* System.out.println("Efe's version");
       Scanner scanner = new Scanner(System.in);
       double balance = 200;
       System.out.println("Please enter your first paycheck amount");

       double firstCheck = scanner.nextDouble();
       balance  += firstCheck;
       System.out.println("Please enter your second paycheck amount");
       double secondCheck = scanner.nextDouble();
       balance  = balance + secondCheck;
       System.out.println("Please enter your third paycheck amount");
       double thirdCheck = scanner.nextDouble();
       balance = balance + thirdCheck;
       System.out.println("please enter phone price");
       double phonePrice = scanner.nextDouble();
       balance = balance - phonePrice;

       System.out.println("please enter headphone price");
       double headPhonePrice = scanner.nextDouble();
       balance = balance - headPhonePrice;
       System.out.println("This is your final balance: "+ balance);

       */


       System.out.println("boolean");
       /*Scanner input=new Scanner (System.in);
       boolean x=input.nextBoolean();
       System.out.println(x);*/

       System.out.println("Get the sentence from the middle");
       /*Scanner input=new Scanner(System.in);
       System.out.println("Put your sentence");
       String sentence= input.nextLine();
       System.out.println("Your sentence" +sentence);

       String another=sentence= input.next();
       System.out.println("Your another sentence is " + another);

       System.out.println("What is the zip code");
       int zipcode= input.nextInt();
       System.out.println(zipcode);

        */

       System.out.println("Practice4");

       Scanner cityname=new Scanner (System.in);
       System.out.println("What is your city name?");

      System.out.println("My city is "+ cityname.nextLine());

















    }
}
