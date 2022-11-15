package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice3RemoveMethod {
    public static void main(String[] args) {
        List<String> drinks = new ArrayList<>();
        drinks.add("Smoothie");
        drinks.add("Coffee");
        drinks.add("Smoothie");
        drinks.add("Coke");
        drinks.add("Smoothie");
        drinks.add("Smoothie");
        drinks.add("Hot chocolate");
        System.out.println(drinks);//[Tea, Coffee, Water, Coke, Milk, Smoothie, Hot chocolate]

        //remove();
        drinks.remove("Smoothie");//removing smoothie
        System.out.println(drinks);//[Tea, Coffee, Water, Coke, Milk, Hot chocolate]
        System.out.println(drinks.size());//6

        // remove all the same(Smoothie) items from the list
        for (int i=0; i<drinks.size(); i++){
            if(drinks.remove("Smoothie")){
                System.out.println(drinks);
            }
        }
        System.out.println("Different way");

        for (int i=0; i<drinks.size(); i++){
            if(drinks.get(i).equals("Smoothie")){
                drinks.remove(i);
                i--;
            }
        }System.out.println(drinks);

        System.out.println("Another way");

        for (int i=0; i<drinks.size(); i++){

                drinks.remove("Smoothie");

        }System.out.println(drinks);







    }
}
