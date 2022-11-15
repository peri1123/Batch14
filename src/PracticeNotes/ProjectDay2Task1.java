package PracticeNotes;

public class ProjectDay2Task1 {
    public static void main(String[] args) {

        int givennumber=578432, originalNumber=givennumber;
        int digit1=givennumber%10;
        int digit2=givennumber/10;
        System.out.println(digit1);//2
        System.out.println(digit2);//57843

        int digit3=digit2%10;
        int digit4=digit2/10;
        System.out.println(digit3);//3
        System.out.println(digit4);//5784

        int digit5=digit4%10;//4
        int digit6=digit4/10;//578
        System.out.println(digit6);

        int digit7=digit6%10;//8
        int digit8=digit6/10;//57

        int digit9=digit8%10;//7
        int digit10=digit8/10;//5

        int digit11=digit10%10;
        System.out.println(digit11);

        int sum=digit1*digit3*digit5*digit7*digit9*digit11;
        int sum2=digit1+digit3+digit5+digit7+digit9+digit11;
        System.out.println("The sum of is " +sum);
        System.out.println("The sum of is " +sum2);

        System.out.println("Task2");

        int num=327695;
        int result=num%10;
        num=num/10;
        System.out.println(num);

        int result1=num%10;
        num=num/10;
        System.out.println(num);
        System.out.println(result1);

        int result2=num%10;
        num=num/10;
        System.out.println(num);

        int result3=num%10;
        num=num/10;
        System.out.println(num);

        int result4=num%10;
        num=num/10;

        int result5=num%10;
        System.out.println(result5);

        int multi=result*result1*result2*result3*result4*result5;
        System.out.println(multi);
        System.out.println("The multipication is >>" +multi);
        int addition=result+result1+result2+result3+result4+result5;
        System.out.println("The sum is " +addition);







    }
}











