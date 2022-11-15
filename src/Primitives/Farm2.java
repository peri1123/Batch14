package Primitives;

public class Farm2 {
    public static void main(String []args){
         /*
       -1-calculate number of legs in a farm if:
       there are 12 cows and 25 chickens at this farm
       -show the total numbers of the legs on the console
       "the total numbers of legs in the farm is:" ....
         */

        int cow=12;
        int chickens=25;
        int cowslegs=4;
        int chickenlegs=2;

       int total=cow*cowslegs+chickens*chickenlegs;
        System.out.println("the total numbers of legs in the farm is:"  + total);

        /*
        calculate worth of the farm if:
        each cow is $1500
        each chicken is $30
        -show total worth of the farm as: "The worth of the farm is:"  //18750
         */

        double cow$=1500;
        double chicken$=30;
        System.out.println(cow$*cow+chicken$*chickens);

    }
}
