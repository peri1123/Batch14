package Loops;

public class WhilePractice1 {
    public static void main(String[] args) {
        System.out.println("Lets do it");

        System.out.println("=================");
        //print out 10 times
        int count= 0;

        while (count<10){//it will stay forever if we won't update the condition
            System.out.println("Lets do it");
            //update the condition
            ++count;//changing condition is important bc it will keep running until memory will be full

            //break will break down everything, it will give
        }
        //we need to give limit otherwise it will be forever
        System.out.println(count);//10 how come?

        while (count>0){
            System.out.println("It is Tuesday night");
            count--;
        }
        System.out.println(count);
        //1.I did it
        //2.I did it
        //3.I did it
        //....15

        int num=1;
        while (num<16){
            System.out.println(num+ ". I did it ");
            num++;
        }

    }
}
