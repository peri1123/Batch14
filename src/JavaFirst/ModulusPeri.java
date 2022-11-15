package JavaFirst;

public class ModulusPeri {
    public static void main(String[] args) {

        int number=123;
        int digit1=number%10;//3
        number=number/10;
        System.out.println(number);//12

       int digit2=number%10;
        System.out.println(digit2);//2
        number=number/10;
        System.out.println(number);

        int digit3=number%10;
        System.out.println(digit3);
        System.out.println(digit1+digit2+digit3);

        int number2=111;
        int D1=number2%10;//1
        number2=number2/10;//11
        System.out.println(number2);

        int D2=number2%10;
        number2=number2/10;
        System.out.println(number2);

        int D3=number2%10;
        number2=number2/10;
        System.out.println(number2);
        System.out.println(D1+D2+D3);

        int GivenNumber=567;
       int Peri=GivenNumber%10;//7
     int Per1=GivenNumber/10;//56
        System.out.println(Peri);
        System.out.println(Per1);

        int Peri1=Per1%10;//6
        int Per2=Per1/10;//5
        System.out.println(Peri1);
        System.out.println(Per2);

        int Peri2=Per2%10;
        System.out.println(Peri2+Peri1+Peri);

        System.out.println("GivenTask111");
        int key=111;
        int m1=key%10; //1
        int d1=key/10;//11
        System.out.println(d1);

        int m2=d1%10;//1
        int d2=m2/10;
        System.out.println(m2);

        int m3=d2%10;
        System.out.println(m1+m2+m3);//????


        System.out.println("GivenNumber215");
        int givennum=215;
        int modulus=givennum%10;//5
        int division=givennum/10;//21

        int modulus1=division%10;//1
        int divison1=division/10;//2

        int modulus2=divison1%10;
        System.out.println(modulus*modulus1*modulus2);
















    }
}
