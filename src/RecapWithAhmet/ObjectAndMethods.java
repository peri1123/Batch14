package RecapWithAhmet;

public class ObjectAndMethods {
    /*
    1.What is object? and tell me about its methods?
    ->Object is a representation of the class(blue print)-->DNA,Car or batch example
    -> there are many methods of object, but I am familiar with these:
    -->.equals()--> which is comparison of object
    -> .toString()->it turns the variable to the String(kind of convertion)(Arrays.toString to the understandable reading string)
    -->hashcode()->location of the object


    2.What is the difference between object and class?
    Class:is a blueprint/template which you can create as many as you like
    Object:is a representation /member of a class-> instance of a class(instance meaning object, instance variable means object variable)
    Class: One class I can have for one scenario(bmwCar,DNA)
    Object:Can be created as many as from the class
    Class:Declared with class keyword;
    Object: Declared with new keyword;


    3.How do you initialize the instance variables ?
    **There are different ways to initialize mostly I use
    ******->Constructor
          ->Methods(setter())
          ->Create an object then initialize
          ->Directly initialize from instance variable //mostly they initialize for final

    Tips: do not give the exact number


    4-What is the difference between instance and local variables?
    Instance variable:                              Local variable
    -Belong to the class                          -Belong to the blocks
    -as default null,0,0.0(it has default values)- No default values. They must be initialized,if we do not it will give compile time error
    meaning when we do not give value
    -has access modifiers(private, public, default) -It does not have access modifier


     */
    public static void main(String[] args) {
        String name="Ahmet";
        String name1="Mehmet";
        System.out.println( name.hashCode());//
        System.out.println(name1.hashCode());//-1994040788 String pool divided into positive side and negative side
        System.out.println(name.equals(name1));//false

        System.out.println();


    }
}
