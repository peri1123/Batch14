package Loops;

import java.util.Scanner;

public class PalindromeTaskReverseString {
    public static void main(String[] args) {
        /*String name="civic";
        String reverse="";
        for (int i=name.length()-1; i>=0; i--){
            reverse+=name.charAt(i);

        }
        if(name.equals(reverse)){
            System.out.println("Given string is palindrome");
        }else {
            System.out.println("Given string is not palindrome");
        }



        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String letter="";

        for(int i=str.length()-1; i>=0; i--)
        { letter += str.charAt(i);
            if (str.equals(letter)){
                System.out.println("dad");
        }else {
                System.out.println("anything");
            }
        }

         */
        /*System.out.println("String length");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a string value.");
        String string = s.next();
        int position, length;
        if(string.length()/2==0){
            position=string.length()/2-1;
            length=2;

        }else{
            position=string.length()/2;
            length=1;
        }


         */
        System.out.println("Enter a string value");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='d' && str.charAt(i+2)=='d'){
                System.out.println("dad");

            }
        }


    }
}
