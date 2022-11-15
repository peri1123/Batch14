package OOP;

public class Car {
    String make;
    String color;
    double price;
    int year;

    public Car(){
        System.out.println("No Argument constructor");

    }
    public Car (String make, String color, double price){
        this.make=make;
        this.color=color;
        this.price=price;


    }
    public Car(String make, String color, double price, int year){
        this(); //calling argument constructor if we have parameter we need to pass them
        this.make=make;
        this.color=color;
        this.price=price;
        this.year=year;


    }
}
