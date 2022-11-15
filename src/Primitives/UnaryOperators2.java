package Primitives;

public class UnaryOperators2 {

    public static void main(String []args){

        int flower=10, vase=15, liter=2;

       int result= (flower-- + --vase *++liter)/2;// flower-- it is 10, but next time it will be 10
        System.out.println(result);//26

        int result2=liter++*2*flower+vase;//flower is 9 and became 10
        System.out.println(result2);//68













        int flowers=10, vases=15,liters=2;

        int perisresult=(flowers-- + --vases * ++liters)/2;

        System.out.println(perisresult);//26

        int periresult2=liters++ *2 * flowers++ + vase;//
        System.out.println("peri's result" + periresult2);








        int pen=16, pencils=10, box=2;
        int inboxes=(++pen *pencils-- / ++box)/2;
        System.out.println(inboxes);//28



       /*
        int phones=50, tripod=55, cases=49, cards=25, box2=30;

        int cases1=cases++;
        int tripods=tripod++;
        System.out.println("final is:" + cases);//50
        System.out.println("final is:" + tripods);//56

        int totalamount=(phones-- + ++tripod + cases++ + (--cards / ++box2))/box2;//is box 30 or 31?
        System.out.println(totalamount);//5
*/











    }
}
