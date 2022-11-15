package Wrapper;

import java.util.Arrays;

public class StringToWrapper {
    public static void main(String[] args) {
        String str="4.5";
        Double d1=Double.valueOf(str);

        System.out.println(d1+1);//5.5
        String str2="12345";
        char [] digits= str2.toCharArray();
        System.out.println(Arrays.toString(digits));

        Integer a=null;
        int b=a;
        System.out.println(b);



    }
}
