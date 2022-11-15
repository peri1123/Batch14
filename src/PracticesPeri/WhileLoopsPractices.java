package PracticesPeri;

import java.util.Scanner;

public class WhileLoopsPractices {
    public static void main(String[] args) {

        System.out.println("Guess Password");
        String password="This is heaven";
        Scanner scanner=new Scanner(System.in);
        String guess= scanner.next();
        while (!guess.equals(password)){
            System.out.println("Guess password");
            guess= scanner.next();
        }
        System.out.println("Congrats!");



    }
}
