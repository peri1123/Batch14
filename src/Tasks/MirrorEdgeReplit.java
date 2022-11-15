package Tasks;

import java.util.Scanner;

public class MirrorEdgeReplit {
    public static void main(String[] args) {
        /*
        Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string,
and at the very end of the string in reverse order.

For example,
the string "abXYZba" has the mirror end "ab". -> Because ab is in the begining also at the end.
         */

        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();
        int len=str.length();
        String result="";

        for (int i=0; i<=str.length(); i++) {
            for (int j=str.length()-1; j>=0; j--){
                if (i<str.length() && str.charAt(i)==str.charAt(j)){
                    result+=str.charAt(j);
                    i++;

                }else{
                    System.out.println(result);
                }

            }
        }System.out.println(result);





    }
}
