package OOP;

public class TestClass {
    static Bottle b1= new Bottle(true);
    static Bottle b2=new Bottle(16);

    public static void main(String[] args) {
        b1.usage(5);
        System.out.println(b1.LiquidAmountInBottle);//-5
        b2.usage(3);
        System.out.println(b2.LiquidAmountInBottle);//3

        System.out.println(b1==b1);
        System.out.println(b1==b2);
        Bottle b3=b1;
        b2=b3;
        System.out.println(b3==b1);

        System.out.println(b1.equals(b2));
        Bottle b4= new Bottle(16);
        System.out.println(b4.equals(b2));

       // b4=null;
        b1=null;
        //System.out.println(b4.size);
        System.gc();

        //Garbage Collector method it will help you get rid of null and help clean up

    }
}
