package PracticeNotes;

public class Notes {

    public static void main(String[] args) {
        /*
        Operator Precedence-they are vip

        int count=10+5; -->15
        int count1 10+5*3;-->25
        int count2=10*2-5*4; -->0

        int count3=10/2*3+7-11/2;  17 (it will be FCFS meaning from the left)

        int count4=10/2*3(+7-11)/2; =-2  //()--> vip



        Compound Assigment
        it will apply the operation first and ressigned it to the variable
        =, +=, -=, *=, /=, %=
        int number=3;
        int number1=number+2;=5
        number=number+2; <==> number+=2

        -----------
        int car=5;
        car=car+1; -->car+=;
        sout(car); -->6

        --------------
        int total=8;
        sout(total); -->8
        total+=car; short form <--total=total+car;
        sout (total);=14

       ---------
       int sandw=
      eat 11
      sandw-=11; -->sand=sand-11;
----------------
Numeric Promotion
*Smaller data types byte


byte b1=1;
byte b2=2;
int result=b1+2;
------------
numeric promotion
precedence-->order of operation
arithmetic operators
compound assignment
remainder/modulus


------8.23.2022.
Casting
int i=23;
byte b=i;--> compile error
byte b(byte) i;--< that's correct


short a1=1,a2=2;
short total1=a1+a2;--> compile error
short total1= (short)(a1+a2); if we are going to put() in this case we need two ()
1st () fill cover a1 only, to cover everything 2

explicit casting: user needs to do casting which means we can convert big DT to smaller DT with casting
implicit casting: java does it for user// from smaller DT to larger DT
FE:
int i=23;
double d=i;--<implicit casting: java does it for user
bc double is more has capability and we do not have to anything

long l1=23000;
int i1=(int) l1;user needs to do casting


======Pre====
Unary Operators
increment: increase meaning, smth going up
decrement: decrease meaning, smth going down

int number=5;

pre-increment: ++number;--> number is going up by 1 and it will be at 6
pre-decrement: --number; --> number is 5
-------------
Post
int count=10;
count++; --> //means after
count--; -->
FE:
get 12 donuts --> get discount for now
get 12 donuts --> discount for next time

=======Logical Negation==========
it makes a boolean condition to its opposite
FE:
boolean b=true;
sout (b);-->true
sout(!b);-->false  // boolean has a 2 conditions true or false

boolean b2= false;
!b2--> true;

boolean as  DT



















         */

int number=3;

        System.out.println("Peri's practice");
        int peri=129;
        byte peri2=(byte)peri;
        System.out.println(peri2);
        byte peri3=(byte)3200;
        System.out.println(peri3);

        long l1=2300;
        int l2=(int)l1;
            System.out.println(l2);

            int b1=12;
            double d2=b1;
        System.out.println(d2);

        //do we need to put '' for char if it is number

        int d3=5;
        int a=++d3;
        System.out.println(d3);
        System.out.println(a);//


        System.out.println("8.24.2022");

        /*compound assingments:

        unary operator: 2 ways:
        -increment
       pre and post
        int flower=10;
        ++flower; increase and use it
        flower++;--> use it first and increase it, it will

        -decrement
        pre and post
        int flower=10;
        ++flower; increase and use it
        flower++;--> use it first and decrease it

        Logical negation (!)
        when you use (!) front of boolean variable or boolean condition, it will make it opposite
        (true<-->false)
        diffence between  boolean variable or boolean condition:
        boolean b=true; //simple boolean
        (is number5 less than number 6)-->true //this is the condition of boolean
        if we put (!) it will be false, it is giving opposite answer


        =====================
        Comparison (relational) operators
        ==--> is 5 equal to 5--> 5==5 -->true
        !=--> is 5 not equal to 6--> 5!=6 -->true
              is 5 not equal to 5-->6!=6-->false

         > --> is 5 grater than 6-->5>6 --> false
         < --< is 5 less than 6 -->5<6 --> true
         >= --> is 5 grater or equal to 6-->5>= 6 false
         <=--> is 5 less or equal to 6 -->5<=6 true



       ===========Logical Operators==========

       &&-->AND
       ||-->> OR
       =============
       && AND
       visa and ticket
       boolean visa=true;
       boolean ticket=true;
       visa && ticket && (DL||passport)
       boolean
       ---------------------
       cash or credit
       boolean cash=false;
       boolean credit=true;
       cash || credit||check;













         */












}
}

