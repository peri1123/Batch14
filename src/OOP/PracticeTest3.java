package OOP;

import java.util.Scanner;

public class PracticeTest3 {
    public static void main(String[] args) {
        MethodPractice3 test=new MethodPractice3();
        System.out.println(test.EvenNum().equals("Odd"));//false
        String str=test.EvenNum();
        System.out.println(str);//even

        System.out.println(str.toUpperCase());//EVEN
        System.out.println(test.EvenNum2(9));

        // let's get the number from user asn pass a parameter to the method

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter an int number to check even/odd");
        int number = scanner.nextInt();
        test.EvenNum2(number);
        System.out.println(test.EvenNum2(number));

        // you want to get the number every time this evenNum2 method is called

    }

}
