package ArrayList;

import java.util.ArrayList;

public class TaskAddLnames {

        /*
        create a method that will take an arrayList as a parameter:.>> arrayList should contain String elements
        this method will create message  for given last names as:
        "MR./S ..... you are welcome to List usage!"
         */

    public static void messageCreator(ArrayList<String> lNames){
        for (String name:lNames){
            System.out.println("MR./S" +lNames + "you are welcome to List usage!");
        }

    }

    public static void main(String[] args) {

        ArrayList<String>abc=new ArrayList<>();
        abc.add ("Smith");
        abc.add("Browm");
        messageCreator(abc);

    }








}
