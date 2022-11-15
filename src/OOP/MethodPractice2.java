package OOP;

import java.util.Scanner;

public class MethodPractice2 {
    /*
    create a  method that will calculate age of person
    return type is void
    name of method is age calculator
    print age of person--> "age is ..."
    */


    public void ageCalculator(){
        int currentYear=2022, birthYear=2020, age;
        age=currentYear-birthYear;
        //System.out.println("Age is " + age);

    }
    public int ageCalculator1(){
        int currentYear=2022, birthYear=2020, age;
        age=currentYear-birthYear;
        //System.out.println("Age is " + age);
return age;
    }

    public static void main(String[] args) {
        MethodPractice2 john = new MethodPractice2();
        john.ageCalculator();// can not store since it is void and not returning anything
        int number1 = john.ageCalculator1();
        //System.out.println(john.ageCalculator(); won't compile since it is void
        System.out.println(john.ageCalculator1());
        System.out.println(number1);//2

        if (number1 == 15) {
            System.out.println("You are so young");
        }//won't show anything since it is false

        if (john.ageCalculator1() == 15) {
            System.out.println("You are so young");
        }//won't show anything since it is false
        System.out.println(2 < john.ageCalculator1());//false

    }
}
