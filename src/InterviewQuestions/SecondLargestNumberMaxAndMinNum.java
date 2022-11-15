package InterviewQuestions;

import java.util.Arrays;

public class SecondLargestNumberMaxAndMinNum {
    public static void main(String[] args) {
        int[] array = {100, 300,200,150};
        int largest = array[0];
        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
              } else if (array[i]>secondLargest && array[i]!=largest) {
                secondLargest=array[i];
            }

        } System.out.println( largest +" and "+ secondLargest);



//    public static int largestNum(int [] nums){
//        int largest=nums[0];
//        int secondL=0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]>largest){secondL=largest;
//                largest=nums[i];
//            } else if (nums[i]>secondL && nums[i]!=largest) {
//                secondL=nums[i];
//            }
//
//        }System.out.println(largest+" "+secondL);
//        return largest;
    }}
