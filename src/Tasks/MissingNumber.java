package Tasks;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int a[]={0,9,7,5,3,1,4,6};
        Arrays.sort(a);
        int temp=0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=temp){
                System.out.print(temp);
                break;

            }temp++;
        }



    }
}
