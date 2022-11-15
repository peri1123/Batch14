package Primitives;

public class Practice1 {

    public static void main(String []args){
        //byte, short, int, long, float, double, char, boolean

        byte b1=127;
        //higest 128
        System.out.println(b1);

        byte b2=-128;
        System.out.println(b2);

        byte b='C';//67, it works based on ASCII table and we need to put in ''
        System.out.println(b);

        short sh1 =1;  //short is similar to char and short is for small numbers
        System.out.println(sh1);
        System.out.println(b1 + b2+ sh1);

        int i1=23;

        //you can use underscore to separate digits for more readability
        long l1=10_000_000_000L; //we need to put for long value at the end L any kind of l upper or lower case


        float f1= 2.3F; //you need to put letter f or F when you create float date type for decimal numbers
        System.out.println(f1);  //2.3
        //float is 32 bit

        double d1=3.4; //double is 64 bit; differences between float and double if you
        // want to get as precise
        double d2=3.4d;
        System.out.println(d1);
        System.out.println(d2);

        double d3=10;//10.0  //it is bc cant store as
        int i2=10;
        System.out.println(d3);
        System.out.println(i2);

        float f2=5;
        System.out.println(f2);//5.0
        float f3= 5.1f;

        System.out.println(   Byte.MAX_VALUE);    //???
        System.out.println(    Byte.MIN_VALUE);
        //show max and min values for int
        System.out.println( Integer.MAX_VALUE);
        System.out.println( Integer.MAX_VALUE);

    // int result=number*5; not going to work  ???





    }
}
