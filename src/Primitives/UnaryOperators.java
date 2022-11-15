package Primitives;

public class UnaryOperators {

    public static void main(String[] args) {
        int cost=12;
        System.out.println(cost);

         ++cost;//13
        System.out.println(cost);

        --cost;
        System.out.println(cost);//12
        //=======
        System.out.println("=====");
        System.out.println(++cost);

        System.out.println("====");
        System.out.println(cost++);// it will stay at 13 and when you use it next time it will be 14;

        System.out.println("*****");
        System.out.println(cost);


        System.out.println("________");
        int number=4;
        --number;
        System.out.println(number);//3
        number--;
        System.out.println(number);//2

        System.out.println(--number);//1 //listen right there

        System.out.println(number--);//shows 1, but the number is 0
        int product=5*number;
        System.out.println(product);

        //++product++; we cannot
        ++product;
        System.out.println(product);

        int peri=4;
        --peri;//3
        System.out.println(peri);
        peri--;//3
        System.out.println(peri);//2
        System.out.println(--peri);//1



    }
}
