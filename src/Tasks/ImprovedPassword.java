package Tasks;

import java.util.Locale;
import java.util.Scanner;

public class ImprovedPassword {
    /*
    User is asked to enter a password in main class.
We should write a program to check password by following steps

1 - > If the string doesn't have any upper case
      letter or any lower case letter print
      "Your password is not acceptable"

2 - > If the first character of the password is upper case letter and
      the last character of the password is not letter print
      "Your password is strong".

3 - > If first character of the password is lower case letter and
      the last character of the string is upper case print
      "Your password should be improved"

4 - > For all other conditions print
      "Your password is not valid"

For this task you should use if else statement and no for loop.


Good Luck !
 System.out.println(“Enter a password”);
    Scanner scanner = new Scanner(System.in);

    String password = scanner.next();
    char firstChar = password.charAt(0);
    char lastChar = password.charAt(password.length() -1);
    if(password.equals(password.toLowerCase())|| password.equals(password.toUpperCase())){
      System.out.println(“Your password is not acceptable”);

    } else if (firstChar >= ‘A’ && firstChar <=‘Z’ && !Character.isAlphabetic(lastChar)) {
     System.out.println(“Your password is strong”);

   }else if ( (firstChar >= ‘a’ && firstChar <= ‘z’) && (lastChar >= ‘A’ && lastChar <= ‘Z’)){
      System.out.println(“Your password should be improved”);
   }else{
      System.out.println(“Your password is not valid”);
   }
}
  }


     */
    public static void main(String[] args) {
        System.out.println("Please enter a password");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
         int firstChar=str.charAt(0);
         int lastChar=str.charAt(str.length()-1);



        if(str.equalsIgnoreCase(str.toUpperCase()) && str.equalsIgnoreCase(str.toLowerCase())){
            System.out.println("Your password is not acceptable");
        } else if (firstChar>='A' && firstChar<='Z'&& !Character.isAlphabetic(lastChar) ) {
            System.out.println("Your password is strong");

        } else if ((firstChar>='a' && firstChar<='z') && (lastChar>='A' && lastChar<='Z')) {
            System.out.println("Your password should be improved");

        }else {
            System.out.println("Your password is not valid");
        }


    }


}

