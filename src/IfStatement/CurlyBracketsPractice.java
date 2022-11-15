package IfStatement;

public class CurlyBracketsPractice {
    public static void main(String[] args) {
        int a=5,b=3;

        if(a != b)
            a++;
            b++;
            a= a+b;
            int c=a;
        System.out.println("value of c is " + c);

        if (a>b)
            c=a*b;
        else System.out.println("This is wrong");
        System.out.println("value of c is now>" +c);

    }
}
