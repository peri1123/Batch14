package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice4AddSeason {
    public static void main(String[] args) {
        ArrayList<String>colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");

        List<String> seasons =new ArrayList<>();
        seasons.add("winter");
        seasons.add("fall");
        seasons.add("summer");
        seasons.add("spring");





        //addAll();
        colors.addAll(seasons);
        System.out.println(colors);//[green, blue, red, yellow, pink, winter, fall, summer, spring]
        System.out.println(colors.get(5));//winter

        colors.removeAll(seasons);
        System.out.println(colors);//green, blue, red, yellow, pink]

        //set()
        colors.set(2,"Orange");//they did take index 2 and replaced with  orange
        System.out.println(colors);//[green, blue, Orange, yellow, pink]

        System.out.println("Empty () Method");
        System.out.println(colors.size());
        //isEmpty()
        System.out.println(colors.isEmpty());//false

        //clear()
        colors.clear();//[] that means empty
        System.out.println(colors);

        System.out.println(colors.size());//0 since we cleared

        System.out.println(colors.isEmpty());//true since it is empty already




    }
}
