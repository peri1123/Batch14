package Primitives;

public class IndividualPractice {
    public static void main(String[]args){

        boolean IsItgood=true;
        System.out.println(IsItgood);

        boolean IsMylifeisawsome=false;
        System.out.println(IsMylifeisawsome);

        char symbol11=99;
        int result2=symbol11+1;//how come? we just can not declare with different type of data?
        System.out.println(result2);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);


        int x=5/2;
        System.out.println(x);

        int x1=((5+3)/2)*3;
        System.out.println(x1);




        System.out.println("GreenPower Task3");


        float inch=2000.0F;
        double inch1=0.0254;
        double meters=inch1*inch;
        System.out.println("Peri"  + meters);

        double inch3=2000.0*0.0254;
        System.out.println("peri" + inch3);
        double meters1=inch3;
        System.out.println("meter is:" + meters1);

        System.out.println("Task 5");


        double quarter=5*0.25;
        double dimes=4*0.10;
        double nikcles=3*0.05;
        double pennies=2*0.01;
        System.out.println(quarter);
        System.out.println(dimes);
        System.out.println(nikcles);
        System.out.println(pennies);
        System.out.println(quarter+dimes+nikcles+pennies);

        System.out.println("Task4");


        int daysyear=60*24*365;
        int totalmins=3456789;
        int days=365;
        System.out.println(daysyear);
double totalmins1=totalmins/daysyear;
        System.out.println(totalmins1);//6
        double totalyears=totalmins1%365;
        System.out.println(totalyears);
        System.out.println();






        int givenmins=3456789;
        int numberofhours = givenmins/60;
        System.out.println(numberofhours);//57613
        int numberofdays = numberofhours/24;
        System.out.println(numberofdays);//2400
        int numberofyears =numberofdays/365;
        System.out.println(numberofyears);//6
        int remaindays=numberofdays%365;
        System.out.println(numberofyears+ "and" +remaindays);

        int givenmins2=3456789;




































    }
}
