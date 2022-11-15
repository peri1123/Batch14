package Primitives;

public class ArithmeticPractice {

    public static void main(String [] args){
        // main=psvm shprt cuts

        int a = 10;
        // add, subtract, multiply, divide, remainder (left over)

        int b = a+10;
        System.out.println("b >>" +b);

        a = b -5;
        System.out.println("a>>" +a);

        int c = 5*6;
        int d= a*b;
        b=c;

        System.out.println("c>>"+c);
        System.out.println("d>>"+d);
        System.out.println("b>>"+b);


        //Division

        int e=c/a;

        System.out.println("e .."+e);

        int result=5/2; //2 bc of data type
        System.out.println("result>>"+result);

        double result1=5.0/2; //2.5
        System.out.println("result1>>"+result1);

        //remainder--left over   %--> modulus operator

        int x=5/2;
        System.out.println(x);



    }
}
