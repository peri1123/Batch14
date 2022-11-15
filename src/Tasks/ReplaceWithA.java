package Tasks;

import java.util.Scanner;

public class ReplaceWithA {
    public static void main(String[] args) {
        /*
        Then replace all the char of the String with 'a' using loop and PRINT IN EVERY STEP.
        Look at example below carefully

        For example:
        Input: Success
        Output:
        "auccess"
        "aaccess"
        “aaacess”
        "aaaaess"
        "aaaaass"
        "aaaaaas"
        "aaaaaaa"
        “aaaaaaa”
         */
        System.out.println("Enter a string value");
        Scanner s = new Scanner(System.in);
        String str = s.next();

        for (int i=0; i<str.length(); i++) {
            str=str.substring(0,i)+'a'+str.substring(i+1);
            System.out.println(str);
        }




    }
}
