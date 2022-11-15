package InterviewQuestions;

public class PerfectNumber {
    public static void main(String[] args) {

//        int num=7;
//        int sum=0;
//        for (int i = 1; i < num; i++) {
//            if(num%i==0){
//                sum+=i;
//            }
//        }
//
//        if(sum==num){
//            System.out.println(num+"is perfect");
//        }else{
//            System.out.println(num+"not");}

        perfectNum();
    }
    public static void perfectNum(){
        int num=13;
        int sum=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sum+=i;
            }
        }

        if(sum==num){
            System.out.println(num+" is perfect");
        }else{
            System.out.println(num+" not perfect");
        }

    }
}
