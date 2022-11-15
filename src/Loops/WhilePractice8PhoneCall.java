package Loops;

public class WhilePractice8PhoneCall {
    public static void main(String[] args) {
        /*
        you have $40 in your phone call account each call cost 5$
        print --> "you can make.. calls with your money"
        show how much money you have left after each call
         */
        int total=40, cost=5, totalcall=0;
        while (total>0){
            totalcall++;
            total-=cost;
            System.out.println("after making call your money is :" + total);
            System.out.println(totalcall+ ".iteration for while loop");
        }
        System.out.println("You can made "+  totalcall+ "calls" );


    }
}
