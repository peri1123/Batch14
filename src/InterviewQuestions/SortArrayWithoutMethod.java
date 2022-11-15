package InterviewQuestions;

import java.util.Arrays;

public class SortArrayWithoutMethod {
    public static void main(String[] args) {
        int array[]={4,5,9,8,1,3};

        for(int i=0; i< array.length; i++){
            int temp=0;
            for(int j=i+1; j< array.length; j++){
                if(array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int array[]){


    }


}
