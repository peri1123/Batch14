package ArrayList;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1=new Computer("Apple", "Pro", "Gray", 1500,13.5);
        Computer c2=new Computer("Apple", "Air", "White", 1100,11);
        Computer c3=new Computer("HP", "Envy", "Light Gray", 1800,13.5);
        Computer c4=new Computer("Lenovo", "ThinkPad", "Black", 800,13.5);
        System.out.println(c4.price);
        System.out.println(c2.color);



        ArrayList<Computer> computers=new ArrayList<>();
        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);
        System.out.println("This is  list of computers:"+computers);
        double totalPrice=0;

       for (int i=0; i<computers.size(); i++){
           totalPrice=totalPrice+computers.get(i).price;
       }

        System.out.println("The worth of all computer is $"+totalPrice);

       //create a method that will find total prices of the computers and returns it

        System.out.println("The worth of all computer is :"+ totalPrice);

        Double total=Computer.totalpPiceCalculator(computers);
        System.out.println(total);

        Computer.HPprice(computers);




    }




}
