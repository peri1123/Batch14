package Tasks;

import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
/*
Create the array size of 7 and store every number by asking user via scanner in the loop.
When asking user please use the text -> "Enter number for array" .
After having all numbers for array print ONLY the first unique value from this array.
If the array doesn't have any unique element print the text below
"Array doesn't have any unique element"
3  -> 3 is printed because array have [1,2,4,1,2,3,4] and first unique element from array is 3
 */
        Scanner scanner=new Scanner(System.in);
        int[] numbers = new int[7];
        boolean[] uniques = new boolean[7];

        for(int i = 0; i < 7; i++) {
            System.out.println("Please enter a value: \n" + "[" + (i + 1) + "]: ");
            numbers[i] = scanner.nextInt();
            uniques[i] = true;
            for(int j = 0; j < 7; j++) {
                if(numbers[i] == numbers[j] && i != j) {
                    uniques[i] = false;
                }
            }
        }
        int a,b=0;
        for (int i=0; i<numbers.length; i++){
            a=0;
            for (int j=0; j<numbers.length; j++){
                if(numbers[j]==numbers[i]){
                    a++;
                }
            }
            if (a==1){
                System.out.println(numbers[i]);
                b++;
                break;
            }
        }if(b==0){
            System.out.println("Array does not have a unique element");
        }












    }
}
