package IfStatement;

import java.util.Scanner;

public class ElseIFPractice2PositiveOrNegative {
    //public static void main(String[] args) {
        /*
        get a number from user and check
        if the number is greater than 0 tell user that his number is positive
        if the number is less than zero tell user that his number is negative
        or check if it is zero, and let user know

         */

        /* Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int number= input.nextInt();
        if(number>0){
            System.out.println("Your number is positive");
    } else if (number<0) {
            System.out.println("Negative");
        }else {
            System.out.println("check the number");

        }

        User will enter two string values using scanner.
If both string length is same, concatenate them together. Then, print the result.
If both string length is not same, omit the last chars from the longer string so it will be the same
length as the shorter string. After making both strings the same length,
concatenate them and print the result.

EXAMPLE-1:
String 1: "Cell"
String 2: "Phone"
Output: "CellPhone"
EXAMPLE-2:
String 1: "Cable"
String 2: "Mic"
Output: "CabMic"
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter string 1");
            String str1 = s.next();

            System.out.println("Enter string 2");
            String str2 = s.next();
            if (str1.length()==str2.length()){
                System.out.println(str1.concat(str2));
            } else if (str1!=str2) {
                System.out.println(str1.indexOf());

            }else{
                System.out.println(str1.concat(str2));
            }

         */
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String fullName = s.nextLine();
            String stateCode = s.next();
            String city = s.next();
            String gender = s.next();
            int age = s.nextInt();
            //Please don't change anything on lines above.

            if (fullName.charAt(0) == 'A' && fullName.charAt(fullName.length()-1)== 'V' && stateCode.charAt(0) == 'I' &&
                    stateCode.charAt(stateCode.length()-1)== 'L' && city.length() < 10 && gender.equalsIgnoreCase("F") && age > 18){
                System.out.println("You will be able to vote");
            } else  {
                System.out.println("You will not  be able to vote");
            }







        }
    }
