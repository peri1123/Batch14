package Tasks;

import java.util.Scanner;

public class TaskOddTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string value.");
        String string = sc.nextLine();

        // Please do not change anything on lines above.
        String nospace=string.replace(" ","");
        System.out.println(nospace);
        int length=string.length();
        System.out.println("length"+ length);

        if(length%2!=0){
            System.out.println("false");

        }else{System.out.println("true");
        }

        }

}

