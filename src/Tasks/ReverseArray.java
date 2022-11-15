package Tasks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int nums [] ={12,33,4,5,77,88};
        for (int i=0; i<nums.length/2; i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;

        }System.out.println(Arrays.toString(nums));
    }
}
