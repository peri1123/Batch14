package Loops;

public class InfiniteLoopPractice {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4 - 1;
        //below loop is infinite sonce condition is always true
        while (num1 != ++num2) {
            System.out.println("Java is getting hard");
        }
        System.out.println("after loop");//not seeing at all
    }
}