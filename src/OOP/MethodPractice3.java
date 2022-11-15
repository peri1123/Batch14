package OOP;

import java.util.Scanner;

public class MethodPractice3 {
    /*
    create a method that will find out if number is even number or add number
    return String

    if number is even --> return --> even
    if number is odd --> return --> odd
     */

    public String EvenNum() {
        int number1 = 20;
        if (number1 % 2 == 0) {
            return "even";
        } else {
            return "Odd";
        }
    }

        public String EvenNum2(int num) {

            if (num % 2 == 0) {
                return "even";
            } else {
                return "Odd";
            }






            }
}
