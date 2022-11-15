package RecapWithAhmet;

public class StaticAndInstanceBlock {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-WHAT is static keyword and why do you use it?
    Static as a keyword is a way to make the methods accessible *******WITHOUT creating and object from that class.
    The advantage of having static  keyword  is that you do not new extra lines of codes for object create
    1st The disadvantage of having static keyword "YOU CANNOT OVERRIDE THE STATIC METHODS"
    2nd- disadvantage You CANNOT CALL the non-static methods inside the static methods and

    2-What is static block?
    Static block - is a block that can be called once (ONE TIME IT WORKS)
    IT ALWAYS EXECUTES FIRST

    3-What is static variable?
    IT MAKES the variables belong to the class
    it is sharable (changeble/common)--> common for object
    it can be accessed by other classes without creating and object. Just with the name of class

    4-What is instance block?
    it is a block that can be called as many as you have objects (create)

    NOTE: If you are making variable or methods static, the suggested usage is calling
    with CLASSNAME.(COMPUTER SUGGESTION as well

     */
    static String name;
    String n1;


    public static void run(){
        System.out.println("I am running");
    }


    static {
        System.out.println("I am a static block");
        System.out.println("If you want to make a");

    }

    static {
        System.out.println("I am a second static block");

    }

    {
        System.out.println("I am a instance block");
    }


}
