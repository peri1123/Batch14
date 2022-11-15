package ArrayList;

import java.util.List;

public class TaskFlower {

    /*
    create a flower class with fields:
    >>>>>color,type of the flower, size, price
    constructor to initialize instance  variables
    method to find cheapest flower from list of flowers

     */
    String color, type, size;
    double price;

    public TaskFlower(String color, String type, String size, double price) {
        this.color = color;
        this.type = type;
        //this.size = size;
        this.price = price;

        if (size.equalsIgnoreCase("small")|| size.equalsIgnoreCase("medium")|| size.equalsIgnoreCase("large")){
            this.size=size;

        }else{
            this.size="small";
        }}

    @Override
    public String toString() {
        return "TaskFlower{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public static void findCheapestFlower(List<TaskFlower> listOfFlowers){
        double cheapest=listOfFlowers.get(0).price;

            for (TaskFlower flower:listOfFlowers){
                if(flower.price<cheapest){
                    cheapest=flower.price;
                }
            }
            for (TaskFlower flower1:listOfFlowers){
                if (cheapest== flower1.price){
                    System.out.println(flower1.type);
                    System.out.println(flower1);
                }
            }

    }
}
