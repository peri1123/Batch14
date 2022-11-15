package Primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {
        System.out.println(45==45);//true
        System.out.println('t'=='t');//true
        System.out.println('b'!= 'c');

        System.out.println("***********");

        //there is one event and only kids who are  age of 11 and younger can participate

        int ageofkid=7, requiredage=11;

        boolean canparticipate=ageofkid<=requiredage;
        System.out.println(canparticipate);

        //there is an event only whose age is 21 can attend

        int age=21, limit=21;
        boolean  canattend1=age!=limit;
        System.out.println(canattend1);

        //there is an event only whose age is 21 nad older can attend

        int limitation=21, age30;
        boolean cango=limitation<=age;
        boolean cango1=age>=limitation;
        System.out.println(cango==cango1);//true


        //there is one event and only kids who are  age of 11 and younger can participate

        int limitation1=11, kid1=6;
        boolean canpart= limitation1>=kid1;
        System.out.println("Can 6 years old parti?: "  +canpart);

        // only 21+
        int Age=21, anotherguy=18;
        boolean canotherpart=Age<=anotherguy;//false
        System.out.println("Can 18 years old participate?:" +canotherpart);

        int yellow=5, green=9;
        System.out.println(yellow<=green);





    }
}
