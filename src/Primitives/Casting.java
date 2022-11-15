package Primitives;

public class Casting {
    public static void main(String[] args) {

        //casting:when you convert larger type to smaller DT
        //from decimal DT to whole number DT

        int number1=11;
        //byte bt1=number1; as is it will give CTE

        byte bt1= (byte) number1;//casting
        System.out.println(bt1);

        byte bt2=(byte) 3200;
        System.out.println("bt2-->" +bt2);

        byte bt3=2, bt4=6;
        //byte total1=bt3+bt4; it will CTE
        byte total1=(byte) (bt3+bt4);// casting

        //from decimal DT to whole number DT
        int num1=(int)4.5;// just put whatever DT you are looking for as a casting
        System.out.println("num1 -->" +num1);

        double moneyWithCents=10.25;
        int money= (int)moneyWithCents;
        System.out.println(money);




        char letter='A';//65 from the table

        short numberForLetter=(short) letter;


        int i3=34;
        double d4=i3;// double can storage int
        // implicit casting, java does it for us behind the screen












    }
}
