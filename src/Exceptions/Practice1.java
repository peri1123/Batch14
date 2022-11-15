package Exceptions;

public class Practice1 {
    public static void main(String[] args) {
        String number="2210200M";

        //convert the given string
        //need to parse the s
        //Integer.parseInt(number+200);



        try{
            int result =5/0;//ArithmeticException
            Integer.parseInt(number);
            //System.out.println("First type of exception");
            //int result =5/0;//ArithmeticException
            System.out.println(result);
            System.out.println("Second type of exception");

        }catch(NumberFormatException | NullPointerException e){

            System.out.println("Caught NUmber format exception");
        }catch (ArithmeticException arithmeticException){
            System.out.println("I caught arithmeticException");
        }catch (RuntimeException runtimeException){
            System.out.println("Runtime Exception");
        }finally {
            System.out.println("dkhzcl");
        }

        System.out.println(number+200);
        System.out.println("Working on exception");

    }
}
