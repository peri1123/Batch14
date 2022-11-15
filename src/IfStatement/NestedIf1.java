package IfStatement;

public class NestedIf1 {
    public static void main(String[] args) {
        boolean mypassport = true;
        boolean myvisa = true;

        if (mypassport == true) {//true

            System.out.println("Good you have passport, now we are checking visa");//will show
            if (myvisa == true) {//true
                System.out.println("Good you can travel now");//true, show

            } else {
                System.out.println("You need to have a visa to travel");
            }
        } else {
            System.out.println("You need to have a passport FIRST");


        }




    }

}
