package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteGivenElement {
    public static void main(String[] args) {
        /*
        Create the int array with  numbers following,
 10,4,3,55,32,145,443,234,98,32  (on the line 5).
Then, using scanner  ask user to provide any number from given array, then remove the
value from array and put 0 instead of that number and PRINT the array.
If array doesn't contain the number PRINT "false".


Example:
Given Number:
145
Output:
[10, 4, 3, 55, 32, 0, 443, 234, 98, 32]

Example 2:
Given Number:
2000
Output:
false

Example 2:
Given Number:
32
Output:
[10, 4, 3, 55, 0, 145, 443, 234, 98, 0]

         */
        int number[]={10,4,3,55,32,145,443,234,98,32};
        System.out.println("Please enter a number");
          Scanner scanner=new Scanner(System.in);
          int array= scanner.nextInt();
          int count=0;
          for (int i=0; i< number.length; i++){
              if (number[i]==array){
                  number[i]=0;
                  break;
              }else{
                  count++;
              }
          }
          if (count==number.length){
              System.out.println("false");
          }else{
              System.out.println(Arrays.toString(number));
          }

    }
}
