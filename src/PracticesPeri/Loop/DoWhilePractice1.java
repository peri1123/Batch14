package PracticesPeri.Loop;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        // "*****"--> for 5 times by using while loop
        int num=5, num1=0;

        while (num1<num){
            System.out.println("*****");
            num1++;
        }
        /////++++++do while////////
       // "*****"--> for 5 times by using do while loop
        // local variable: any variable in a block is called local variable.
        // Local variable are only accesIBLE IN THAT BLOCK

        int donum=0;
        do {
            //int num=0; num is a local variable and cannot be used after this block
            // that's not going to consider as a part of while and wont show in while
            System.out.println("Hello World");
            num++;

        }while (donum>5);

        int a=5, b=10, c=1;

        do{
            b--;
            System.out.println(c++ +". This is DO block");
            //we can do here c++;
        }while(a<=b); //


    }
}
