package String;

import java.util.Scanner;

public class Task1FirrstcharLastChar {
    public static void main(String[] args) {
        /*
        get a string from user
        print:
        -1st char
        -last char
        index of c, if there is any
        -length of string
        -middle char

         */



        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string value");
        String text= scanner.nextLine();
        //first char
        char firstChar= text.charAt(0);
        System.out.println(firstChar);

        //last char
        int LastIndex = text.length() -1;
        System.out.println( text.charAt( LastIndex ) );

        //index of 'c'

        int indexOfC= text.indexOf('c');
        System.out.println(indexOfC);

        // length
        System.out.println(  text.length() );

        //middle char  --> letter

        char middleChar= text.charAt (text.length()/2 );

        System.out.println("Middle char is:" + middleChar);


        System.out.println("Equals() in String");



























    }
}
