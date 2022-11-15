package RecapWithAhmet;

public class TernaryOperator {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-there is no directly questions about that, but it is good to use during the interview
    instead of if conditions.
    TIPS: If you are having lots of conditions (if,else if,else if, else if,else if else)
    TIPS2: If you have a simple validation (condition(one-two)--> Then ternary operators

     */
    public static void main(String[] args) {
        int num=46;
        int num2=35;

        String value=num>num2 ? "Number is bigger" : "Number2 is bigger";
        System.out.println(value);
        System.out.println(num>num2?"number is bigger":56);

//        if(num>num2){
//            System.out.println("number is bigger");
//        }else{
//            System.out.println("number2 is bigger");
//        } // if we are going to use if else use ternary bc
    }
}
