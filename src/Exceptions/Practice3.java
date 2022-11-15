package Exceptions;

public class Practice3 {
    public static void main(String[] args) {
        //throw--> to throw a new exception
        int money =100;
        int price=200;

        if (money<price){
            throw new RuntimeException();
        }


    }
}
