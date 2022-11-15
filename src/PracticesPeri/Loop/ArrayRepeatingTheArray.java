package PracticesPeri.Loop;

import java.util.Arrays;

public class ArrayRepeatingTheArray {
    public static void main(String[] args) {
        int number[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int copy[]= new int[10];
        for (int i=0; i<number.length; i++){
            copy[i]=number[i];

        }System.out.println("New Array"+ Arrays.toString(copy));



    }
}
