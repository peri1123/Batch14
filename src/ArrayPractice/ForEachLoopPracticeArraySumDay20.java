package ArrayPractice;

public class ForEachLoopPracticeArraySumDay20 {
    public static void main(String[] args) {
        int [] numbers={5,8,3,34,7,12,100,35,8,1,-9, 23};

        //print out numbers from the array by using for each loop
        for ( int num :numbers      ){
            System.out.print(num + ",");//5,8,3,34,7,12,100,35,8,1,-9, 23};
            // will print out until the last element
        }

        /*
        print out number that are less than 10 by using for each loop
         */
        for (int number: numbers) {
            if (number < 10){
                System.out.println(number);
        } else {
            System.out.println(number*100);
        }
            System.out.println("===============");
            //5,8,3,34,7,12,100,35,8,1,-9, 23
            //find sum of numbers and show it --> use for each to solve the question

            int sum=0;
            for ( int finder:numbers ){
                sum=sum+number;
                System.out.println("step by step sum "+ sum);
            }
            System.out.println("final sum + " +sum);
    }
}}
