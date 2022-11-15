package PracticesPeri;

import java.util.Arrays;

public class ArrayRemoveSpecificIndexPeriPractice {
    public static void main(String[] args) {
        /*int [] array={25, 56, 15, 36, 56, 77, 18, 29, };
        int RemoveIndex=1;
        System.out.println(Arrays.toString(array));
        for (int i=RemoveIndex; i< array.length-1; i++)
        {
            array[i]= array[i+1];
        }
        System.out.println("After removing " + Arrays.toString(array));

         */



         int my_array []={25, 14, 56, 15, 36,56, 77, 18, 29, 49};

        int IndexPosition=2;
        int value=675;
        for (int i= my_array.length-1; i>IndexPosition; i--) {
            my_array[i]= my_array[i-1];

        }
        my_array[IndexPosition]=value;
        System.out.println("New Array"+Arrays.toString(my_array));


    }
}
