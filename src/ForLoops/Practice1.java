package ForLoops;

public class Practice1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        //this is infinite loop
       /* for (; ;){

            System.out.println("for loop");
        }

        */

        for (; num1 < num2; ) {
            System.out.println("First For Loop,note:update is in the 1st body block");
            num1++;

        }
        System.out.println("After 1st loop");
        //num1=7;
        for (; num1 < num2; num1++) {
            System.out.println("2nd lopps, update statement is is parenthesis");
        }
        System.out.println("num1 is now>> " + num1);
        System.out.println("===============");
        for (int a=3; a>0; a--){
            System.out.println("For loop");

        }

    }
}
