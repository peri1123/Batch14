package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1=1;
        byte b2=2;
       int result=b1+b2;

        // byte result=b1+b2; it won't accept bc of data type
        //3 compile time error.Smaller data types byte, short aut

        short sh1=3;

        //short result2=sh1+b2;

        int result2=sh1+b2;
        System.out.println(result);
        System.out.println(result2);

        float fl1=4.5f, fl2=1.2f;
       float result3= fl1+fl2;

       double db1=2.3;
      double result4=db1+fl1;
        System.out.println(result4);
       //float=db1+fl1;-->wont take bc java will take the larger one



    }
}
