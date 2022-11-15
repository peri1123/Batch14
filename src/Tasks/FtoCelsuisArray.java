package Tasks;

import java.util.Scanner;

public class FtoCelsuisArray {
    public static void main(String[] args) {
        /*
        You have an array of weather conditions with Fahrenheit numbers.
  Print the Celcius value of each array element.
// NOTE: Be careful after every number there has to be comma(,) and space then the next number.
// Please look carefully for example.

  Example:
  Example fahrenheit array -> {22,45,62,50,-40,32,80}
  Expected Output ->
  -5.555555555555555, 7.222222222222222, 16.666666666666668, 10.0, -40.0, 0.0, 26.666666666666668
         */

        double[] fahrenheits = new double[]{32,21,0,-3,-40,32,80};
        double r1=0;
        for (int i=0; i< fahrenheits.length; i++){
           r1=(fahrenheits[i] -32)*5/9.0;
            System.out.println(r1);
        }

    }
}
