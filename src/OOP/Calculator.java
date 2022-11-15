package OOP;

public class Calculator {
    /*create Calculator class
    Create a method that will add

     */
    int num1=10, num2=10;
    public void SumCalculator(){
        int sum=num1+num2;
        System.out.println("The sum is " + sum);

    }

    public int SumCalculator1(){
        int sum=num1+num2;
        System.out.println("The sum is " + sum);
return sum;
    }

    public void total(int number1, int number2){
        int result= number1+number2;
        System.out.println("The total is" +result);

}
public static void main(String[]args){
        Calculator calculator=new Calculator();
        calculator.SumCalculator();
        calculator.total(1,2);
}
}
