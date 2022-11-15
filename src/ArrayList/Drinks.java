package ArrayList;

import java.util.ArrayList;

public class Drinks {
    String color, type, size;
    double price;

    public Drinks(String color, String type, String size, double price) {
        this.color = color;
        this.type = type;
        this.size = size;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Drinks{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public static double totalPrice(ArrayList<Drinks> drinksList) {
        double price = 0;
        for (int i = 0; i < drinksList.size(); i++) {
            price = price + drinksList.get(i).price;
        }
        System.out.println(price);
        return price;
    }

    public static void priceOfFresh(ArrayList<Drinks> drinksList) {
        for (Drinks drinksFresh : drinksList) {
            if (drinksFresh.type.equals("fresh juice")) {
                System.out.println(drinksFresh.price);
            }

        }

    }

    public static void priceOfGreen(ArrayList<Drinks> drinksList) {
        for (Drinks greeenPrice : drinksList) {
            if (greeenPrice.type.equals("green apple")) {
                System.out.println("The price of green is" + greeenPrice.price);
            }
        }
    }

    public  static void cheapest(ArrayList<Drinks> drinksList){
        double cheapestDrink1=drinksList.get(0).price;
        for (Drinks cheapestDrink:drinksList){
            if(cheapestDrink.price<cheapestDrink1){

            }
        }

    }
}
