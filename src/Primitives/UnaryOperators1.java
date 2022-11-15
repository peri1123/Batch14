package Primitives;

public class UnaryOperators1 {
    public static void main(String[] args) {
        int a,b=7, c=10;
        a=++b+c++;//11
        ++c;

        System.out.println("a is" +a);//18

        int result=a*2+ ++c; //36+ ++c=12
        System.out.println(result);//48

        System.out.println(++c + c++);//26

        System.out.println(c);//14 bc of there ++++

        int result2= b++ + b++ - --b; //9+8=17
        System.out.println(result2);






    }
}
