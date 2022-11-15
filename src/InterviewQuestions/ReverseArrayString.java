package InterviewQuestions;

import java.util.Arrays;

public class ReverseArrayString {
    public static void main(String[] args) {
        String array[] = {"Joy", "Sara", "Matt", "Henry"};
//        String[] result = new String[3];


        for(int i=0; i< array.length/2; i++){
            String temp=array[i];
            array[i]=array [array.length-i-1];
            array[array.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(array));

        int nums[]={1,4,5,2,6,8};
        for (int i=0; i< nums.length/2; i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(nums));


    }}

