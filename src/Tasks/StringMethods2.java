package Tasks;

import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args) {
// Please do all coding here
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a random word");
        String randomWord = user.nextLine(); // -> User enters a random word.
        System.out.println("Enter number of letter that word consists of");
        int numberOfLetters = user.nextInt();  // -> User tries to enter number of letters that word consists of.
        System.out.println("Enter a letter that you want to learn its index");
        String enteredLetter = user.next(); // -> User enters a letter to learn its index.
        // Please don't change anything on lines above.
        if (numberOfLetters==10){
            System.out.println("true");
        }

        int indexofA=randomWord.indexOf('a');
        System.out.println("A " + indexofA);




    }

}
