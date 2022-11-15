package Inheritance;

public class Garden {
    public static void main(String[] args) {
        Flower flower=new Flower("Red", "Small", 1);

        Rose rose=new Rose();
        System.out.println(rose.price);
    }
}
