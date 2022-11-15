package Blocks;

public class Practice {

    /*
    System.out.println("===========Blocks===========");
    {}- instance block>> it will work for each object, when object is created
    static {} static variable- belong to the  class, it will work 1st thing for that class and only one time


    instance variable--> will work with the individual
    static variable-->
     */

    String str1;//not static can go to non static
    static int num;//static can go to static easily
    {
        str1="Test";
        num=25;

        System.out.println("Intstance Block"+num);

    }

    static {
        num=34;

        System.out.println("Static blocks");

    }

}
