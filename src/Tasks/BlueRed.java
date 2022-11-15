package Tasks;

import java.util.Scanner;

public class BlueRed {
    public static void main(String[] args) {
       /* Using scanner the user is asked the to enter any String value.
        If this String has letters of red or blue with lower case print the red or
        blue. Otherwise do not print anything.
                EXAMPLE-1:
        Input: "xxredyy"
        Output: red
        EXAMPLE-2:
        Input: "xbxltue"
        Output: blue
        EXAMPLE-3
        Input : "rllltteaaadkkk"
        Output: red
        EXAMPLE-4:
        Input: "rllleell" -> Since the string doesn't have letters of red or blue we shouldn't print anything.
                Output:

        */
        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();
        if (str.contains("r") && str.contains("e") && str.contains("d")){
            System.out.println("red");
        } else if (str.contains("b") && str.contains("l") && str.contains("u") && str.contains("e")) {
            System.out.println("blue");
            
        }else {
            System.out.println("anything");
        }

    }
}
