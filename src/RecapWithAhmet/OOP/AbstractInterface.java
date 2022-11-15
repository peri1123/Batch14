package RecapWithAhmet.OOP;

public class AbstractInterface extends AbstractPractice{

    @Override
    public void run() {
        System.out.println("Dismiss time for Ahmets class");
    }
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is abstract? and can you clarify it  with-bit details?
    *Abstract is way to organize the methods with only necessary information.
    It means people can see the template of the methods and override this based on their requirement
    *****WE do not have a body for abstract methods every class which extends to the abstract class can
    MAKE THEIR OWN IMPLEMENTATION by overriding


    2- Why do you need to have abstract class in your project?
    *For many methods, we need developers to make their own implementation in the company.
    So they can create abstract class with the TEMPLATE the specific methods and let people call it
    based on their requirement(override and do implementation)

    3-Where do you use abstract class in your project?
    I would definately say that I use General OOP concepts of abstract class

    4-Can you create an object from abstract class? If no, how are you going to  access all the methods and variables from that class?
    No, you can't create an object from abstract class. I will extend the class and override the method (inheritance)



    5-CAn you have normal and abstract method inside the abstract class?
    Yes you can have both under abstract class

    POSSIBLE interview questions:
    1-What is interface?
    -->Interface is blueprint of the object like class which has special methods that can be overridden to make new implementation
    -->We use implement keyword to make the class connected with INTERFACE.


    2-Why do you need interface if you have abstract?
   ***Because interface have more features in terms of accessing in multiple parents at the same time by overriding the methods***

    3-What is the difference between abstract  and interface?******* THE MOST COMMON QUESTION *********
    INTERFACE:
    1-interface is declared with "interface" keyword
    2-interface can have only public abstract methods(SHOW OFF-->default keyword --> create reqular method )
    3-to make a connection with interface, we need to use "IMPLEMENT" keyword
    ****4-In interface you can implement the class as many as you want (we can have multiparents) and extends keyword (should come first)
    --it means on class can implement  multiple interface (parents)
    5-When you initialized a variable in interface as a default it is final static
    6-Methods must be public abstract
    7-Interface can not have CONSTRUCTOR

    ABSTRACT:
    1-Abstract class declared with "abstract" keyword
    2-Abstract may or may not have regular methods
    3-to make a connection with abstract class, we need to use "EXTENDS" keyword
  ****4-In abstract you can extend the class ONCE.(one extension from the class to the abstract
  5-When you declare a variable in abstract there is no default keyword. Meaning can have final, static and non static variables
  6-You can have any access modifiers
  7-Abstract can have CONSTRUCTOR






     */
    public static void main(String[] args) {




    }


}
