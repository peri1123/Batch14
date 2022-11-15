package ArrayList;

import java.util.ArrayList;

public class DrinksTest {
    public static void main(String[] args) {
        Drinks dr1=new Drinks("yellow", "fresh juice","large", 2.99 );
        Drinks dr2=new Drinks("red", "fresh red","small", 4.99);
        Drinks dr3=new Drinks("green", "green apple","meduim", 1.99);

        ArrayList<Drinks> drinksList= new ArrayList<>();
        drinksList.add(dr1);
        drinksList.add(dr2);
        drinksList.add(dr3);
        System.out.println(drinksList);

        Drinks.totalPrice(drinksList);

        Drinks.priceOfFresh(drinksList);

       Drinks.priceOfGreen(drinksList);





    }
}
