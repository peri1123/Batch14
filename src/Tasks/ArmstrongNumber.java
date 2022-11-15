package Tasks;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=s.nextInt();
        int i=number;
        int r, sum=0;

        while( number>0) {
            r =  number % 10;
            number =  number / 10;
            sum=sum+ r * r * r;
        }if ( sum==i){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }





       /* int sum =0;
        int copyOfNumber = number;
        while(number>0){
            int digit = number%10;
            int cube = digit*digit *digit;
            sum +=cube;
            number /=10;

        }

// i will have sum of the cube
        if(sum==copyOfNumber){
            System.out.println(copyOfNumber+" is an Armstrong number");
        }else{
            System.out.println(copyOfNumber+" is not an Armstrong number");
        }

        */





    }
}
