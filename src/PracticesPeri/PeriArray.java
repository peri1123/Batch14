package PracticesPeri;

import java.util.Arrays;
import java.util.Scanner;

public class PeriArray {
    public static void main(String[] args) {
        /*
    ask user to tell how many colors they want to store in array take those colors
     from user one by one and store into an array print stored colors all together to show back to user
     */
        System.out.println("Enter how many colors");
        Scanner scanner=new Scanner(System.in);
       int colors= scanner.nextInt();
       // scanner.nextLine();
        String[] color=new String[colors];
       for (int i=0; i<colors; i++){
           System.out.println("Please enter color " + (i+1));
           color[i]= scanner.nextLine();



       }System.out.println(Arrays.toString(color));




    }
}
