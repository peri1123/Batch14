package Scanner;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        BMI: body mass index
        BMI=weight/(height*height)

        get weight and height of person by using scanner
        calculate BMI for that person
        show the BMI/ result to the person

         */
        Scanner scanner=new Scanner (System.in);
        System.out.println("Show you weight in kg");
        double weight=scanner.nextDouble();
        System.out.println("Enter your height is meters");
        double height= scanner.nextDouble();
       double BMI= weight/(height*height);
        System.out.println("Your BMI is: "+ BMI);






    }
}
