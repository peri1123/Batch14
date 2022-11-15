package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
        int [] number=new int[7];//there is no limitions for capasity
        int num=2;
        System.out.println(num);//2
        System.out.println(number);//it will print  hash code which is location of the array [I@2c8d66b2
        System.out.println(Arrays.toString(number));// [0,0,0,0,0,0,0]these


        number[0]=3;
        number[4]=24;
        number[1]=5;
        number[2]=9;
        number[6]=99;
        System.out.println(Arrays.toString(number));
        //show only specific element in specific index
       System.out.println(number[0]);//3 which is data on the 0 index
       System.out.println(number[4]);//24

       //store 99 on the last index
       number[6]=99;
       System.out.println(number[6]);

       //store on the last index with dynamic coding
       number[number.length-1]=100;
       System.out.println("morning "+ number[number.length-1]);//propertry

       //length--> it will return size of array
       System.out.println(number.length);//7

       String str= "test";
       str.length();// length() is method
       System.out.println(Arrays.toString(number));//[3, 5, 9, 0, 24, 0, 100]

       //reassignment for index 1
       number [1]=55;
       System.out.println(Arrays.toString(number));//[3, 55, 9, 0, 24, 0, 100]

       //since the capacity is 7, can you put some date to further index
      // number[9]=11;//ArrayIndexOutOfBoundsException//Index 9 out of bounds for length 7// there is not enough space
       // number[7]=11; we are looking

       boolean [] name= new boolean[7];
       name [6]=5==5;
       System.out.println("new code "+Arrays.toString(name));










       }
}
