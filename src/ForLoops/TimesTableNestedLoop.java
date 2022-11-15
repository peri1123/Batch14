package ForLoops;

import java.util.Scanner;

public class TimesTableNestedLoop {
    public static void main(String[] args) {



    /*
    create multitable for number from 1 to 10;
     */
    Scanner name = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();
        // Check if the variable str has mirror edges.
        int len = str.length();
        String result = "";
        for( int i = 0; i < len; i++){
            for(int j = len - 1; j >= 0; j--){
                if(i < len && str.charAt(i) == str.charAt(j)){
                    result += str.charAt(j);
                    i++;
                }else{
                    System.out.println(result);
                }
            }
        }System.out.println(result);


    }
}

