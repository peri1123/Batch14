package ArrayPractice;

import java.util.Arrays;

public class sortPractice {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 34, 7, 12, 100, 35, 8, 1, -9, 23};

        //printing b4 sort
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        //printing After sort
        System.out.println(Arrays.toString(numbers));

        //find the largest number from given array
        System.out.println(numbers[numbers.length - 1]);
        //find the smallest number form given array
        System.out.println(numbers[0]);//9

        System.out.println(numbers[5]);

        String[] donuts = {"vanilla", "strawberry", "chocolate", "nutella"}; // if it comes with sort  ot will be nullpointerexception
        //printing before sort
        System.out.println(Arrays.toString(donuts));

        Arrays.sort(donuts);
        //printing AFTER sort
        System.out.println(Arrays.toString(donuts));

        //make every donut as uppercase and store them into another donut array and print if the donuts name longer than 7 letters
        String[] newDonut = new String[donuts.length];
        for (int i = 0; i < donuts.length; i++) {

            newDonut[i] = donuts[i].toUpperCase();
            //{"vanilla", "strawberry", "chocolate", "nutella"}; ==> to upperCase
            if (newDonut[i].length() > 7) {
                System.out.println(newDonut[i]);

            }

        }


    }
}


