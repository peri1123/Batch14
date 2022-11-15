package Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i+".Test");
        }
        System.out.println("Separation");
        for (int i=0; i<10; i++){
            if (i>3 && i<7){
                continue;
            }
            System.out.println(i+".Test");
        }
    }
}
