package Tasks;

import java.util.Scanner;

public class TaskWithoutZ {
            public static void main(String[] args) {
               Scanner s = new Scanner(System.in);
                System.out.println("Enter a string value");
                String str = s.next();
                int i=0; str.length(); i++;
                if (i==0 && str.charAt(i) != 'z'){
                    System.out.println();

                }

                /*User is asked to enter a string value using scanner.
                If one or both of the first 2 chars is 'z', print the
                string without those 'z' chars, and otherwise print the string
                unchanged.

                 */
    }
}
