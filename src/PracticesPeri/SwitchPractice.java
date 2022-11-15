package PracticesPeri;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String []args){
    String Grade="B";
        Scanner input=new Scanner(System.in);
        String grade=input.nextLine();
        switch (grade){
            case "B":
                System.out.println("Your grade is B and bonus 300$");
                break;
            case "A":
                System.out.println("Your grade is A and bonus 500$");
                break;
            case "C":
                System.out.println("Your grade is C and bonus 200$");
                break;
            case "D":
                System.out.println("Your grade is D and you are getting 100 too");
                break;
            case "F":
                System.out.println("Your grade is F and you need to improve it");
                break;
            default:
                System.out.println("Take a look your grade");
                break;
        }

}
}
