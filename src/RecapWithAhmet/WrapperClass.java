package RecapWithAhmet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is wrapper class?
    It is a way (process) to convert data into different forms.
    ->Primitive data ->Object //Autoboxing
    ->Object data ->Primitive //Unboxing

    2-How many ways of wrapper class do you know?
    *hey sir/boss/king,
    I know there are two main ways to do it:
    -->conversion from primitive to object-->Autoboxing
    -->conversion from object to primitive -->Unboxing
    *they will definately ask for example
    TIPS:TO be able to keep it in your mind properly. Always think about the keyword of
    AUTO --> it means it is happening by itself you do not need to use any methods or take any actions to convert (primitive
    to the object

    -->to be able to figure out Unboxing  think that you need to take actions on it means you need to use methods(parsing)

    ***NOTe:String value of is not a part of wrapper class

    Example:


     */
    public static void main(String[] args) {
        //AutoBoxing
        List numbers=new ArrayList<>();
        int number=1;
        numbers.add(number);
        numbers.get(0);
        //unboxing it is
        String number2="5";
        int num=Integer.parseInt(number2);

        int a=50;
        Integer a2=a;
        System.out.println(a2);








    }
}
