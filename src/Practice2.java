public class Practice2 {

    public static void main (String [] args){

        int number=1;
                // we can not put a number or symbols at the beginning of the name of VARIABLE except $_
        // and we can use number at the end or in the midlle of the name
        //F.E. int 1number=25; that will not compile

        int _number=1;
        int $number=1;

        //int number- we can not use the same Variable name

        //int void=11 we can not use java reserved words like "void"
        //you can create and/or assign values to the variables that has the same data type on the same line FE:

        int num1, num2, num3; //declared three int variables bc they are the same data types and we need to put sign(,)
         num1 =1; //and more

        int num4 =10, num5=20, num6 = 30; //declared and initialized three int variables
        System.out.println(num4);  //10

        //reinitialize the value for a variable FE:num4=100,num5=200, num6=300;
        num4 =100;
        System.out.println(num4); //100
        //why it is not showing 10? bc the it works from the top to the bottom, means it will take the last value

        num4 =150;
        int result= num4 +10;
        System.out.println("The result is: " + result);   //160

        int num7=num4+5;
        System.out.println(num7);

        int peri=25, peri2=50, peri3=60, peri4=30;

        System.out.println(peri*peri4+peri3/peri);




    }

}
