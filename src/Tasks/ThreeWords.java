package Tasks;

import java.util.Scanner;

public class ThreeWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string with three words.");
        String threeWords = new Scanner(System.in).nextLine();
        // Please don't change anything on lines above.
        System.out.println("We Love Java");
        String firstword=threeWords.substring(0,2);
        System.out.println(firstword);
       String secondword=threeWords.substring(3,7);
        System.out.println(secondword);
       String thirdword=threeWords.substring(8,12);
        System.out.println(thirdword);

       String word1="We";
       String word2="Love";
       String word3="Java";

       char firstchar=threeWords.charAt(0);
        System.out.println(firstchar);
       char secondchar=threeWords.charAt(3);
        System.out.println(secondchar);
       char threechar=threeWords.charAt(8);
        System.out.println(threechar);

       char lastchar=threeWords.charAt(1);
        System.out.println(lastchar);
       char lastlove=threeWords.charAt(6);
        System.out.println(lastlove);
       char lastjava=threeWords.charAt(11);
        System.out.println(lastjava);



        /*
        String word1 = "We";
        System.out.println(word1);
        String word2 = "Love";
        System.out.println(word2);
        String word3 = "Java";
        System.out.println(word3);

        char firstchar = threeWords.charAt(0);
        char secondchar = threeWords.charAt(3);
        char threechar = threeWords.charAt(8);
        System.out.println(""+firstchar+secondchar+threechar);


        char lastchar = threeWords.charAt(1);
        char lastlove = threeWords.charAt(6);
        char lastjava = threeWords.charAt(11);
        System.out.println(""+lastchar+lastlove+lastjava);



        int we = word1.length(), love = word2.length(), java = word3.length();
        boolean result = we>love || love<java;
        System.out.println(result);

         */


    }
}
