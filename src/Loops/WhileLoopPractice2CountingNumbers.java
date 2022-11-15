package Loops;

public class WhileLoopPractice2CountingNumbers {
    public static void main(String[] args) {
        // print numbers between 20 and 30
        int number=20;
        System.out.println("number");
        while (number<=30){
            System.out.println(number);
        number++;
        }
        while (number<=50){
            System.out.println("Should start right here" + number);
            number++;
        }
        while (number==60){
            System.out.println("Airplane"+ number);
            ++number;
        }


    }
}
