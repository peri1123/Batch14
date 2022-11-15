package ArrayPractice;

import java.util.Arrays;

public class BinarySearchPractice1 {
    public static void main(String[] args) {
        int [] number={12,8,3,5,6,7,10,15};
        //before sort
        System.out.println(Arrays.toString(number));//[12, 8, 3, 5, 6, 7, 10, 15]

        Arrays.sort(number);
        //after sort
        System.out.println(Arrays.toString(number));//[3, 5, 6, 7, 8, 10, 12, 15]
        System.out.println(Arrays.binarySearch(number,3));//0 index number
        System.out.println(Arrays.binarySearch(number,10));//5
        System.out.println(Arrays.binarySearch(number,4));//-2
        System.out.println(Arrays.binarySearch(number,9));//9


        int num=2;
        //int[] number{3,4,5};
        int []number1= new int [9];
        //============
        int [][] numbers=new int[3][2];//just random #s








    }
}
