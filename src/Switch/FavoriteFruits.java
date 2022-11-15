package Switch;

import java.util.Scanner;

public class FavoriteFruits {
    public static void main(String[] args) {
        /*you own a fruit store and you have following in the store
               --> strawberry, apple, kiwi, banana,orange,grape ask user for their favorite fruit

                if you have it..>> we have your favorite ... in our store
                if you do not have it --> we are sorry, we do not have favorite... in the store
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your fruit name?");
        String fruit= input.nextLine().toLowerCase();
        switch(fruit){
            case "strawberry":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "apple":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "kiwi":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "banana":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "orange":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "grape":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            default:
                System.out.println("Sorry we do not have your fav " + fruit + " in our store");
                break;

        }



}
}

