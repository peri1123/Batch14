package Scanner;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //we will get only first word from entered string
        System.out.println("Please enter a sentence");
        String sentence= input.nextLine();// taking everything, taking ful sentence
        System.out.println(">> your sentence is>>"+ sentence);
        //we will get only first word from entered string
        System.out.println("Please enter another sentence");
        String sentence2= input.next();// it will take only 1st peace of data
        System.out.println("your new sen is:" + sentence2);
        input.nextLine();
        System.out.println("what is the zip code?");
        int zipcode=input.nextInt();
        System.out.println("you entered"+zipcode);
    }
}
