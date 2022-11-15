package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        //find the sum from given number
        //created ' originalNumber' variable to keep original value for the given number
        int number = 123, originalNumber = number;
        // finding remaindder from 123 by dividing 10 which is 3(last digits)

        int digit1 = number % 10;
        // modifying number dividing by 10 which is giving 12, asigning back to number

        number = number / 10;

        int digit2 = number % 10;// finding remaindder from 12 by dividing 10 which is 2(last digits)

        number = number / 10;// modifying number dividing by 10 which is giving 1, asigning back to number

        int digit3 = number % 10;// finding remaindder from 1 by dividing 10 which is 1(last digits)

        //finding total of all digits and saving it in to 'sum' variable
        int sum = digit1 + digit2 + digit3;
        System.out.println("the sum of the digits in number 123" + originalNumber + "is" + sum);
    }
}
