package Tasks;

import java.util.Arrays;

public class Task1 {
    public static void arrayStar(String []array){
        try{

            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]+"**");
            }

        }catch(ArrayIndexOutOfBoundsException indexOutOfBoundsException){
            indexOutOfBoundsException.getMessage();
            indexOutOfBoundsException.printStackTrace();
        }

    }

    public static void main(String[] args) {

        System.out.println("Working task");
        String array[]={"John","Matt","Sara"};
        arrayStar(array);

        System.out.println("Completed Task");
    }

}
