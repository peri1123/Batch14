package Scanner;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        String name= "John";
        System.out.println(name);


        Scanner input= new Scanner(System.in);
        String lastname=input.nextLine();
        lastname=lastname.toUpperCase();
        System.out.println("Please enter last name");
        char lastname1=input.nextLine().charAt(2);
        System.out.println("Char is " + lastname1);

        System.out.println(name + " " + lastname);

        //take age of John
        //your age is ...
        System.out.println("Please enter your age");


        int ageofJohn=input.nextInt();
        System.out.println("John your age is: " +ageofJohn);




    }
}
