package Inheritance;

public class Animal {
    String color;
    int age;
    String name = "FLUFFY";//this will affect to everybody, to child, to grand child


    public void eat() {
        System.out.println("animal is eating");
    }


    public void sleep() {
        System.out.println("animal is eating");
    }


    public Number energyAmount(int foodAmount){
        System.out.println(name+ "> energy is " + foodAmount*100);
        return foodAmount*100;
    }





}