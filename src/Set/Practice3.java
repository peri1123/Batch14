package Set;

import java.util.HashSet;
import java.util.Set;

public class Practice3 {
    /*
    Character[] array = {'a', 'R', 'e', 'u', 'r', 'e', 'a', 'd', 'y'};
create a method that will take that given Character array
-this method will store elements to a set collection
-this method should return the set with all unique elements
     */

    public static Set convertToSet (Character [] array ){
        Set <Character >resultSet= new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            resultSet.add(new Character(array[i]));

        }
        return resultSet;
    }

    public static void main(String[] args) {
        Character[] array1 = {'a', 'R', 'e', 'u', 'r', 'e', 'a', 'd', 'y'};
        convertToSet(array1);
        System.out.println(convertToSet(array1));
    }

}
