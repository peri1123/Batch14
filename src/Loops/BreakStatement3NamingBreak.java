package Loops;

public class BreakStatement3NamingBreak {
    public static void main(String[] args) {
        for (int a=0; a<4; a++){
            System.out.println("+++"+a);
            System.out.println("------");
        for (int b=0; b<10; b++) {//inner will not go up, it will print only once which is 0 and will be printed depending on first condition
            //System.out.println("a is -->" + a);
            //b++; it will show 4 times 1
            System.out.println("b is b****" + b);
            break;
        }

        }

        System.out.println("======New Code========");
        for (int a=0; a<10; a++){
            System.out.println("a"+a);
            System.out.println("------");
            for (int b=0; b<10; b++) {
                System.out.println("b is b****" + b);
                if (a<2)break;// break belongs to inner loop

            }System.out.println(a);

        }

        System.out.println("$$$$$$$$$$$$$$$$");
        OUTER:
        for (int a=0; a<10; a++){
            System.out.println("a"+a);
            System.out.println("------");
            INNER:
            for (int b=0; b<10; b++) {
                System.out.println("b is b****" + b);
                if (b>2)break OUTER;//that means stop the larger loop

            }System.out.println(a);

        }
        System.out.println("");
        OUTER:
        for (int a=0; a<10; a++){
            System.out.println("a"+a);
            System.out.println("------");
            INNER:
            for (int b=0; b<10; b++) {
                System.out.println("b is b****" + b);
                if (b>2)break OUTER;//that means stop the larger loop

            }System.out.println(a);

        }






    }
}
