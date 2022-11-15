package IfStatement;

public class Practice1 {
    public static void main(String[] args) {

        int number1=5;
        int number2=10;
        System.out.println("***********");

        if(number1 == number2){
            System.out.println("This is inside of 1st if block");// this sentence did not come out since iF IT  is false

            //even if there are 1000 codes


        }

        if(number1<number2) {
            System.out.println("This is Second if BLOCK");
            // if it is TRUE it will show everything
            //even if there are 1000 codes
        }
        System.out.println("++++++++++++++++");

        String color= "red";
        if(color.equals("red")){
            System.out.println("This is my favorite color");
        }

        System.out.println("$$$$$$$$$$$$$$$$");

        if(!color.equals("red")){
            System.out.println("This could be any other color");//it is false and it won't show it

        }
        number2++;
        System.out.println(++number2+"=============");
        if (!color.equals("blue")){
            System.out.println("My favorite is actually Blue");
            int x=number2+number1;
            x*=x;
            System.out.println("final x is" +x);// we can put extra codes as much as we can

        }
    }
}
