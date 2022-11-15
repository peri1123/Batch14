package ArrayPractice;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int [] numbers={5,8,3,34,7,12,100,35,8,1,-9, 23};// spaces called white space and ignore it
        /*
        show each element from this array one by one
         */

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        /*
        store number which are greater than 10 into an array which is called >> "largerNumbers"
         */
        int [] largernumbers=new int[numbers.length];

        for (int i=0; i< numbers.length; i++){
            if(numbers[i]>10){
                largernumbers[i]=numbers[i];

            }
        }
        System.out.println(Arrays.toString(largernumbers));
        /*
         Scanner scanner=new Scanner(System.in);
       int array=scanner.nextInt();
       int count=0;
       for (int i=0; i<number.length;i++){
           if (array==number[i]){
               number[i]=0;
               break;
           }else{
               count++;
           }
       } if (count==number.length){
            System.out.println("false");
        }else{
            System.out.println(Arrays.toString(number));
        }

         */


    }
}
