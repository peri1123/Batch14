package RecapWithAhmet;

public class GarbageCollector {
    /*
    1-What is garbage collector and where is it coming from ?
    It is a way of cleaning unused or useless data in the class from memory.
    --> it is coming from System


    2-How can you prove that gc is working?
    *to be able to prove you can OVERRIDE the finalize method.


    3-How can you make the element garbage?
    You can assign the value as null
    ->You can assign the reference of the element to the another elements

    4-Do you have to call gc to clean up your codes?(memory)
    -->No because it is working automatically



     */
    @Override
   public void finalize() throws Throwable {
        System.out.println("Garbage is working");
    }

    public static void main(String[] args) {

        Employee ahmet=new Employee();
        ahmet=null;
        System.gc();

    }
}
