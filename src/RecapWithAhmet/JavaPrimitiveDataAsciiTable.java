package RecapWithAhmet;

public class JavaPrimitiveDataAsciiTable {
    /*
    Possible interview questions:
    1-What is java and what is JDK,JVM,JRE? (indian style)
    2- What do you know about JdK,JVM,JRE?(American Style)
    TIPS: B4 INTERVIEW CHECK THE NAME OF INTERVIEWERS
    to make yourself for the style questions?

    *Java is a programming language.
    *I use the components of Java a lot during implementation:
    JDK --> is a java development kit that has some libraries which supports the application development.
    JVM--> is a virtual machine which is responsible converting the byte codes to Binary code (1,0)
    JRE--> is a java runtime environment.*** mention about it a little more
    It is responsible for ***EXECUTION***.



    Primitive data:
    *Whole Numbers:        *Decimal Numbers:          Condition:         Char:
    -int                     -float  (f)              -boolean         char
    -byte                    -double (d)<d is optional
    -short
    -long(l)

    short a=5;
    short b=6;
    short c=a+b-2;
    sout(c)//run time error


    THE CORRECT WAY TO MAKE IT WORK
    short a=5;
        short b=6;
        short c=(short) (a+b-2);
        System.out.println(c);



    *ASCII TABLE:Is a table that contains all  the characters, numbers, letters, symbols etc..









     */
    public static void main(String[] args) {
        short a=5;
        short b=6;
        short c=(short) (a+b-2);
        System.out.println(c);



        char letter=65;
        char letter2='g';
        int number=(char)('g');
        System.out.println(number);//103
        System.out.println(letter2-letter);//38
        System.out.println(letter2);//g
        System.out.println(letter);//A




        }
    }




