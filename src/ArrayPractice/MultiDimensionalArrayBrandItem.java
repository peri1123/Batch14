package ArrayPractice;

import java.util.Arrays;

public class MultiDimensionalArrayBrandItem {
    public static void main(String[] args) {
        /*!Computers
        "Apple", "Lenova", "HP", "Dell", "Acer"
        !TVs
        "Samsung", "LG", "Sony"
        !Speakers
        "Alexa", "Google", "Logitec", "JBL"
                --------------
        PRICES of ITEMS:
        !Computers
        Apple-2500, Lenova-1600, HP-1800, DEll-1900, Acer-1100
        2500,        1600,    1800,      1900,      1100
        !TVs
        Samsung-2199, LG-2199, Sony-1599
        2199,    2199,      1599
        !Speakers
        Alexa-79.99, Google-89.99, Logitec-64.99, JBL-55.99
        79.99,        89.99,         64.99,     55.99
// STORE Brand in a multidimensional array
// STORE Prices in a multidimensional array
// print out prices for each product as:
// "price for Apple is $2500"

         */
        double [][] prices={{2500,1600, 1800, 1900, 110},{2199, 2199, 1599,},{79.99, 89.99, 64.99,  55.99}};
        String [][] items={{"Apple", "Lenova", "HP", "Dell", "Acer"}, {"Samsung", "LG","Sony"},{"Alexa", "Google",
                "Logitec", "JBL"} };//another addition try peri
        String[] sections={"Computer", "TV", "Speakers"};

        for ( int i=0; i<items.length; i++){
            System.out.println("===" +sections[i] + "prices=====");
            for (int j=0; j<items[i].length; j++ ){
                System.out.println("Price for :" + items[i][j]+ "is :" + prices [i][j]) ;
            }

        }

        System.out.println("MultiDimentional []3");
        System.out.println("*************");
        int [][][]numbers={{{1,2,},{2,1},{5}, {5,4,6},{6,7}}};
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(numbers[0][0][0]);
        for (int [][] num1: numbers){
            for (int [] num2: num1){
                for (int num:num2){
                    System.out.println(num);
                }
            }
        }
        System.out.println("Traditional loop");
        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers[i].length; j++){
                for (int k=0; k<numbers.length; k++){
                    System.out.println(numbers[i][j][k]);
                }
            }
        }
    }
}
