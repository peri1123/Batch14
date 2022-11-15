package ArrayPractice;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        String [][] states={{"NY","DE", "NJ"},{"IL", "WI", "IN","OH", "MI"},{"CA", "OR", "WA"}};
        System.out.println(Arrays.deepToString(states));
        //print each state one by one
       for (String[] state:states){
          for (String st:state){
              System.out.println(st);
          }
       }
        System.out.println("==============");
       for (int i=0; i< states.length; i++){
           for ( int j=0; j< states[i].length;j++){
               System.out.println(states[i][j]);
           }
           System.out.println("****"+ i);
       }

        System.out.println(Arrays.deepToString(states[0]));
        System.out.println(Arrays.deepToString(states[1]));
        System.out.println(Arrays.deepToString(states[2]));
        System.out.println("===============");
        for (String[] st1: states){
            System.out.println(Arrays.toString(st1));
        }

}
}
