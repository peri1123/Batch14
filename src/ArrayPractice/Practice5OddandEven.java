package ArrayPractice;

import java.util.Arrays;

public class Practice5OddandEven {
    public static void main(String[] args) {
        int zipcodes[]={11,12,13,14,22,23,24};
        /*
        find out even zip codes and print them
        store odd zipcodes in another array named as oddZipcodes
         */
        int [] oddzipcodes=new int[zipcodes.length];
        for (int i=0; i< zipcodes.length; i++){
            if (zipcodes[i]%2==0){
                System.out.println(zipcodes[i]+ "<< even zipcode");
            }else{
                oddzipcodes[i]=zipcodes[i];

            }
        }
        System.out.println(Arrays.toString(oddzipcodes));
    }
}
