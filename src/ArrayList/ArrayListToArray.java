package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList <String> cities=new ArrayList<>();
        cities.add("Chicago");
        cities.add("Columbus");
        cities.add("Springfield");

        System.out.println(cities);

        Object [] cityInArray=cities.toArray();
        System.out.println(Arrays.toString(cityInArray));

        cityInArray[0]="LA"; //reassigning []
        System.out.println(Arrays.toString(cityInArray));

        System.out.println(cityInArray.length);//3 we can not add more elements in array bc it was already fixed

        cities.add("Denver");
        System.out.println(cities);
        System.out.println(cities.size());// we can change the size in object


        ArrayList<String> numbers= new ArrayList<>();
         numbers.add("21");
         numbers.add("29");
         numbers.add("31");
        System.out.println(numbers);


        String num1[]={"1","2", "4"};
        List<String> num= Arrays.asList(num1);
        System.out.println(num);






    }

}
