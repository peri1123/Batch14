package RecapWithAhmet;

public class Exception {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-How do you handle the exception?
    -->We can handle the exception with TRY And catch, THROWS.

    2-Can you use more than one catch block? How about try block?
    -->We can use as many as catch block after try.
    -->Try block can be used only once

    3-What do you know about FINAL<FINALIZE<FINALLY?
    -->Final-->is a keyword to make the variable or method unchangeable(last version)
    -->Finalize is a method which works with garbage collector to make sure it is manually
    worked(System.GC)
    -->Finally-->is a block that comes after try and catch block to do final execution
    -->Example: I have to connect to the database before the codes are executed then I must disconnect
    from database for security purpose.What i do is:
    -->I connect the database
    -->The codes are executed
    -->Under finally block{database.disconnect}--> It will be executed no MATTER WHAT EVEN your test fail.

    4-What is difference between Throw and throws?
    Both THROW and THROWS are the concepts of exception handling in which throws I used to explicitly (out of block) throw an exception from a method or any block of
    -->public void exception() throws ArithmeticOperator
    public void exception2(){
    new throw ArithmethicOpertor

    ***While THROWS are used next to the method signature
    **THROW is used inside the block

    }

     */

}
