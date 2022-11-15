package ArrayPractice;

import java.util.Arrays;

public class Practice7shortwaytogetalphabet {
    public static void main(String[] args) {
        String test="hs554jkfsd26kljdsj*&^^7";
        char[] letters=new char [test.length()];
        char []number= new char[test.length()];
        char[] others = new char[test.length()];
        /*
        store all letters into an array
        store all numbers into another array
         */
        for (int i=0; i<test.length(); i++){
            if (Character.isAlphabetic((test.charAt(i)))){
                letters[i]=test.charAt(i);

            } else if (Character.isDigit(test.charAt(i))) {
                number[i]=test.charAt(i);
            } else if ( !Character.isAlphabetic(test.charAt(i)) || !Character.isDigit( test.charAt(i) )){
                others[i] = test.charAt(i);

            }
        }
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(others));
    }
}
