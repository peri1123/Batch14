package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3Colors {
    public static void main(String[] args) {


    /*
    ask user to tell how many colors they want to store in array take those colors
     from user one by one and store into an array print stored colors all together to show back to user
     */
        System.out.println("How many colors would you like to store?");
        Scanner scanner=new Scanner(System.in);
       int color= scanner.nextInt();
       scanner.nextLine();
        String [] colors = new String[color];
       for (int i=0; i<color; i++){
           System.out.println("Please enter " + (i+1) + ". color");//
           colors[i]=scanner.nextLine();
       }
        System.out.println(Arrays.toString(colors));
    }
}
