package OOP;

public class MethodOverloadingPractice {
    // create a method that will add two int numbers, void return type
    public void sum(int num1, int num2) {
        System.out.println("the sum of two numbers is: " + (num1 + num2));

    }

    // create a method that will add 3 int numbers, void return type
    public void sum(int num1, int num2, int num3) {
        System.out.println("the sum of two numbers is: " + (num1 + num2 + num3));
    }

    // create a method that will
    //this method will decide either add or subtact given two numbers,
    //void return type
    public void sum(String str, int num1, int num2) {
        if (str.equalsIgnoreCase("Add")) {
            System.out.println("The sum is :" + (num1 + num2));
        } else if (str.equalsIgnoreCase("substract")) {
            System.out.println("The difference is:" + (num1 - num2));
        } else {
            System.out.println("No matching operation");
        }


    }
}