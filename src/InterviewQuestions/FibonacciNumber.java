package InterviewQuestions;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a=0, b=1, c;
//        for (int i=0; i<10; i++){
//            System.out.print(a+" ");
//            c=a+b;
//            a=b;
//            b=c;

      printnum();

        }

    public static void printnum(){
        int a=0, b=1, sum=0;
        for (int i=0; i<10; i++){
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;

        }


    }

}
