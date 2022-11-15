package ArrayList;

import java.util.ArrayList;

public class Computer {

        /*
         create a computer class
         --fields of:
         brand, model, price, color, screen size
         --create a constructor to initialize instance fields

         create a test class

         have 4 computer objects
         store computer objects in a list

         >!> find the total cost of computers

          make    model       price   screen
 apple      macbookpro  1500    13.5
 apple      macbookpro  2000    16
 HP         Envy        1100    15.0
 Lenova     ThinkPad    1800    16

         */

    String brand, model, color;
    double price, screensize;

    public Computer(String brand, String model, String color, double price, double screensize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.screensize = screensize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", screensize=" + screensize +
                '}';
    }

    public static double totalpPiceCalculator(ArrayList<Computer> computers) {

        double totalPrice = 0;
        for (int i = 0; i < computers.size(); i++) {
            totalPrice = totalPrice + computers.get(i).price;
        }
        return totalPrice;

    }


    //create a method that will take show only price of HP computers from the list of Computers

    public static void HPprice(ArrayList<Computer> computers) {

        for (Computer device : computers) {
            if (device.brand.equals("HP")) {
                System.out.println("HP price: " +device.price);
            }
        }







        }
}

