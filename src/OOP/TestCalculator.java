package OOP;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.SumCalculator();
        calc.num1=12;
        calc.num2=12;
        calc.SumCalculator();
        //int r1= calc.SumCalculator(); since the return type of SumCalculator
                //method is void you cannot assign the result into another variable

        int r2= calc.SumCalculator1();
        System.out.println(r2);

        //calc.total(5,3);

    }
}
