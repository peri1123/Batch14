package InterviewQuestions;

import java.util.Arrays;

public class MissingNumberINArray {
    public static void main(String[] args) {
//        // this example only for the numbers between 0 to 9 and only finds the one missing number
//        int [] arr={0,4,2,3,6,8,1,9,7};
//        // find missing number from given array
//        // 0, 1,2,3,4... 9
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int num=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=num){
//                System.out.println(num);
//
//            }
//            num++;
//        }
        int array[]={1,2,3,4,6,8,9,};
        missingNum(array);
    }


    public static void missingNum(int array[]){//1/2/4/6/7/8/0/9
        Arrays.sort(array);//i am sorting array bc my num is increasing
        int num=1;
        for (int i=0; i< array.length;i++){
            if(array[i]!=num){
                System.out.println(num);

                break;

            } num++;
        }
    }
    public static void findMissingNum(int array ){



    }
}
