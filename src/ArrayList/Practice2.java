package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();//List parent type,ArrayList is child list

        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("red");
        colors.add("blue");
        colors.add("pink");

        //size()
        int size=colors.size();
        System.out.println(size);//5
        System.out.println(colors);//[red, yellow, red, blue, pink]

        colors.get(1);// will take only one index number
        System.out.println(colors.get(1));//yellow
        String str1=colors.get(1);
        System.out.println(str1.toUpperCase());//YELLOW


        //reach out every color in the ArrayList and print them out as upper case
       for (String str2: colors){
           System.out.println(str2.toUpperCase());
       }
        System.out.println("==================");
       for (int i=0; i<colors.size(); i++){
           System.out.println(colors.get(i).toUpperCase());
       }

        System.out.println("+++++++++++++++++=");
       int i=0;
       while(i< colors.size()){
           System.out.println(colors.get(i).toUpperCase());
           i++;
       }

    }
}
