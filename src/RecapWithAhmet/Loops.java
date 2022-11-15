package RecapWithAhmet;

import java.util.Scanner;

public class Loops {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-Many technical interview questions they require to use loops to solve the questions.

    LOOPS:it is a way to iterate (circles/cycles) the elements (values/variable one by one).
    In other words: it is a cycle for the repetitive actions.


    TYPES OF LOOPS:
    1-do while
    2-while
    3-for
    4-for each ****

    do while: it executes the code 1 time no matter what.
    Whenever you need to execute the code and want users decide when it is going to end.Then use do while

    do{
    Scanner scan=new(System.in)
    sout(1="continue")

    }

    HOMEWORK:
    USING SCANNER: Ask user to enter one string value with 3 words
    1.print first letter of each word
    2-print last letter of each word's index number
    3-print sum of the last letter of each word's index number
    4-print the last letter of each word

    Note: I would use if condition for charAt and '

    EXAMPLE: "JAVA STRING TEST"
    //output: JST
    //output:31015
    //output: 28(3+10+15)
    //output:AGT

    NOTE:You can use either one or two loops


   While:is a way to iterate the elements(elements meaning variable,data).The big difference between while loop
   and do while is that to be able to iterate the elements you must check the condition first unlike DO while


While>>1-ask the user put a integer number and reverse the int number
>>2 miliply the digits(
>>3.Note: in 1 loop
>>exp:123456-->1-54321  2-120




     */
    public static void main(String[] args) {
//        int choice;
//        do {
//            Scanner scan = new Scanner(System.in);
//            System.out.println(("1-Continue \n2-Exit"));
//
//            choice = scan.nextInt();
//        } while (choice != 2);


//        System.out.println("Please print numbers");
////        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
        int num=54321;
        String reversed = "";
        int multiply = 1;//for debugging

        while (num!=0) {
            //12345-->10%
            int digit=num%10;//5 //4 //3
            multiply*=digit;
            reversed+=digit;
            num/=10;
        }
        System.out.println(reversed);
        System.out.println(multiply);

    }

}
