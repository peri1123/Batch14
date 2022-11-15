package Primitives;

public class Farm {
    public static void main (String []args){
        /*
       -1-calculate number of legs in a farm if:
       there are 12 cows and 25 chickens at this farm
       -show the total numbers of the legs on the console
       "the total numbers of legs in the farm is:" .... //98
         */

        int cows=12;
        int chickens=25;
        int eachCowLegs=4;
        int eachChichkenLegs=2;

      int total = cows*eachCowLegs+chickens*eachChichkenLegs;

        System.out.println("total numbers of legs " +total );

        System.out.println("the total numbers legs:" + (cows*eachCowLegs+chickens*eachChichkenLegs));


        /*
        calculate worth of the farm if:
        each cow is $1500
        each chicken is $30
        -show total worth of the farm as: "The worth of the farm is:"  //18750
         */

        int cow1=1500;
        int chicken1=30;
        int total1=cows*cow1+chickens*chicken1;
        System.out.println("the total worth of the farm is:" +total1);


    }

}
