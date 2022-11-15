package Tasks;

import java.util.Scanner;

public class ThreeWords3 {
    public static void main(String[] args) {

        String threeWords=new Scanner(System.in).nextLine();
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
        boolean result = we>love ||love<java;
        System.out.println(result);



/*

         ||  --> one condition is enough to fullfill result

         && --> both conditions are necessary to fullfill result


         */





    }
}